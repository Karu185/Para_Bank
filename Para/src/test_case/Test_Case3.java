package test_case;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_Case3 {

	public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
			
			WebElement Register = driver.findElement(By.xpath("//a[text()='Register']"));
			Thread.sleep(3000);
			
			Register.click();
			
			WebElement First_Name = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
			First_Name.sendKeys("Kartik");
			
			WebElement Last_Name = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
			Last_Name.sendKeys("Rangam");
			
			WebElement Address = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
			Address.sendKeys("182, Ravivar peth");
			
			WebElement City = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
			City.sendKeys("Solapur");
			
			WebElement State = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
			State.sendKeys("Maharashtra");
			
			WebElement ZipCode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
			ZipCode.sendKeys("413005");
			
			WebElement Phone = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
			Phone.sendKeys("8669746062");
			
			WebElement SSN = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
			SSN.sendKeys("SSN");
			
			WebElement Username = driver.findElement(By.xpath("//input[@id='customer.username']"));
			Username.sendKeys("KartikRangam");
			
			WebElement Password = driver.findElement(By.xpath("//input[@id='customer.password']"));
			Password.sendKeys("KartikABCDE");
			
			WebElement CnfPassword = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
			CnfPassword.sendKeys("KartikABCDE");
			
			WebElement RegisterBtn = driver.findElement(By.xpath("//input[@value='Register']"));
			RegisterBtn.click();
			
			File Sourse = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File Dest = new File("C:\\Users\\Kartik\\Desktop\\Para Bank Testing Resourse\\ScreenShots\\validateAccount.jpg");
			
			FileHandler.copy(Sourse, Dest);
			
	}

}
