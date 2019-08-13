package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.findElement(By.id("email")).sendKeys("asdasadsa");
		//driver.findElement(By.id("pass")).sendKeys("asdasadsa");
		driver.findElement(By.id("identifierId")).sendKeys("aditya.bhave41@gmail.com");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		String t  = driver.getTitle();
		System.out.println(t);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		Thread.sleep(3000);
		driver.close();
	}

}
