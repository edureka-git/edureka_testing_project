package sample;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class Sample_tests {

	@Test
	public void test() {
		
		  System.setProperty("webdriver.gecko.driver", "/home/edureka/geckodriver");
		
		WebDriver driver=new FirefoxDriver();
	

			 driver.get("http://edureka.co");

		//	 driver.manage().window().maximize();

			 driver.findElement(By.xpath("//header[@id='header-II']/section/nav/div/a")).click();

			 driver.findElement(By.id("inputName")).sendKeys("version@tech.edureka.in");

			 driver.findElement(By.id("pwd")).sendKeys("123456789");

			 driver.findElement(By.xpath("//form[@id='signinForm']/div[4]/button")).click();

			System.out.println("Successful");

			 

			 // TODO Auto-generated catch block

			
	}

}