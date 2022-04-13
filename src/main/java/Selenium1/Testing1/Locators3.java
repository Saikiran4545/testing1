package Selenium1.Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karuna Kadam\\Downloads\\Gecko Driver\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	}

}
