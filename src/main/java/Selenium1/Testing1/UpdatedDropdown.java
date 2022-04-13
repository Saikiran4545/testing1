package Selenium1.Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karuna Kadam\\Downloads\\Gecko Driver\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("http://3.110.88.201/dropdownsPractise/");
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    
	    int i=0;
	    while(i<5)
	    {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    	i++;
	    	
	    }
	     driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
