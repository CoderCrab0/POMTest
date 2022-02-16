package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserOps {

	private static WebDriver driver = null;
	
	public WebDriver openBrowser(String type)
	{
		switch(type)
		{
			case "Chrome" : 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\midee\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			    driver = new ChromeDriver();
			    break;
			case "Mozilla" : 
				System.setProperty("Webdriver.Mozilla.Driver","C:\\Users\\midee\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
			    break;
			case "Edge" : 
				System.setProperty("Webdriver.Edge.Driver","Path");
			    driver = new EdgeDriver();
			    break;
			default :
				System.setProperty("Webdriver.Chrome.Driver","Path");
			    driver = new ChromeDriver();
			    break;
		}
		return driver;
	}
	
}
