package Selenium1.Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karuna Kadam\\Downloads\\Gecko Driver\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("http://3.110.88.201/dropdownsPractise/");
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
	}

}
