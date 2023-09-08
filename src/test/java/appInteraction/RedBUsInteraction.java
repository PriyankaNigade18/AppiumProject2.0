package appInteraction;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RedBUsInteraction {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("automationName","UiAutomator2");
		cap.setCapability("platformVersion", "12"); 
		cap.setCapability("deviceName","OP555BL1");
		cap.setCapability("platformName","Android");
		
		cap.setCapability(MobileCapabilityType.UDID, "DEKZ5XPBO7JFJNQG");
		
		cap.setCapability("app","C:\\apkfiles\\redbus19.5.1.apk");
		
        
        
        cap.setCapability("appPackage", "in.redbus.android");
        cap.setCapability("appWaitActivity", ".root.HomeScreen");//wait for this activity
        cap.setCapability("noReset", true);// if app already is installed
        cap.setCapability("appium:forceAppLaunch", true); // force the app to launch if not opened automatically
        
        
        
        
        URL url=new URL("http://127.0.0.1:4723");
        
        AppiumDriver driver = new AndroidDriver(url, cap);
        
        // Putting app to background
        ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(10));
        
              
        //Terminate the app
        ((AndroidDriver)driver).terminateApp("in.redbus.android");
        System.out.println("Terminated app");
        
        driver.quit();
	}

}
