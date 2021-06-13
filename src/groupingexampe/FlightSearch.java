package groupingexampe;

import org.testng.annotations.Test;

public class FlightSearch {
	
	@Test (groups= {"UAT, Regression"})
	public void searchFlight() {
		System.out.println("I am in search flight tc");
	}
	
	@Test (groups= {"UAT"})
	public void cancelFlight() {
		System.out.println("I am in cancel flight tc");
	}
	
	@Test
	public void rescheduleTkt() {
		System.out.println("I am in reschedule tkt tc");
	}

}
