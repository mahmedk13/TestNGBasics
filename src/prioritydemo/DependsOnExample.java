package prioritydemo;

import org.testng.annotations.Test;

public class DependsOnExample {
	
	
	
	@Test
	public void register() {
		System.out.println("registering the user xyz");
	}
	
	@Test (dependsOnMethods = "register")
	public void login() {
		System.out.println("login the user xyz");
	}
	
	@Test(dependsOnMethods = "login")
	public void bookATicket() {
		System.out.println("xyz user is booking the ticket");
	}
	
	@Test (dependsOnMethods = "bookATicket")
	public void logout() {
		System.out.println("xyz user logged out");

	}
	

}
