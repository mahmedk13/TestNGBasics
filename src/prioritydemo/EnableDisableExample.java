package prioritydemo;

import org.testng.annotations.Test;

public class EnableDisableExample {
	
	@Test 
	public void test1() {
		System.out.println("i am test1");
	}
	
	@Test 
	public void test2() {
		System.out.println("i am test2");
	}
	
	@Test (enabled=false)
	public void test3() {
		System.out.println("i am test3");
	}
	
	@Test 
	public void test4() {
		System.out.println("i am test4");
	}

}
