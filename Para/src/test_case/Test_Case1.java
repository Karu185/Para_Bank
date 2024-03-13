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

public class Test_Case1 {		

			public static void main(String[] args) throws IOException {
				
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
				
				WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
				
				Username.sendKeys("Kartik");
				
				WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
				
				Password.sendKeys("fyvhjh");
				
				WebElement SubmitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
				
				SubmitBtn.click();
				
				
				File Sourse = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				File Dest = new File("C:\\Users\\Kartik\\Desktop\\Para Bank Testing Resourse\\ScreenShots\\InvalidCredential.jpg");
				
				FileHandler.copy(Sourse, Dest);
				

	}

}
