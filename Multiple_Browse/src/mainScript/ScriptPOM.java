package mainScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appUrl.XamppUrl;

public class ScriptPOM {

	private WebDriver driver;

	@Parameters("browser")

	@BeforeTest
	public void launchBrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("FF")) {

			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("GC")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test

	public void homePage() throws Exception {
		driver.get(XamppUrl.url);
		driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.id("next")).click();

		driver.findElement(By.id("forenames")).sendKeys("anusha");

		driver.findElement(By.id("surename")).sendKeys("sandra");

		driver.findElement(By.id("radiof")).click();

		driver.findElement(By.id("address1")).sendKeys("kphb");

		driver.findElement(By.id("address2")).sendKeys("jntu");

		driver.findElement(By.id("city")).sendKeys("hyderabad");

		driver.findElement(By.id("postalcode")).sendKeys("500001");

		driver.findElement(By.id("telephone")).sendKeys("9087654321");

		Select sel1 = new Select(driver.findElement(By.name("country")));
		sel1.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='submit']")).click();

		Select sel2 = new Select(driver.findElement(By.name("depart")));
		sel2.selectByVisibleText("London");
		driver.findElement(By.id("datepicker")).sendKeys("29/9/2015");
		Select sel3 = new Select(driver.findElement(By.name("arrive")));
		sel3.selectByVisibleText("Paris");
		driver.findElement(By.id("datepicker1")).sendKeys("01/10/2015");
		driver.findElement(By.xpath(".//*[@id='passengers']/input")).sendKeys("2");
		driver.findElement(By.id("tripcheckbox")).click();
		driver.findElement(By.id("window")).click();
		driver.findElement(By.id("first")).click();
		driver.findElement(By.id("confirm")).click();

		driver.findElement(By.id("forenames")).sendKeys("anusha");

		driver.findElement(By.id("surename")).sendKeys("sandra");

		driver.findElement(By.id("radiof")).click();

		driver.findElement(By.id("address1")).sendKeys("kphb");

		driver.findElement(By.id("address2")).sendKeys("jntu");

		driver.findElement(By.id("city")).sendKeys("hyderabad");

		driver.findElement(By.id("postalcode")).sendKeys("500001");

		driver.findElement(By.id("telephone")).sendKeys("9087654321");

		Select sel4 = new Select(driver.findElement(By.name("country")));
		sel4.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='submit']")).click();
	}

	@AfterTest
	public void closeBrowser() throws Exception {
		driver.quit();
	}
}
