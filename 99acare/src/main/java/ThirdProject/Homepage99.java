package ThirdProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage99 {
	
	//WEBELEMENT
	
	public WebDriver driverG;
	
	@FindBy(xpath="//span[@class='list-picked-item']")
	private WebElement button;
	
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement bye;
	
	@FindBy(xpath="//input[@id='npajax_ptype_r1']")
	private WebElement residential;
	
	@FindBy(xpath="//select[@name='city']")
	private WebElement city ;

	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement Findnewproject ;

	
	
	//CONSTRUCTOR
	public Homepage99 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//METHOD
        public void ClickOnDownwordArrow()
        {
        	button.click();
        }
	
		public void ClickOnBuy()
		{
			bye.click();
		}
	
		public void ClickOnresidential()
		{
			residential.click();
		}
	
		public void SelectCityFromDropdown()
		{
			// select class cha object tayar karawa lagel je yet nahia.
			
			Select s=new Select(city);
			s.selectByVisibleText("Navi Mumbai");
					
		}
		public void ClickOnFindNewProject()
		{
			Findnewproject.click();
		}
	
	
	
	

}
