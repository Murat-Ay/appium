import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.http.auth.MalformedChallengeException;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class appiumDay1 {

    @Test
    public void app() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Win\\Appium01\\src\\test\\Apps\\HM.apk");
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

        //AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL( "http:localhost:4723/wd//hub" ),desiredCapabilities );

    }
}