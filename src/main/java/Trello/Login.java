package Trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/login");
		
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("srushti.newase20@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("11012021");

		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='password']"));
		ele.sendKeys(String.valueOf("11012021"));
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='board-tile mod-add']")).click();
		//WebElement el = driver.findElement(By.id("ssIFrame_google"));
		//driver.switchTo().frame("ssIFrame_google");
	
		
		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/form/div[1]/label/input")).click();
		//driver.findElement(By.cssSelector("._34UgjJGHhRxDQr .nch-textfield__input._2N2CjUFKhgeXLO._2N2CjUFKhgeXLO._3pXGTS3_pwahBt")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Project");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Start free trial']")).click();
		
		
	}

}

	