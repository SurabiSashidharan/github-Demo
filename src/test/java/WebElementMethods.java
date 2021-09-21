import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sindi");
		driver.findElement(By.name("firstname")).clear();

		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getSize());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getLocation());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getTagName());
		//System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getText());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//a[@class='skip-to sr-only\']")).getText());

	}

}
