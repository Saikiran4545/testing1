package Selenium1.Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karuna Kadam\\Downloads\\Gecko Driver\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
	    driver.get("http://3.110.88.201/dropdownsPractise/");
	    
	    WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown=new Select(staticDropdown);
	    dropdown.selectByIndex(3);
	    dropdown.selectByVisibleText("AED");
	    dropdown.selectByValue("INR");
	    

	}

}
