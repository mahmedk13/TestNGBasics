package beforesuiteexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoA {
	
	@AfterSuite
	public void afterTest() {
		System.out.println("I am insid after suite");
	}
	
	@BeforeSuite
	public void beforeTest() {
		System.out.println("I am insid before suite");
	}
	
	@AfterTest
	public void afterTest1() {
		System.out.println("I am insid after test");
	}
	
	@BeforeTest
	public void beforeTest2() {
		System.out.println("I am insid before test");
	}
	
	@AfterClass
	public void afterTest3() {
		System.out.println("I am insid after class");
	}
	
	@BeforeClass
	public void beforeTest4() {
		System.out.println("I am insid before class");
	}
	
	@AfterMethod
	public void afterTest5() {
		System.out.println("I am insid after method");
	}
	
	@BeforeMethod
	public void beforeTest6() {
		System.out.println("I am insid before method");
	}
	
	
	
	
	@Test
	public void test1() {
		System.out.println("i am test1");
	}
	

}
