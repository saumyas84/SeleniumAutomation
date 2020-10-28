package Automation.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotelbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Practice\\resources\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.get("https://www.makemytrip.com");
		// Create Account
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saumyas84@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tester@123");
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]")).click();
		
		//Go to its "Hotel" section and select the necessary details (Location , Date and Room type) in the form
		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'City / Hotel / Area / Building')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Delhi')]")).click();
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--end.DayPicker-Day--selected")).click();
		driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--end.DayPicker-Day--selected")).click();
		driver.findElement(By.xpath("//li[text()='2']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.id("hsw_search_button")).click();
		
		//Search and select a particular hotel and apply Filters (like Price, Locality and Star rating ) and click "Book This Now"
		driver.findElement(By.cssSelector(".amenList.darkText")).click();
		for (String handle1 : driver.getWindowHandles()) {
	        System.out.println(handle1); 
	        driver.switchTo().window(handle1);   } 
	        driver.getCurrentUrl();
	        driver.findElement(By.id("detpg_headerright_book_now")).click();
	        
	        //Book the hotel with required details (Traveler information , Coupon code ,Special Requests and Any other Request) and Click " Pay Now"
	        driver.findElement(By.id("fName")).sendKeys("Saumya");
	        driver.findElement(By.id("lName")).sendKeys("Sharma");
	      //  driver.findElement(By.id("email")).click();
	        
	        
	        //Find the "Pay Now” button and proceed to checkout
	        driver.findElement(By.cssSelector(".primaryBtn.btnPayNow")).click();
	       // In “Payment Option" page , select any one of the payment options like (Credit card, Net banking , UPI, Google Pay )
	        driver.findElement(By.xpath("//span[contains(text(),'Credit/Debit Cards')]")).click();
	        
	        
	        //Enter Invalid payment details and view the page.
	        driver.findElement(By.id("PAYMENT_cardNumber")).sendKeys("411111111111111111");
	        driver.findElement(By.name("PAYMENT_nameOnCard")).sendKeys("test");
	        Select select = new Select(driver.findElement(By.name("PAYMENT_expiryMonth")));
	        select.selectByIndex(3);
	       new Select(driver.findElement(By.id("PAYMENT_expiryYear"))).selectByIndex(2);
	       driver.findElement(By.id("PAYMENT_cvv")).sendKeys("111");
	       driver.findElement(By.cssSelector(".manitainence_info.lato-regular.append_bottom25.clearfix")).getText();
	       
	       
	}
	}


