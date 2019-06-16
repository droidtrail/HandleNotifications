package webpush;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxPush {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\drivers\\geckodriver.exe");

		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);

		WebDriver driver = new FirefoxDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(10000);
		driver.quit();

	}

}
