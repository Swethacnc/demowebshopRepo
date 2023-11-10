package Home;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)

public class DemoPractice2 extends BaseClass{
	@Test
	public void LaunchingTheBrowser( ) {
		driver.navigate().to("https://www.facebook.com/");
	}

}
