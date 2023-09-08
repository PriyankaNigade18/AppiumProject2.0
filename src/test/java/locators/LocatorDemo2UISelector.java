package locators;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorDemo2UISelector {

	public static void main(String[] args) throws MalformedURLException 
	{
		//"new UiSelector().text(\"text\")"
		
		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
		System.out.println(ele.getText());
		
		ele=driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).get(1);
		System.out.println(ele.getText());
		
		
	}

}
