import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumKurulum {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();

        //      desiredCapabilities.setCapability("automationName", "UiAutomator2");
        //      desiredCapabilities.setCapability("platformName", "Android");

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Notebook\\IdeaProjects\\Appium01\\src\\test\\Apps\\Calculator.apk");


//       desiredCapabilities.setCapability("automationName", "UiAutomator2");
//       desiredCapabilities.setCapability("platformName", "Android");
//       desiredCapabilities.setCapability("deviceName", "PIXEL");
//       desiredCapabilities.setCapability("platformVersion", "11.0x86");
//       desiredCapabilities.setCapability("app", "C:\\Users\\Notebook\\IdeaProjects\\Appium01\\src\\test\\Apps\\Calculator.apk");


        AndroidDriver<MobileElement> driver =new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);


    }

}
