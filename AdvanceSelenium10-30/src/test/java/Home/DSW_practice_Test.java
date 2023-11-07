package Home;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ITestListnerUtility;
@Listeners(ITestListnerUtility.class)
public class DSW_practice_Test extends BaseClass {
	@Test
	public void launchingFlipcart() {
		driver.navigate().to("https://www.flipkart.com/");
	}

}
