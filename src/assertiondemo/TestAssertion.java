package assertiondemo;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion {
	
//	@Test
//	public void verifyTitle() {
//		
//		String actualTitle="abc";
//		String expectedTitle="abc1";
//		
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("assertion failed");
//		
//	}
	
	@Test
	public void verifyTitle() {
		
		String actualTitle="abc";
		String expectedTitle="abc1";
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("assertion failed");
		assertion.assertAll();
		
		//5 assertion passed, 1 assertion failed
		
		
	}
	
//	@Test
//	public void verifyCheckboxIsNotSelected() {
//		//WebElement chkbx = driver
//		//boolean f = chkbx.isSelected();
//		
//		
//		boolean f = false;
//		Assert.assertFalse(f);	
//	}
//	
//	@Test
//	public void failTheTestCase() {
//		Assert.fail();
//		System.out.println("failing the test case deliberately because admin record is not available");
//	}
//	
//	@Test
//	public void skipTheTestCase() {
//		
//		throw new SkipException("skipping the test case because env is prod");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
