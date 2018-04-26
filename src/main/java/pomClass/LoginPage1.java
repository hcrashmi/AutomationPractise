package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1
{
	@FindBy(xpath="//a[contains(.,'Sign')]")
	private WebElement SignIN;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement UN;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement login;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement Sign1;
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignIn()
	{
		SignIN.click();
	}
	
	public void setUser(String username)
	{
		UN.sendKeys(username);
	}
	
	public void setPwd(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void clicksign1()
	{
		Sign1.click();
	}
}
