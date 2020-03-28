package Internshipassiment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Script to send an email-----

public class SendanEmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shilpa Khandge\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MICROSECONDS);

		driver.get(
				"https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1582364466&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3dff12070b-1197-d4c2-4372-70a0ebbd5738&id=292841&aadredir=1&whr=yahoo.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		driver.findElement(By.name("loginfmt")).sendKeys("sak12314@yahoo.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement nextbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))); 
				
		nextbtn.click();
		driver.findElement(By.name("passwd")).sendKeys("Sak@12314");
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement loginbutton = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign in'and @id='idSIButton9']")));
		loginbutton.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		WebElement newmailbtn = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'New message')]")));
		newmailbtn.click();
		
						
		
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		WebElement totextfld = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='ms-BasePicker-input pickerInput_ecad0f63']")));
		totextfld.sendKeys("priyankashahane3696@gmail.com");
	
		WebDriverWait wait4 = new WebDriverWait(driver, 25);
		WebElement subfld = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("subjectLine0")));
		subfld.sendKeys("Hello");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 30);
		WebElement draftfld = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_4utP_vaqQ3UQZH0GEBVQe B1QSRkzQCtvCtutReyNZ _17ghdPL1NLKYjRvmoJgpoK _2s9KmFMlfdGElivl0o-GZb']")));
		draftfld.sendKeys("Hello selenium");
		
		WebDriverWait wait6 = new WebDriverWait(driver, 35);
		WebElement sendbtn = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Send')]")));
		sendbtn.click();		
			}
}
