package revision2020;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> Windows = driver.getWindowHandles();
		int Wcount = Windows.size();

		System.out.println("No. of Child windows" + (Wcount - 1)); // Wcount-1 :- except parent window

		for (String Win : Windows) {
			driver.switchTo().window(Win);
			driver.manage().window().maximize();
			System.out.println("Window Tittle : " + driver.getTitle());

		}
		driver.switchTo().parentFrame();

		driver.quit();
	}
}
