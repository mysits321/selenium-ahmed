import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJavaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		//WebElement element = driver.findElement(By.name("q"));
		finElement.(By.name(name))sendKeys("Herndon VA Weather");
		//element.submit();
		
		//Thread.sleep(5000);
		//System.out.println("Page title is :"+ driver.getTitle());

	}

}
