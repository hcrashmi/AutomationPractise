package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirts 
{
	@FindBy(xpath="//a[contains(.,'Faded')]")
	private WebElement FadedTS;
	
	@FindBy(xpath="//span[contains(.,'Add to cart')]")
	private WebElement cart;
	
	@FindBy(xpath="//span[contains(.,'Proceed')]")
	private WebElement proceed;
	
	public TShirts(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickFadedTS()
	{
		FadedTS.click();
	}
	
	public void clickAddToCart()
	{
		cart.click();
	}
	
	public void clickProceed()
	{
		proceed.click();
	}
}
