package Jewelry;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class Demo extends BaseClass{
	@Test
	public void LaunchingTheBrowser( ) {
		driver.navigate().to("https://www.facebook.com/");
	}

}
