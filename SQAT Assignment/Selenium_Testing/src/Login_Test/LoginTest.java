package Login_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ritu\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/downloads/");
		driver.get("https://localhost:44360/Donor/Login");
		driver.findElement(By.id("dnUserName")).sendKeys("Ritu");
		driver.findElement(By.id("dnPassword")).sendKeys("123456");
		driver.findElement(By.xpath("https://localhost:44360/Donation/Donation")).clear();
	}

}
