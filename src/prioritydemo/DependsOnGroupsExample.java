package prioritydemo;

import org.testng.annotations.Test;

public class DependsOnGroupsExample {
	
	@Test(groups="pre-booking")
	public void init() {
		System.out.println("init resources for booking ticket");
	}
	
	@Test (dependsOnGroups="pre-booking")
	public void bookATicket() {
		System.out.println("booking");
	}
	
	@Test(dependsOnGroups="pre-booking")
	public void payment() {
		System.out.println("payment");
	}
	
	//beforesuite, beforeclass, beforetest, beforemethod

}
