package revision2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Facebook.com/");

		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		driver.findElement(By.name("lastname")).sendKeys("Sakate");
		driver.findElement(By.name("reg_email__")).sendKeys("PriyankaSakate24@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("PriyankaSakate24@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pinka123");

		WebElement day_dd = driver.findElement(By.name("birthday_day"));
		WebElement month_dd = driver.findElement(By.name("birthday_month"));
		WebElement year_dd = driver.findElement(By.name("birthday_year"));

		new Select(day_dd).selectByVisibleText("24");
		Thread.sleep(3000);
		new Select(month_dd).selectByVisibleText("Apr");
		Thread.sleep(3000);
		new Select(year_dd).selectByVisibleText("1996");
		Thread.sleep(3000);

		// Female Gender Radio button
		driver.findElement(By.id("u_0_6")).click();
		System.out.println("Female Radio Btn is Enable:" + driver.findElement(By.id("u_0_6")).isEnabled());
		System.out.println("Male Radio Btn is Selected:" + driver.findElement(By.id("u_0_7")).isSelected());
		driver.close();
	}

}
