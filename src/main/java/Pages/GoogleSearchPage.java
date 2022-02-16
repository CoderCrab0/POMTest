package Pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {

	private By objNm = By.name("q");
	private static WebElement ele; 
	
	@FindBy(name =  "q")
	public static WebElement ele1;
	
	public WebElement SearchTextMain(WebDriver driver)
	{
		ele = driver.findElement(objNm);
		return ele;
	}
	
	public void SearchData(String text,WebElement ele)
	{
		ele.sendKeys(text);
		ele.sendKeys(Keys.RETURN);
	}
	
}
