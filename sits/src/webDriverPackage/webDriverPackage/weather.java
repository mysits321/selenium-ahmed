package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1 Launch web browser
		WebDriver browser = new FirefoxDriver();
		// Step2 Enter http://www.google.co/and click on Enter Button
       browser.get("https://www.google.com");
       //Step3 Enter "Herndon VA Weather"
        browser.findElement(By.name("q")).sendKeys("Herndon VA Weather");
        //click on Search Button Search results should be displayed
       
        browser.findElement(By.name("btnG")).click();
        // element.submit();
       
       System.out.println("page title is :"+browser.getTitle());
       
       
       
       
	}

}
