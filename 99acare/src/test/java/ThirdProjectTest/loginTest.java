package ThirdProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ThirdProject.login;

public class loginTest {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.99acres.com/");
	
	driver.manage().window().maximize();
    login ref1=new login(driver);
ref1.hoverOnProfileicon();
ref1.clickOnInitialRegisterButton();
ref1.EnterName();
ref1.Enteremail();
ref1.EnterPassword();
ref1.EnterMobileNumber();
ref1.ClickOnRegister();
ref1.EnterMobileNo();
ref1.CickOnContinuesButton();
ref1.EnterOTPRecivedManually();
ref1.ClickOnLogin();

    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
