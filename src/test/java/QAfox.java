

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QAfox {
	public static void JuiceShopMethod() {
ChromeOptions chromeOptions = new ChromeOptions();
		
		// This will make Selenium WebDriver to wait for the entire page gets loaded while launching website.
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		//This capability checks whether an expired (or) invalid TLS Certificate is used while navigating during a session
		chromeOptions.setAcceptInsecureCerts(true);
		
		//Specifies when to interrupt an executing script in a current browsing context. The default timeout 30,000 ms
		chromeOptions.setScriptTimeout(Duration.ofSeconds(30));
		
		//Specifies the time interval in which web page needs to be loaded in a current browsing context. The default timeout 300,000 ms
		chromeOptions.setPageLoadTimeout(Duration.ofMillis(30000));
		
		//This specifies the time to wait for the implicit element location strategy when locating elements. The default timeout 0 ms
		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
		
	
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://tutorialsninja.com/demo/index.php");
		
		driver.navigate().to("https://tutorialsninja.com/demo/index.php");
		
		//currency in the left top corner to Euro
		WebElement Currency = driver.findElement(By.xpath("//div[@class='pull-left']/form/div/button/span[text()='Currency']"));
		Currency.click();
		driver.findElement(By.xpath("//button[@name='EUR']")).click();
		
		//order canon EOS 5D camera and collect the error message
		driver.findElement(By.linkText("Canon EOS 5D")).click();
		
		driver.findElement(By.name("option[226]")).click();
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		//try {
			WebElement Successmsg = driver.findElement(By.xpath("//div[@class='text-danger']"));
			String p = Successmsg.getText();
			System.out.println(p);
			
		//move to home screen and click on iphone link
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
		driver.findElement(By.linkText("iPhone")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		
		//System.out.println(driver.findElement(By.xpath("//div[@id='product-product']/div/text()")).getText());

		try {
		if(driver.findElement(By.xpath("//div[text()='Success: You have added ']")).isDisplayed()) {
			System.out.println("you have successfully added your iphone to the cart");
		}
		}
		catch(Exception e) {
			System.out.println("no items added to the cart");
		}
		//Click on the black color icon and then click view cart
		driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		//driver.findElement(By.linkText("Shopping Cart")).click();
		driver.findElement(By.xpath("//div[@id='cart']/ul/li[2]/div/p/a/strong/i[@class='fa fa-shopping-cart']")).click();
		//driver.findElement(By.linkText("https://tutorialsninja.com/demo/index.php?route=checkout/cart"));
		driver.findElement(By.xpath("//div[@class='input-group btn-block']/input")).clear();
		driver.findElement(By.xpath("//div[@class='input-group btn-block']/input")).sendKeys("3");
		driver.findElement(By.xpath("//div[@class='input-group btn-block']/span/button")).click();
		//driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
		
		//print the ECO Tax nd Vat in the console and click the checkout button
		WebElement EcoTax =  driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]"));
		String E = EcoTax.getText();
		System.out.println("Eco Tax(-2.00):" +E);
		
		WebElement VatTax = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]"));
		String V = VatTax.getText();
		System.out.println("VatTax :"+ V);
		
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		 
		 //print the error message and remove the item from the cart
		WebElement PrntMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String P = PrntMsg.getText();
		System.out.println(P);
		
		driver.findElement(By.xpath("//div[@class='input-group btn-block']/span/button[2]")).click();
		
		//move to the hoem screen, click on Mac book and enter the quantity as 1,click add to cart and check the success message
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("MacBook")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("1");
		driver.findElement(By.id("button-cart")).click();
		try {
			if(driver.findElement(By.xpath("//div[text()='Success: You have added ']")).isDisplayed()) {
				System.out.println("you have successfully added your MacBook to the cart");
			}
			}
			catch(Exception e) {
				System.out.println("no items added to the cart");
			}
		
		//click on the shopping cart in the top and apply code ABCD123 as code and check for the error message
		driver.findElement(By.linkText("Shopping Cart")).click();
		driver.findElement(By.xpath("//a[@class='accordion-toggle']")).click();
		driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).sendKeys("ABCD123");
		driver.findElement(By.xpath("//*[@id=\"button-coupon\"]")).click();
		WebElement ErrMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		String msg = ErrMsg.getText();
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//a[text()='iPhone']/../../../div[3]/button/span[text()='Add to Cart']")).click();
		
		
		//WebElement iphonecart = driver.findElement(By.xpath("//a[text()='iPhone']/../../../div[3]/button/span[text()='Add to Cart']"));
		//iphonecart.click();
		
		
	}
	public static void main(String[] args) {
		JuiceShopMethod();
		
	}

}