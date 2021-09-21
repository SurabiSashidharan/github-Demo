
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GodBless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Browser
		// Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://sugarcrm.com");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);

		driver.findElement(By.xpath("//span[text()='Get A Demo']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.close();		

	}

}
