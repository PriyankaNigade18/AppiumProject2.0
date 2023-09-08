package createSession;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;

public class TestSession {

	public static void main(String[] args) throws MalformedURLException
	{
		AppiumDriver driver=CreateAppiumSession.initializeSession();
		System.out.println(driver.getSessionId());
	}

}
