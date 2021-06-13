package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void login(String username, String password) {
		
		driver.findElement(By.id("session_key")).clear();
		driver.findElement(By.id("session_key")).sendKeys(username);
		driver.findElement(By.id("session_password")).clear();
		driver.findElement(By.id("session_password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[class=sign-in-form__submit-button]")).click();
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data= new Object[3][2];
		
		data[0][0]= "abc";
		data[0][1]="xyz";
		
		data[1][0]= "def";
		data[1][1]="pqr";
		
		data[2][0]= "ghi";
		data[2][1]="tuv";
		
		return data;
		
		
		
		
	}

}
