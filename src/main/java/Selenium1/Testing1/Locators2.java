package Selenium1.Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karuna Kadam\\Downloads\\Gecko Driver\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.className("signInBtn")).click();
	    Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
       // Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
	}

}
