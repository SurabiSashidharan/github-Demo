import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub'

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement companysize = driver.findElement(By.name("employees_c"));
		Select select = new Select(companysize);
		
		WebElement fo=select.getFirstSelectedOption();
		System.out.println(fo.getText());
		
		select.selectByValue("level1");
		Thread.sleep(5000);

		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(5000);

		select.selectByIndex(4);
		Thread.sleep(2000);
		
		

		/*
		 * driver.get(
		 * "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		 * WebElement city = driver.findElement(By.id("multi-select")); Select select =
		 * new Select(city); select.selectByIndex(3); Thread.sleep(3000);
		 * select.selectByValue("Florida"); Thread.sleep(3000);
		 * 
		 * List<WebElement> webelement1 = select.getAllSelectedOptions();
		 * System.out.println(webelement1.size());
		 * 
		 * select.deselectAll(); Thread.sleep(3000); select.selectByIndex(1);
		 * Thread.sleep(3000); select.selectByValue("Pennsylvania"); Thread.sleep(3000);
		 * 
		 * select.deselectByIndex(1); Thread.sleep(3000); List<WebElement> webelement2 =
		 * select.getAllSelectedOptions(); System.out.println(webelement2.size());
		 */

	}

}
