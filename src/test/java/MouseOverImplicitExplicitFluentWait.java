
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverImplicitExplicitFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/* IMPLICIT WAIT */
//		driver.get("https://www.ebay.com.au/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//		Actions action = new Actions(driver);
//		action.moveToElement(electronics).perform();
//		driver.findElement(By.xpath("//a[text()='Computer Monitors']")).click();

//		/* EXPLICIT WAIT */
//		driver.get("https://www.ebay.com.au/");
//
//		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//		Actions action = new Actions(driver);
//		action.moveToElement(electronics).perform();
//
//		WebDriverWait explicitwait = new WebDriverWait(driver,20);
//		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Computer Monitors']")))
//				.click();

		/* FLUENT WAIT */
		driver.get("https://www.ebay.com.au/");

		WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform();

		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5)).withMessage("This is custom message")
				.ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//a[text()='Computer Monitors']")).click();

	}

}
