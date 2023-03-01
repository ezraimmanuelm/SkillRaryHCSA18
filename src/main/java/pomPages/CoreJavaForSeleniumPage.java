package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	//Declaration
	@FindBy(xpath = "//h2[@class='list_title']")
	private WebElement PageHeader;
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialization
	public  CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public String getPageHeader() {
		return PageHeader.getText();
	}
	public void clickCoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}
}
