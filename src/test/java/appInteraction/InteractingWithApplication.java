package appInteraction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.appium.java_client.remote.MobileCapabilityType;

public class InteractingWithApplication {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		String appUrl=System.getProperty("user.dir")+"\\src\\test\\java\\app\\ApiDemos-debug.apk";
		cap.setCapability("app",appUrl);
		URL url=new URL("http://0.0.0.0:4723");
		
		AppiumDriver driver=new AndroidDriver(url,cap);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//To get current state of app-queryappstate
		
		System.out.println("Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
				
				
		Thread.sleep(2000);
		System.out.println("Now Terminating the app");
//		
//		/*
//		 * here we need some apppackage name and bundleid in case of ios
//		 */
		((AndroidDriver)driver).terminateApp("io.appium.android.apis");
//		
         System.out.println("App Terminated!");
//		
//		//To get current state of app-queryappstate
//		
      System.out.println("Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
//		
		//To install app and update
//		((AndroidDriver)driver).installApp(appUrl);
//		System.out.println("Application install and updated SuccessFully!");
//		System.out.println("Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
//
//		
      
      //To pass app in background
      ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
      
      
      System.out.println("Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

      
      //To activate any other native app--clock  com.google.android.deskclock
      
      ((AndroidDriver)driver).activateApp("com.google.android.deskclock");
      
      System.out.println("Clock  Activated!");
      
      
      
      
      
      
      
		
	}

}
