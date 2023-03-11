package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Demo {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,3000)");
	     
	}
	
		
	

}
