package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyboardAction {

	public static void main(String[] args) throws MalformedURLException
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		//views
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Utility.capture(driver);
		
		WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
		//swipe
		((AndroidDriver) driver).executeScript("mobile: swipeGesture",
				 ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
				    //"left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "up",
				    "percent", 0.75
				));
		Utility.capture(driver);
		//textview
		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
		
		Utility.capture(driver);
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();
		
		WebElement ele1=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
		ele1.sendKeys("Hi   ");
		Utility.capture(driver);
		//Keyboard action
	
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.H));
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.L));
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.L));
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.O));
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
		
		((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
		
		
		
		
		Utility.capture(driver);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
