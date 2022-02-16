package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.GoogleSearchPage;
import Utility.browserOps;
import Utility.openApps;

public class GoogleSearch {

	private static browserOps ut;
	private static openApps op;
	private static GoogleSearchPage pg;
	@FindBy(name =  "q")
	static WebElement ele1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ut = new browserOps();
       op = new openApps();
       pg = new GoogleSearchPage();
       WebDriver driver = ut.openBrowser("Chrome");
       op.OpenAnyURL(driver, "https://google.com");
       pg.SearchData("Linkin Park",ele1);
       
       
	}

}
