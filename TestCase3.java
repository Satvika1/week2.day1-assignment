
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Democsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.id("creatLeadForm_firstName")).click();
	((WebElement) driver.findElements(By.id("creatLeadForm_companyName"))).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("supriya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("konduru");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("25/5/1998");
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("029");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9491007020");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("satvika");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("supriya");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1-39");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("avadi");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select cc = new Select(country);
	cc.selectByVisibleText("India");
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select ss = new Select(state);
	ss.selectByVisibleText("TAMILNADU");
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600054");
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600054");
	driver.findElement(By.className("smallSubmit")).click();

}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
