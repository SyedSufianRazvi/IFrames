package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.XPaths;

public class LogicalActions {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to home page by fetching current url &
	 * comparing with actual url.
	 */
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://demo.automationtesting.in/Frames.html",
				"Not navigated to Automation Testing page");
		Thread.sleep(1000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot page by presence of element and comparing fetched
	 * page text with actual text.
	 */
	public static void verifyStep1() throws InterruptedException {

		WebElement page = driver.findElement(XPaths.objFrame);
		@SuppressWarnings("unused")
		String Text = page.getAttribute("title");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		// System.out.println("Text is: " + Text);

	}

	public static void navigatetomypage() throws Exception {
		
		String Parent_Window = driver.getWindowHandle();

		System.out.println("switching");

		WebElement frameCSSPath = driver.findElement(XPaths.pre_single_frame);
		driver.switchTo().frame(frameCSSPath);

		Thread.sleep(3000);
		System.out.println("switched");

		driver.findElement(XPaths.pre_single_frame_input).sendKeys("naresh_venkat");
		Thread.sleep(3000);

		driver.switchTo().window(Parent_Window);

		Thread.sleep(3000);
		
		
		

		driver.findElement(XPaths.iframe_iframe_button).click();

		WebElement mframexparth = driver.findElement(XPaths.nested_iframe_parent_xpath);
		driver.switchTo().frame(mframexparth);

		WebElement sframexparth = driver.findElement(XPaths.nested_iframe_child_xpath);
		driver.switchTo().frame(sframexparth);

		Thread.sleep(3000);
		System.out.println("clicked on iframe input");

		driver.findElement(XPaths.nested_iframe_input_xpath).sendKeys("naresh_venkat");
		Thread.sleep(3000);

	}

}
