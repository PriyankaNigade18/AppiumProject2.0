package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SwipeGuesture {

	public static void main(String[] args) throws MalformedURLException
	{

		 AppiumDriver driver=CreateAppiumSession.initializeSession();
		 
		 //views
		 driver.findElement(AppiumBy.accessibilityId("Views")).click();
		 
		 //gallary
		 driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		 
		 //photos
		 driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

		 //ele
		 WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
		 
		 ((AndroidDriver) driver).executeScript("mobile: swipeGesture",
				 ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
				    //"left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "left",
				    "percent", 0.75
				));
		 
	}

}
