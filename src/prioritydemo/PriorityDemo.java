package prioritydemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority=100)
	public void verifyCreateUser() {
		System.out.println("creating user");
	}
	
	@Test(priority=200)
	public void shouldEditUser() {
		System.out.println("editing user");

	}
	
	@Test(priority=450)
	public void deleteUser() {
		System.out.println("deleting user");

	}

}
