package configmethodsdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample {
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void bookATicket() {
		System.out.println("booking a ticket");
	}
	
	@Test
	public void cancelATicket() {
		System.out.println("cancelling the ticket");
	}
	
	@Test
	public void rescheduleATicket() {
		System.out.println("cancelling the ticket");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	

}
