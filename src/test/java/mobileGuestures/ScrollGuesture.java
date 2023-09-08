package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ScrollGuesture {

	public static void main(String[] args) throws MalformedURLException
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		//views
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//ele
		
		WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
		
		//scroll
		boolean canScrollMore = (Boolean) ((AndroidDriver) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elemenetId",((RemoteWebElement)ele).getId(),
			   // "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent",0.75
			));

	}

}
