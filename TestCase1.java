package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe ");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
String title=driver.getTitle();
System.out.println(title);
driver.findElement(By.id("username")).sendKeys("Demosalemanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("contacts")).click();
driver.findElement(By.linkText("creat contacts")).click();
driver.findElement(By.id("firstNameField")).sendKeys("supriya")	;
driver.findElement(By.id("lastNameField")).sendKeys("D");
driver.findElement(By.className("smallSubmit"));
System.out.println("supriya");
driver.close();
									

	}

}
