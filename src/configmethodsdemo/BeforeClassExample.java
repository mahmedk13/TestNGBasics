package configmethodsdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassExample {
	
	
	@BeforeClass
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
	
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	

}
