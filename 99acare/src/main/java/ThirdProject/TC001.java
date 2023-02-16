package ThirdProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC001 {
     
	 public WebDriver driverG;
	
     @FindBy(xpath="//i[@class='iconS hdrIcn-home-loans']")
     private WebElement Homeloan;
	 
     @FindBy(xpath="//div[text()='BANKS']")
     private WebElement banks;
     
     @FindBy(xpath="//h2[text()='Bank(s) Deals']")
     private WebElement Banksdeals;
     
     @FindBy(xpath="(//a[text()='Get me this deal'])[1]")
     private WebElement kotakbank ;
     
     @FindBy(xpath="//input[@id='loanAmountInput']")
     private WebElement loanamount ;
     
     @FindBy(xpath="(//span[@class='phnCodeValue  hlYears'])[1]")
     private WebElement tenure;
     
     @FindBy(xpath="//span[text()='Your Age']")
     private WebElement yourage;
     
     @FindBy(xpath="//span[text()='Is your property identified']")
     private WebElement PropertyIdentified;
     
     @FindBy(xpath="(//input[@class='__enableSubmitButton __phnNoVal'])[3]")
     private WebElement PropertyCity;
     
     @FindBy(xpath="//span[text()='Property Cost']")
     private WebElement PropertyCost;
     
     @FindBy(xpath="//span[text()='How are you currently employed']")
     private WebElement CurrentlyEmployed;

 	 @FindBy(xpath="//span[text()='Your income']")
     private WebElement YourIncome;
     
 	 @FindBy(xpath="//span[text()='Current total EMI']")
     private WebElement TotalEMI;
 	 
 	 @FindBy(xpath="//span[text()='Full Name (as per PAN)']")
     private WebElement fullname;
 	 
 	 @FindBy(xpath="(//span[text()='Your Email Id'])[2]")
 	 private WebElement EmailId;
 	 
 	 @FindBy(xpath="//span[text()='Mobile Number(OTP verification req)'])[2]")
 	 private WebElement Mobilenumber;
 	 
 	// @FindBy(xpath="//button[text()='Submit Details']")
 	// WebElement submit;
     
     //CONSTRUCTOR
 	public TC001 (WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 	}
 	
 	//METHOD
 	
 	public void ClickOnHomeLoan()         //-1
 	{
 		Homeloan.click();
 	}
 	public void ClickOnBank()               //-2  
 	{
 		banks.click();
 	}
    
 	public void ClickOnBanksdeals()				//-3	
 	{
 		Banksdeals.click();
 	}
    
 	public void GetMeThisDeals()			//-4
 	{
 		kotakbank.click();
 	}
 	
 	public void EnterLoanAmount()				//-5
 	{
 		loanamount.sendKeys("2000000");
 	}
 	
 	public void SelectTenureFromDropDown() 			//-6
 	{
 		Select s=new Select(tenure);
 		s.selectByVisibleText("Years");
 	}
 	
 	public void EnterYourAge()						//-7
 	{
 		yourage.sendKeys("30");
 	}
 	
 	public void SelectFromPropertyIdentified()			//-8
 	{
 		Select s =new Select(PropertyIdentified);
 		s.selectByVisibleText("Yes");
 	}
 	
 	public void SelectPropertyCityFromDropdown ()		//-9
 	{
 		Select s =new Select(PropertyCity);
 		s.selectByVisibleText("Delhi / NCR (All");
 	}
 	public void EnterPropertyCost()   					//-10
 	{
 		PropertyCost.sendKeys("3500000");
 		
 	}
 	public void SelectFromCurrentlyEmployedDropdown()	//-11
 	{
 		Select s=new Select(CurrentlyEmployed);
 		s.selectByVisibleText("Self Employed");
 	}
 	
 	public void SelectFromYourIncome()					//-12
 	{
 		Select s=new Select(YourIncome);
 		s.selectByVisibleText("Monthly");
 	}
 	public void EnterCurrentEMI()						//-13
 	{
 		TotalEMI.sendKeys("10000");
 	}
 	public void EnterFullName()							//-14
 	{
 		fullname.sendKeys("Rugved Sujay Kanakdande");
 	}
 	public void EnterEmailId()							//-15
 	{
 		EmailId.sendKeys("w.pranita@gmail.com");
 	}
 	public void EnterMobileNumber()						//-16
 	{
 		Mobilenumber.sendKeys("9960505747");
 	}
 	public void ClickOnSubmitDetails()					//-17
 	{
 		submit.click();	
 	}	
}	
 	
 	
 	
 	
 	
 	
 	
 	

















