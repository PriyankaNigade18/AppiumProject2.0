package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LongClickAction {

	public static void main(String[] args) throws MalformedURLException
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		//view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//drag n drog
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		//ele to long click
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		
		//long click code
		
		((AndroidDriver)driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "x",207,
			    "y",571,
			    "duration",1000
			));

		System.out.println("Long click is done!");
		
		

	}

}
