package GlobalMethodPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GlobalMethods {
	
	
	
	public static void openBrowser() {
		
		 System.setProperty("webdriver.chrome.driver", "H:\\Automation\\chromedriver.exe");
	 	 GlobalVariables.driver= new ChromeDriver(); 
	 	GlobalVariables.driver.get(GlobalVariables.Baseurl);
		 
	}
	
	public static void Login() throws InterruptedException {
		Thread.sleep(5000);
		WebElement username= GlobalVariables.driver.findElement(By.xpath("//*[@id='email']"));
		 username.click();
		 username.sendKeys("voteforguy@gmail.com");
		 
		 Thread.sleep(2000);
		 WebElement password= GlobalVariables.driver.findElement(By.xpath("//input[@id='password']"));
		 password.click();
		 password.sendKeys("test1234");
		 
		 Thread.sleep(2000);
		 GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-sm btn-hero btn-alt-primary']")).click();
		 
		 Thread.sleep(2000);
	}
	
	
	

}
