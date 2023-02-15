package ThirdProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
	// WEBELEMENT
	
	public WebDriver driverG;
	
	Actions act;
	
	
	//REGISTRATION FORM
	@FindBy(xpath="(//i[contains(@class,'icon_userWhite theader__dot iconS_Common_24')])[1]")
	private WebElement ProfileIcon;

	@FindBy(xpath="//a[@title='Register']")
	private WebElement InitialRegisterButton;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='mobileNumberField']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//a[contains(@class,'component__loginRegiterBtn component__')]")
	private WebElement Register;
	
	@FindBy(xpath="//span[text()='Email/Mobile No./Username']")
    private WebElement EmailMobileNoUsername;
	
	@FindBy(xpath="//a[@id='loginSubmit']")
    private WebElement Continues;
	
	@FindBy(xpath="//span[text()='Enter received OTP']")
	private WebElement OTP;
	
	@FindBy(xpath="//a[@id='loginSubmit']")
	private WebElement login;
	
	
	

	//CONSTRUCTOR
	public login (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driverG=driver;
		act=new Actions(driver);
	}
	
	
	// METHOD
	public void hoverOnProfileicon()
	{
		act.moveToElement(ProfileIcon).perform();
	}
	public void clickOnInitialRegisterButton()
	{
		InitialRegisterButton.click();
	}
	public void EnterName() 
	{
		name.sendKeys("PRANITA WADKAR");
	}
	public void Enteremail()
	{
		email.sendKeys("w.pranita@gmail.com");
	}	
	
	public void EnterPassword()
	{
		password.sendKeys("Sharvari@2005");
	}	
	
	public void EnterMobileNumber()
	{
		mobileNumber.sendKeys("9960505747");
	}	
	
	public void ClickOnRegister()
	{
		Register.click();
	}

	public void EnterMobileNo()
	{
		EmailMobileNoUsername.sendKeys("9960505747");
	}
	
	public void CickOnContinuesButton()
	{
		Continues.click();
	}
	
	public void EnterOTPRecivedManually()
	{
		OTP.sendKeys("OTP");
	}
	public void ClickOnLogin()
	{
		login.click();
	}
	
}


	
	
	
	
	
	

