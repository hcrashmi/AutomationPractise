package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage 
{
	@FindBy(xpath="(//a[contains(.,'Casual')])[3]")
	private WebElement Casual;
			
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement PrintedDress;
	
	@FindBy(xpath="//button[@ name='Submit']")
	private WebElement AddCart;
	
	@FindBy(xpath="//span[contains(.,'checkout')]")
	private WebElement checkout;
	
	public DressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			
	public void clickCasualWear() throws Exception
	{			
		Casual.click();
		PrintedDress.click();
		AddCart.click();
		Thread.sleep(5000);
		checkout.click();
	}
			
	
}
