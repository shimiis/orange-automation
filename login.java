package ora.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String args[]) {
	
			System.setProperty( "webdriver.chrome.driver","C:\\Browsedrivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			
			driver.findElement(By.className("button")).click();
			
			String at =driver.getTitle();
			String et ="orange";
			driver.manage().timeouts().pageLoadTimeout(70033, TimeUnit.SECONDS);
			driver.close();

		
			
			
			if(at.equalsIgnoreCase(et))
			{
			System.out.println("Test successful");
			}
			else{
			System.out.println("Test successful");
			}
			}
			}



