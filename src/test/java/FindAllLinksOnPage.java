import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinksOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
//		List<WebElement> webelement=driver.findElements(By.tagName("a"));
//		System.out.println(webelement.size());
//		
//		for(int i=0;i<webelement.size();i++)
//		{
//			System.out.println("Link is:"+" "+webelement.get(i).getAttribute("href"));
//			System.out.println("Link is about:"+" "+webelement.get(i).getText());
//		}
		
		List<WebElement> webelement1=driver.findElements(By.cssSelector("select[name='employees_c']>option"));
		
		for(int i=1;i<webelement1.size();i++)
		{
			System.out.println("Drop Down Value "+i+"is :"+" "+webelement1.get(i).getText());
		}
		

	}

}
