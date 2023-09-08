package createSession;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SessionWithOptions {

	public static void main(String[] args) throws MalformedURLException
	{
		String path=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+
				"resources"+File.separator+"ApiDemos-debug.apk";

		UiAutomator2Options option=new UiAutomator2Options();
		option.setDeviceName("pixel_6").setAutomationName("UiAutomator2")
		.setApp(path);
		
		//Server 
		URL url=new URL("http://0.0.0.0:4723");
		
		//driver
		AppiumDriver driver=new AndroidDriver(url,option);
				
		
		

	}

}
