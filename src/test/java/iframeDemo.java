import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/* alert_window */
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//
//		String alerttext = driver.switchTo().alert().getText();
//		System.out.println(alerttext);
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//
//		driver.switchTo().parentFrame();
//		System.out.println(driver.getTitle());

		/* prompt_window */
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		driver.switchTo().alert().sendKeys("Shrihaan");

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());

	}

}
