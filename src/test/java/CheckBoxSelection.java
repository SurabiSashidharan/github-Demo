import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		Thread.sleep(2000);

		WebElement webelement = driver.findElement(By.xpath("//input[@id='doi0']"));
		Actions a = new Actions(driver);
		a.moveToElement(webelement);
		a.perform();

//		driver.findElement(By.id("interest_market_c0")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("interest_market_c0")).click();
		
		List<WebElement> webelements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		webelements.get(1).click();
		webelements.get(2).click();
		
	}

}
