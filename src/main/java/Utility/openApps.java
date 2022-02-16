package Utility;

import org.openqa.selenium.WebDriver;

public class openApps {

	public void OpenAnyURL(WebDriver driver,String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
	}
}
