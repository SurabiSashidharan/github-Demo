import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSliderAndClicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/#colourpicker");

//		WebElement frame = driver.findElement(By.xpath("//div[@id='content']/iframe"));
//		driver.switchTo().frame(frame);
//
//		WebElement colourpicker = driver.findElement(By.cssSelector("div#slider>span"));
//		Actions action = new Actions(driver);
//		action.dragAndDropBy(colourpicker, 100, 125).perform();
		
		/*Clicks*/
		
		driver.findElement(By.xpath("//a[text()='Colorpicker']")).click();
		Thread.sleep(3000);
		
		WebElement frame = driver.findElement(By.xpath("//div[@id='content']/iframe"));
		driver.switchTo().frame(frame);

		WebElement colourpicker = driver.findElement(By.cssSelector("div#swatch"));
		Actions action = new Actions(driver);
		action.contextClick(colourpicker).perform();
		
		

	}

}
