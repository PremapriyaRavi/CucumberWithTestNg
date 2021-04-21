package org.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
    public static WebDriver driver;
	public static final String AUTOMATE_USERNAME = "premapriyaravi1";
	public static final String AUTOMATE_ACCESS_KEY = "hqNQszcvAt1swjL5ghBS";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void launchBrowserStackBrowser() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "66.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	   driver = new RemoteWebDriver(new URL(URL), caps);
}
}
