package locators;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidLocatorDemo1 {

	public static void main(String[] args) throws MalformedURLException
	{
		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		//Locate any element
		WebElement ele=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		System.out.println("Using accessibilityId: "+ele.getText());
		
		
	
		ele=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]"));
		System.out.println("Using xpath: "+ele.getText());
		
		
		ele=driver.findElement(AppiumBy.id("android:id/text1"));
		System.out.println("Using id : "+ele.getText());
		
		
		ele=driver.findElements(AppiumBy.className("android.widget.TextView")).get(1);
		System.out.println("Using classname: "+ele.getText());
		
		
		//Actions
		ele.click();
		System.out.println("Clicked....");
		
		
		
		
		
		
		

	}

}
