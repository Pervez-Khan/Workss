package itera;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IteraAutomation extends IteraBaseClass {

	@Test(priority =1)
	public void NavigateToTestAutomation() {
		
		driver.findElement(By.linkText("Test Automation")).click();
	}
	@Test(priority =2)
	public void FillDetails() throws IOException {
		
		driver.findElement(By.id("name")).sendKeys("Robert Junior");
		driver.findElement(By.id("phone")).sendKeys("9742106666");
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("anhkahf@xyz.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("kafkag");
		driver.findElement(By.id("address")).sendKeys("Park Circus, Kolkata");
		driver.findElement(By.name("submit")).click();
		TakeScreenShot("Form");
		
	}
	@Test(priority =3)
	public void radioButtonAndCheckBox() {
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("wednesday")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("friday")).click();
		driver.findElement(By.id("sunday")).click();
	}
	
}
