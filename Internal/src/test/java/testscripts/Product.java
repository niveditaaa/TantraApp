package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethodPack.GlobalMethods;
import GlobalMethodPack.GlobalVariables;

public class Product {

	  @BeforeMethod
	   public void beforeMethod() throws InterruptedException {
	 
		   GlobalMethods.openBrowser();
		   GlobalMethods.Login();
		   
}
	  
	  @Test
	  public void VerifyAddProduct()throws Exception{
		  Thread.sleep(3000);
		  GlobalVariables.driver.findElement(By.xpath("//span[@class='sidebar-mini-hide' and contains(text(),'Products')]")).click();
		  
		  Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='main-container']/div/h2/div/a")).click();
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_name']")).sendKeys("NivTestProduct");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_sub_name']")).sendKeys("csfsfsfs");
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='product_abbreviation']")).sendKeys("43wrsfsw");
		   
		   Thread.sleep(3000);
		 WebElement getBrand=  GlobalVariables.driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div[2]/div/span/span[1]/span/ul/li/input"));
		 getBrand.sendKeys("Tushar");
		 Thread.sleep(2000);
		 getBrand.sendKeys(Keys.ENTER);
		   
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//*[@id='default_duration']")).sendKeys("4");
		   
		 
		   //USING SELECT BY VALUE
		   Thread.sleep(3000);
		   Select oSelect =new Select( GlobalVariables.driver.findElement(By.id("default_pricing")));
		   oSelect.selectByValue("3");
		   
		   Thread.sleep(3000);
		   Select oSelect1 =new Select( GlobalVariables.driver.findElement(By.id("status")));
		   oSelect1.selectByValue("active");
		  
		   Thread.sleep(3000);
		   GlobalVariables.driver.findElement(By.xpath("//button[@class='btn btn-alt-primary btn-save js-click-ripple-enabled']")).click();
	 
	  Thread.sleep(5000);
	  ////div[contains(text(),'NivTestProduct')]
	  
	  String nameadded=  GlobalVariables.driver.findElement(By.xpath("//div[contains(text(),'NivTestProduct')]")).getText();
	  
	  Assert.assertEquals(nameadded, "NivTestProduct");
		 
	  
	  }
	  
	  @AfterMethod
	  public void closeBrowser()
	  {
		  GlobalVariables.driver.close();
	  }     

}
