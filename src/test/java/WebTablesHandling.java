import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablesHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		/* TofindTitle */
		JavascriptExecutor jscex = (JavascriptExecutor) driver;
		String script = "return document.title;";
		String title = (String) jscex.executeScript(script);
		System.out.println(title);
		Thread.sleep(2000);

		/* Toclickonbutton */
		driver.switchTo().frame("iframeResult");
		jscex.executeScript("myFunction()");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		// Highlight Element
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		jscex.executeScript("arguments[0].style.border='5px solid red'", button);

	//Scroll the page
		driver.navigate().to("https://www.w3schools.com/");
		WebElement sc = driver.findElement(By.xpath("//a[text()='Get started']"));
		jscex.executeScript("arguments[0].scrollIntoView(true);", sc);

	}

}
