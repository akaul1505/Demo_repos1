package SelEvaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class login {
	WebDriver driver;
  @Test (priority=1)
  public void registration() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		WebElement signup= driver.findElement(By.xpath("//a[contains(text(), 'SignUp')]"));
		signup.click();
		
		
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("qwertyuiop");
	driver.findElement(By.xpath("//input[@name='firstName']")).click();
	Thread.sleep(10000);
		String A_value= driver.findElement(By.xpath("//span[@id='err']")).getText();
		System.out.println(A_value);
		String E_value= "Available";
		Assert.assertEquals(E_value, A_value);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("ghj");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zxcvbnm123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("zxcvbnm123");
		driver.findElement(By.xpath("//span[text()='Female']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc123@ajkj.com");
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("6756886998");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("01/05/1997");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("afsbusdbfudysbgf123");
		driver.findElement(By.xpath("//select[@name='securityQuestion']")).sendKeys("What is your favourite color?");
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("afsbusdbfudysbgf");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
  }
}
