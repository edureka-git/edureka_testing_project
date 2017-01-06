package sample;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.xpath.operations.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ExampleOne {
public static void main(String[] args){
	try {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://twitter.com/");
	driver.findElement(By.linkText("Log In")).click();
	driver.findElement(By.xpath("//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("example.one22@gmail.com");
	driver.findElement(By.xpath("//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("example12345");
	driver.findElement(By.xpath("//div[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")).click();
	driver.findElement(By.id("search-query")).sendKeys("POTUS");
	driver.findElement(By.xpath("//form[@id='global-nav-search']/span/button")).click();
	
		Thread.sleep(2000);

	WebElement e= driver.findElement(By.xpath("//div[div[p[a[@href='http://t.co/eVVzoATsAR']]]]/div[1]/div/div/div/button"));
	e.click();
//	driver.findElement(By.xpath("//div[a[normalize-space(text())='President Obama']]")).click();
	//driver.findElement(By.xpath("//div[@data-name='President Obama']/button")).click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		  System.out.println("Got an IOException: " + e.getMessage());
	}
	
}
}