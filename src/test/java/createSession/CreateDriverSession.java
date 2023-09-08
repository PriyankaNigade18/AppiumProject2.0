package createSession;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateDriverSession 
{

	public static void main(String[] args) throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_6");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		
		//application path
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"\\src\\test\\resources\\ApiDemos-debug.apk");
		//path android and ios
		String path=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+
				"resources"+File.separator+"ApiDemos-debug.apk";
//		cap.setCapability(MobileCapabilityType.APP,path);
		
		
		//server address
		URL url=new URL("http://0.0.0.0:4723");
		//create a session with AppiumDriver
		AppiumDriver driver=new AndroidDriver(url,cap);
		System.out.println(driver.getSessionId());
	
		
		

	}

}
