package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("Demosalemanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Find Accounts")).click();
driver.findElement(By.xpath("//span[text()='Email']")).click();
Thread.sleep(2000);
driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
Thread.sleep(2000);
driver.close();

	}

}
