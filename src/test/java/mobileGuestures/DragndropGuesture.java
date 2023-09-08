package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DragndropGuesture {

	public static void main(String[] args) throws MalformedURLException
	{
		
		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		//view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//dragndrop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		//ele
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		((AndroidDriver) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "endX", 675,
			    "endY", 977
			));
		
		
	String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	
	System.out.println(text);
	
		
		
		
	}

}
