package level2ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPage {

	WebDriver driver;
	public  AmazonLoginPage(WebDriver driver) {
		this.driver = driver;
	}


	By username = By.xpath("//input[@id='ap_email']");
	By continue_button = By.xpath("//input[@id='continue']");
	By password = By.xpath("//input[@id='ap_password']");
	By login_button = By.xpath("//input[@id='signInSubmit']");
	By signin_mouseHover = By.xpath("//span[contains(text(),'Hello, Sign in')]");
	By signin_buttononHomepage = By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]");
    By Hamburger = By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[1]/a[1]/i[1]");
    By shopCategory = By.xpath("//div[contains(text(),'Echo & Alexa')]");
    By subCategory = By.xpath("//a[contains(text(),'Echo Dot (3rd Gen)')]");
    By Product_AddtoCart = By.xpath("//input[@id='add-to-cart-button']");
    By Product_ProceedtoBuy = By.xpath("//a[@id='hlb-ptc-btn-native']");
    
    
	public WebElement signin_mouseHover() {
		return driver.findElement(signin_mouseHover);
	}

	public WebElement signin_buttononHomepage() {
		return driver.findElement(signin_buttononHomepage);
	}

	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement continue_button() {
		return driver.findElement(continue_button);
	}

	public WebElement login_button() {
		return driver.findElement(login_button);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	
	public WebElement Hamburger() {
		return driver.findElement(Hamburger);
	}
	
	public WebElement shopCategory() {
		return driver.findElement(shopCategory);
	}

	public WebElement subCategory() {
		return driver.findElement(subCategory);
	}

	public WebElement Product_AddtoCart() {
		return driver.findElement(Product_AddtoCart);
	}
	
	public WebElement Product_ProceedtoBuy() {
		return driver.findElement(Product_ProceedtoBuy);
	}
	

	
	
}
