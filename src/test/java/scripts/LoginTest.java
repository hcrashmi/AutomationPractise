package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.EXTENTRe;
import generic.ExReports;
import pomClass.HomePage;
import pomClass.LoginPage1;
import pomClass.TShirts;

public class LoginTest extends EXTENTRe
{
	@Test//(priority=1)
	public void loginToApp() throws InterruptedException
	{
		try{
			LoginPage1 lp=new LoginPage1(driver);
		
		lp.clickSignIn();
		lp.setUser("jetblue@grr.la");
		lp.setPwd("jetblue");
		lp.clickLogin();
		
		HomePage hp=new HomePage(driver);
		hp.clickTShirt();
		
		TShirts ts=new TShirts(driver);
		ts.clickFadedTS();
		Thread.sleep(5000);
		ts.clickAddToCart();
		Thread.sleep(6000);
		ts.clickProceed();
		
		Assert.assertEquals(driver.findElement(By.xpath("(//a[contains(.,'Sleeve')])[2]")).getText(), "Faded Short Sleeve T-shirts");
		Reporter.log("Text Faded Short Sleeve T-shirts is present",true);
		
		Assert.assertEquals(driver.findElement(By.xpath("(//a[contains(.,'Color : Orange, Size : S')])[2]")).getText(), "Color : Orange, Size : S");
		Reporter.log("Text Color : Orange, Size : S is present",true);
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@size='2']")).getAttribute("value"), "1");
		Reporter.log("Quantity one is present",true);
		
		Assert.assertEquals(driver.findElement(By.xpath("//td[@data-title='Total']")).getText(), "$16.51");
		Reporter.log("Text $16.51 is present",true);
		
		hp.clicklogout();
		
		Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
