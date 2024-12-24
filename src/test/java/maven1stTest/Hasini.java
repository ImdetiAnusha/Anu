package maven1stTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hasini {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();//open browser
driver.manage().window().maximize();//maximize
driver.get("https://chatgpt.com/");//launch site
Thread.sleep(5000);
driver.findElement(By.className("placeholder")).click();//sending keys

driver.close();





	}

}
