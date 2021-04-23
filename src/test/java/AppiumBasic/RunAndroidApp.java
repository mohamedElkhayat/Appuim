package AppiumBasic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RunAndroidApp {

	@Test
	public void Operate_Android_Calculator() throws MalformedURLException
	{
		DesiredCapabilities Caps = new DesiredCapabilities();
		
		Caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Vois");
		Caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator t16");
		Caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.calculator");
		
		
		//WebDriverManager.chromedriver().setup();
		//Caps.setCapability("ChromedriverExecutable",WebDriverManager.chromedriver().getBinaryPath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Caps);
		
	 
	 
	 
}
}
