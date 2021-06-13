package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamDemo {
	
	@Parameters({"url", "text", "text1"})
	@Test
	public void openBrowser(String url, String text, String text1) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(text);
		driver.findElement(By.name("p")).sendKeys(text1);

		
	}
	

}
