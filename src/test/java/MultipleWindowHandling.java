import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();

		driver.findElement(
				By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		System.out.println(childwindow);

		driver.switchTo().window(childwindow);

		driver.findElement(By.name("UserFirstName")).sendKeys("Shrihaan");
		driver.findElement(By.name("UserLastName")).sendKeys("Shiju");

	}

}
