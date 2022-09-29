package itera;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IteraAuto2nd extends IteraAutomation {


	@Test(priority =4)
	public void SelectFromDropDown() throws IOException {
		
		WebElement country = driver.findElement(By.className("custom-select"));
		Select s = new Select(country);
		s.selectByValue("6");
		TakeScreenShot("Country");
	}
	@Test(priority =5)
	public void RadioCheck() throws IOException {
		driver.findElement(By.xpath("//label[ contains(text(),'2 years')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Selenium Webdriver')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Cucumber')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'TestNG')]")).click();
		TakeScreenShot("Complete");
	}
	@Test(priority =6)
	public void upload() {
		driver.findElement(By.xpath("//input[@id='inputGroupFile02']")).
		sendKeys("C:\\Users\\HOME\\Documents\\c programing.txt");
		driver.findElement(By.className("input-group-text")).click();
	}
}
