package login;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class PracticeTestCase extends BaseClass{
	@Test
	
public void launchingFB() {
	
		driver.navigate().to("https://www.facebook.com");
}
}
