package groupingexampe;

import org.testng.annotations.Test;

public class HotelSearch {
	
	@Test (groups= {"SmokeTest"})
	public void searchHotel() {
		System.out.println("I am in search hotel tc");
	}
	
	@Test (groups= {"SanityTest"})
	public void cancelBooking() {
		System.out.println("I am in cancel booking tc");
	}
	
	@Test
	public void refundPayment() {
		System.out.println("I am in refund payment tc");
	}

}
