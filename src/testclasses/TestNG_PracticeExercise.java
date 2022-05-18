package testclasses;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNG_PracticeExercise {
	WebDriver driver;
	String baseUrl;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) {
		baseUrl = "https://letskodeit.teachable.com";
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\priya\\eclipse-workspace\\libs\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\priya\\eclipse-workspace\\libs\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
	}

	@Test
	public void testLogin() throws InterruptedException {
				
		WebElement loginLink = driver.findElement(By.xpath("//a[@href ='/sign_in']"));
		loginLink.click();
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("test");
		Thread.sleep(2000);
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("123456");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.name("commit"));
		loginButton.click();
	}
	@AfterClass
	public void cleanUp() {
		driver.quit();
		
	}
}
