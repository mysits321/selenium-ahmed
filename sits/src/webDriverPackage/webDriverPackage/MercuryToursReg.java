package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryToursReg {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open Firefox web
		WebDriver driver= new FirefoxDriver();
		//Launch Mercury Web
		driver.get("http://newtours.demoaut.com/");
	    //print the title of the page
		driver.getTitle();
		//print
		System.out.println(driver.getTitle());
		//Click on Register link
		driver.findElement(By.linkText("REGISTER")).click();
		//Enter First name
		driver.findElement(By.name("firstName")).sendKeys("Ahmed");
		//Enter Last Name
		driver.findElement(By.name("lastName")).sendKeys("Baba");
		//Enter phone number
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		//Enter email
		driver.findElement(By.id("userName")).sendKeys("qwert@yahoo.com");
		//Enter Address
		driver.findElement(By.name("address1")).sendKeys("AvenueCourt");
		//Enter City
	    driver.findElement(By.name("address2")).sendKeys("4565");
	    //Enter State
	    driver.findElement(By.name("city")).sendKeys("Baltimore");
	    driver.findElement(By.name("state")).sendKeys("Maryland");
	    //Enter Postal Code
	    driver.findElement(By.name("postalCode")).sendKeys("21215");
	    //Enter Country
	    driver.findElement(By.name("country")).sendKeys("United States");
	    //Enter Use Name
	    driver.findElement(By. name("email")).sendKeys("qwert@gmail.com");
	    //Enter Password
	    driver.findElement(By.name("password")).sendKeys("asd1234");
	    //Confirm Password
	    driver.findElement(By.name("confirmPassword")).sendKeys("asd1234");
	    //Enter Submit
	    driver.findElement(By.name("register")).click();
	    
	    
		
		

	}

	
		
	}

	

