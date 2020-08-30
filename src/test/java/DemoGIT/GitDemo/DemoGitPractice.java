package DemoGIT.GitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGitPractice {
	
	@Test
	public void test() {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","D:\\Kishore_IMP\\Softwares\\soft\\Selenium_Vam\\Selenium\\New Selenium Versions_26 July 2020\\Chrome 84\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
