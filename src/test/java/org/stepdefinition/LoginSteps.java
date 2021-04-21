package org.stepdefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.*;
public class LoginSteps extends BaseClass {
	//WebDriver driver;
	@Given("The user has to be in the CrazySales login page")
	public void the_user_has_to_be_in_the_CrazySales_login_page() throws MalformedURLException {
		launchBrowserStackBrowser();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\CucumberWithTestNG\\Drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.get("https://www.crazysales.com.au/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	@When("The user fill the username and password")
	public void the_user_fill_the_username_and_password() {
		WebElement logIcon = driver.findElement(By.xpath("//div[@class='clf acc_head']/i"));
		logIcon.click();
		WebElement signBtn = driver.findElement(By.xpath("(//a[text()='Sign In'])[2]"));
		signBtn.click();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Pinky");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("12345");
		txtPass.click();
	}
	@When("click login")
	public void click_login() {
		WebElement logBtn = driver.findElement(By.id("login-button"));
		logBtn.click();
	}
	@Then("The user should navigate to the invalid login page")
	public void the_user_should_navigate_to_the_invalid_login_page() {
		System.out.println("user should navigate to invalid login page");
		driver.quit();
	}
	@When("The user fill the {string} and {string} and {string}")
	public void the_user_fill_the_and_and(String email, String pw, String cpw) {
		WebElement joinNew = driver.findElement(By.xpath("//a[text()='Join']"));
		joinNew.click();
		WebElement regBtn=driver.findElement(By.xpath("//a[@class='darkred']"));
		regBtn.click();
		WebElement regEmail = driver.findElement(By.xpath("//input[@id='reg-email']"));
		regEmail.sendKeys(email);
		WebElement  regPw= driver.findElement(By.xpath("//input[@id='reg-password']"));
		regPw.sendKeys(pw);
		WebElement regConPw = driver.findElement(By.xpath("//input[@id='reg-confirmpassword']"));
		regConPw.sendKeys(cpw);
	}
	@When("click on create new button")
	public void click_on_create_new_button() {
		WebElement createBtn = driver.findElement(By.xpath("//input[@id='reg-button']"));
		createBtn.click();
	}
	@Then("The user  was registered sucessfully")
	public void the_user_was_registered_sucessfully() {
		System.out.println("The user registered successfully");
		driver.quit();
	}

}
