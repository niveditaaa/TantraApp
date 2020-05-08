import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import GlobalMethodPack.GlobalMethods;
import GlobalMethodPack.GlobalVariables;

public class VerifyHomePage {

	public static void main(String[] args) throws InterruptedException {
		GlobalMethods.openBrowser();
		Thread.sleep(3000);
		
		//System.setProperty("webdriver.chrome.driver","H:\\Automation\\chromedriver.exe"); 
		WebElement frgt= GlobalVariables.driver.findElement(By.xpath("//a[@class='link-effect text-muted mr-10 mb-5 d-inline-block']"));
		frgt.click();
		
		
		 Thread.sleep(2000);
		 String dasboard= GlobalVariables.driver.findElement(By.xpath("//h1[contains(text(),'Don’t worry, we’ve got your back')]")).getText();
		 System.out.print(dasboard);
		 
		}}
