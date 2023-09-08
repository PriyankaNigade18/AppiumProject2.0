package mobileGuestures;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

import createSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class InteractionWithApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	   // boolean status=((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	    //System.out.println("App Termination status: "+status);
	        
	    //System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	    
	    //install
//	    String path=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+
//				"resources"+File.separator+"ApiDemos-debug.apk";
//	    
//	    ((AndroidDriver)driver).installApp(path);
	    
	    System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	    
	    //background
	    
	    ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	    
	    System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	    
	    //activate app
	    ((AndroidDriver)driver).activateApp("com.google.android.deskclock");
	    System.out.println(((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
