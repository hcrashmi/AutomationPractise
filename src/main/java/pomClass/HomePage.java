package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement TShirt;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTShirt()
	{
		TShirt.click();
	}
	
	public void clickDress()
	{
		Dresses.click();
	}
	
	public void clicklogout()
	{
		logout.click();
	}
}
