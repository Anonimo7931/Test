package com.quality;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;

public class Chrome {
	private WebDriver driver;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Utest.com");
	}
	
	@Test
	public void testGoogle() throws InterruptedException {
		//press the button "join today" by class with name unauthenticated-nav-bar__sign-up
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']")).click();
		//wait 6 seconds to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//select values required to step 1
		WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
		WebElement emailAddress = driver.findElement(By.xpath("//*[@id='email']"));
		Select  month = new Select (driver.findElement(By.xpath("//select[@name='birthMonth']")));
		Select  day = new Select (driver.findElement(By.xpath("//select[@name='birthDay']")));
		Select  year = new Select (driver.findElement(By.xpath("//select[@name='birthYear']")));
		
		
		int n = 1;//limit
		for(int i = 0; i<= n;i = i+1) {
			//step 1: Tell us about yourself
			//clear values
			firstName.clear();
			lastName.clear();
			emailAddress.clear();
			month.selectByIndex(0);
			day.selectByIndex(0);
			year.selectByIndex(0);
			//create a character limit
			Random random = new Random();

			int value = random.nextInt(14) + 6;
			int ascii = 0;
			String name = "";
			String lastname = "";
			String email = "";
			for(int j = 0; j<= value;j = j+1) {
				ascii = random.nextInt(122 - 97) + 97;
				name = name + Character.toString(ascii) ;
				ascii = random.nextInt(122 - 97) + 97;
				//System.out.println(ascii);
				lastname = lastname + Character.toString(ascii);
				
				//System.out.println(random.nextInt(12) + 1);
			}
			email = name + "." + lastname + "@gmail.com";
			firstName.sendKeys(name);
			lastName.sendKeys(lastname);
			emailAddress.sendKeys(email);
			month.selectByIndex(random.nextInt(12) + 1);
			day.selectByIndex(random.nextInt(31) + 1);
			year.selectByIndex(random.nextInt(50) +1);
			//month.selectByIndex(0);
			//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//step 2: Add your address
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//a[@class='btn btn-blue']")).click();
			//select values required to step 2
			//These values are autofill
			//WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
			//WebElement postalCode = driver.findElement(By.xpath("//*[@name='zip']"));
			//WebElement country = driver.findElement(By.xpath("//*[@name='countryId']"));
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//a[@class='btn btn-blue pull-right']")).click();
			//step 3: Tell us about your devices
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//a[@class='btn btn-blue pull-right']")).click();
			
			WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
			WebElement rpass = driver.findElement(By.xpath("//*[@name='confirmPassword']"));
			
			pass.clear();
			rpass.clear();
			pass.sendKeys("Test12345*");
			rpass.sendKeys("Test12345*");
			driver.findElement(By.xpath("//*[@name='termOfUse']")).click();
			driver.findElement(By.xpath("//*[@name='privacySetting']")).click();
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//a[@class='btn btn-blue']")).click();
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']")).click();
		}
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//System.out.println("Bien");
	}
	@After
	public void close() {
		driver.quit();
	}
}
