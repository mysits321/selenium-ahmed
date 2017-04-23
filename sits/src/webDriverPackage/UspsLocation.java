package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UspsLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step1 Launch a web browser
		WebDriver browser = new FirefoxDriver();
		// Step2 Enter http://www.google.co/and click on Enter Button
		 browser.get("https://www.usps.com");
		 browser.manage().window().maximize();
		 Thread.sleep(5000);
		 //click on quick tools
		 
		 //Step3 Enter"usps.com"
		 browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		 //click on find Location
		 browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[3]/ol/li[7]/a")).click();
		 Thread.sleep(5000);
		 browser.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
		 
		 
		 
		 
		 //wait for 5seconds for search Button to enable
		
		 
		 
	}

}
