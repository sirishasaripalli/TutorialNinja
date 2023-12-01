package TestSuite1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module1 {
	@Test 
	public void test001() {
		System.out.println("I am executing testcase test001");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		
	}
	@Test
	public void test002() {
		System.out.println("I am executing testcase test002");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
	}
	@Test
	public void test003() {
		System.out.println("I am executing testcase test003");
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
	}
	@DataProvider
	public Object[][] data001(){
		Object[][] data = {{"Sirisha","password1"},{"Sirisha2","password2"}};
		return data;
	}
	@Test (dataProvider = "data001")
	
	public void login(String username, String password) {
		System.out.println(username+"and"+password);
	}

}
