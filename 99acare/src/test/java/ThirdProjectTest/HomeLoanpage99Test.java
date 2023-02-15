package ThirdProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ThirdProject.HomeLoanPage;

public class HomeLoanpage99Test 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.99acres.com/");
		
		driver.manage().window().maximize();
		
		HomeLoanPage ref1=new HomeLoanPage(driver);
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
		ref1.GetMeThisDeals();
		
		
	}
}

