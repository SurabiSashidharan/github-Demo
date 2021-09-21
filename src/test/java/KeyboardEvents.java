import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://extendsclass.com/text-compare.html");
		WebElement first=driver.findElement(By.xpath("//div[@id='dropZone']//div[9]/pre/span"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(first, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		
		WebElement second=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[4]/pre/span"));
		Thread.sleep(2000);
		action.keyDown(second, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		
		
	}

}
