package ThirdProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ThirdProject.Homepage99;

public class Homepage99Test {
	
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.99acres.com/");
		
		driver.manage().window().maximize();
		
		Homepage99 ref1=new Homepage99(driver);
		
		ref1.ClickOnBuy();
		ref1.ClickOnFindNewProject();
		ref1.ClickOnresidential();
		ref1.SelectCityFromDropdown();
		ref1.ClickOnDownwordArrow();
		
		
	}

}
