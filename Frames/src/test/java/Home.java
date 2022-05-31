import org.testng.annotations.Test;

import Logic.LaunchBrowsers;
import Logic.LogicalActions;

public class Home extends LaunchBrowsers {
	/**
	 * Method to verify UI element in voot home page
	 * 
	 * @throws Exception
	 */
	@Test
	public void homePagevalidation() throws Exception {
		//LogicalActions.verifyHomePageNavigation();
		//LogicalActions.verifyStep1();
		LogicalActions.navigatetomypage();

	}

}
