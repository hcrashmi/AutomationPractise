package scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.EXTENTRe;
import pomClass.DressPage;
import pomClass.HomePage;
import pomClass.LoginPage1;
import pomClass.TShirts;

public class DressTest extends EXTENTRe
{
	@Test//(priority=2)
	public void dressTest() throws Exception 
	{
		try{
			
		
		Thread.sleep(10000);
		LoginPage1 lp=new LoginPage1(driver);
		Thread.sleep(5000);
		lp.clicksign1();
		lp.setUser("jetblue@grr.la");
		lp.setPwd("jetblue");
		lp.clickLogin();
		
		HomePage hp=new HomePage(driver);
		hp.clickDress();
		
		DressPage dp=new DressPage(driver);
		dp.clickCasualWear();
		
		Assert.assertEquals(driver.findElement(By.xpath("(//a[contains(.,'Printed')])[3]")).getText(), "Printed Dress");
		Reporter.log("Text Printed Dress is present",true);
		
		Assert.assertEquals(driver.findElement(By.xpath("(//a[contains(.,' Size : S')])[2]")).getText(), "Color : Orange, Size : S");
		Reporter.log("Text Color : Orange, Size : S is present",true);
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@ size='2']")).getAttribute("value"), "1");
		Reporter.log("Quantity one is present",true);
		
		Assert.assertEquals(driver.findElement(By.xpath("//td[@data-title='Total']")).getText(), "$26.00");
		Reporter.log("Text $26.00  is present",true);
		
		//hp.clicklogout();
		
		Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
