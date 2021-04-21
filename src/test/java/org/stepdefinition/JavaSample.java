package org.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.net.URL;
public class JavaSample {
	public static final String AUTOMATE_USERNAME = "premapriyaravi1";
	public static final String AUTOMATE_ACCESS_KEY = "hqNQszcvAt1swjL5ghBS";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "66.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Priyaa");
		WebElement txtPass= driver.findElement(By.id("pass"));
		txtPass.sendKeys("12345");
		WebElement logBtn= driver.findElement(By.name("login"));
		logBtn.submit();
		System.out.println(driver.getTitle());
		driver.quit();
	}
} 