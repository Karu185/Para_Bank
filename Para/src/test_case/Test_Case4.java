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
import org.openqa.selenium.support.ui.Select;

public class Test_Case4 {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		
		Username.sendKeys("Kartik");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		
		Password.sendKeys("KartikABCD");
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		SubmitBtn.click();
		
		WebElement TransferFund = driver.findElement(By.xpath("//a[text()='Transfer Funds']"));
		TransferFund.click();
		
		WebElement Amount = driver.findElement(By.xpath("//input[@id='amount']"));
		Amount.sendKeys("$10,000");
		
		WebElement FromAmount = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		
File Sourse = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest = new File("C:\\Users\\Kartik\\Desktop\\Para Bank Testing Resourse\\Failed Test Cases\\TransferFund.jpg");
		
		FileHandler.copy(Sourse, Dest);
		
		Select From = new Select(FromAmount);
		From.selectByVisibleText("14343");
		
		WebElement ToAmount = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		
		Select To = new Select(ToAmount);
		To.selectByVisibleText("14343");
		
		
		
		WebElement Transfer = driver.findElement(By.xpath("//input[@value='Transfer']"));
		Transfer.click();
		
		
		
		
		
		
	
		

	}

}
