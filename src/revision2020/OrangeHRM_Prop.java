package revision2020;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM_Prop {
	static Properties p;

	public static void main(String[] args) throws Exception {
		File fs = new File(".//Properties//OrangeHRM.properties");

		FileInputStream fins = new FileInputStream(fs);
		Properties p = new Properties();
		p.load(fins);
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(p.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Un = p.getProperty("username");
		String Pass= p.getProperty("password");
		driver.findElement(By.name("txtUsername")).sendKeys(Un);
		driver.findElement(By.name("txtPassword")).sendKeys(Pass);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		 driver.close();
		

	}
}