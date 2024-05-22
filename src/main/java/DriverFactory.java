import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;

public class DriverFactory {

    private AndroidDriver driver;

    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability(APP_PACKAGE, " com.android.settings");
        capabilities.setCapability(APP_ACTIVITY,"com.android.settings.Settings");
        capabilities.setCapability(DEVICE_NAME, "emulator-5554");



        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        return new AndroidDriver(remoteUrl, capabilities);
    }

}
