package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import level2ObjectRepo.AmazonLoginPage;

public class LoginAppliction {
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Practice\\resources\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.amazon.in/");
		AmazonLoginPage alp = new AmazonLoginPage(driver);
		Actions actions = new Actions(driver);
		WebElement menuhover = alp.signin_mouseHover();
		actions.moveToElement(menuhover);
		alp.signin_buttononHomepage().click();
		System.out.println("Signin button home page is clicked now.");
		alp.username().sendKeys("Saumyas84@gmail.com");
		alp.continue_button().click();
		alp.password().sendKeys("Tester@123");
		alp.login_button().click();
		System.out.println("Customer is successfully logged in Amazon home page.");
		alp.Hamburger().click();
		alp.shopCategory().click();
		alp.subCategory().click();
		alp.Product_AddtoCart().click();
		alp.Product_ProceedtoBuy().click();
		
		

	}

}
