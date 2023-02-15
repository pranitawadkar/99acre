package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ThirdProject.HomeLoanPage;
import ThirdProject.Homepage99;
import ThirdProject.login;

public class TestNGClass1 

{
        public WebDriver driver1;
	
    @BeforeClass
	public void beforeclass () 
	{
		System.out.println("@BeforeClass");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver1= new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void beforeMethod () 
	{
		System.out.println("@BeforeMethod");
		driver1.get("https://www.99acres.com/");
		login x=new login(driver1);
        x.hoverOnProfileicon();
		x.clickOnInitialRegisterButton();
	}
	
	@Test
    public void loginpage () 
	{
		System.out.println("loginpage");
		login x=new login(driver1);
		x.EnterName();
		x.Enteremail();
		x.EnterPassword();
		x.EnterMobileNumber();
		x.ClickOnRegister();
		x.EnterMobileNo();
		x.CickOnContinuesButton();
		x.EnterOTPRecivedManually();
		x.ClickOnLogin();

	}
	@Test
	public void Homepage99()
	{
	   System.out.println("Homepage99");
       Homepage99 ref1=new Homepage99(driver1);
		
		ref1.ClickOnBuy();
		ref1.ClickOnFindNewProject();
		ref1.ClickOnresidential();
		ref1.SelectCityFromDropdown();
		ref1.ClickOnDownwordArrow();	
	}
	
	@Test
	public void HomeLoanpage99Test ()
	{HomeLoanPage ref1=new HomeLoanPage(driver1);
	ref1.ClickOnBank();
	ref1.ClickOnBanksdeals();
	ref1.ClickOnHomeLoan();
	ref1.ClickOnSubmitDetails();
	ref1.EnterCurrentEMI();
	ref1.EnterEmailId();
	ref1.EnterFullName();
	ref1.EnterLoanAmount();
	ref1.EnterMobileNumber();
	ref1.EnterPropertyCost();
	ref1.EnterYourAge();
	ref1.GetMeThisDeals();}
	
	@AfterMethod
	public void afterMethod () 
	{
		System.out.println("@AfterMethod");
	};
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("@AfterClass");
	}
}

	


