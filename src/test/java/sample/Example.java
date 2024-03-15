package sample;




import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.io.File;

import java.io.IOException;

import java.util.List;



import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;





public class Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Praveen\\\\eclipse-\\\\sample\\\\target\\\\driver\\\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		String url = "https://facebook.com/";

		driver.get(url);

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("pass"));

		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));

		

		JavascriptExecutor je =(JavascriptExecutor)driver;

		je.executeScript("arguments[0].setAttribute('value','Selenium')", user,password,login);

		je.executeScript("arguments[1].setAttribute('value','praveee2')", user,password,login);

		je.executeScript("arguments[1].setAttribute('style','background:Yellow; border:2px solid red')", user,password,login);

         Thread.sleep(2000);

		Object exe = je.executeScript("return arguments[0].getAttribute('value')", user,password,login );

		System.out.println(exe);

		WebElement element = driver.findElement(By.xpath("//a[text() ='Careers']"));

		je.executeScript("arguments[0].scrollIntoView(true)", element);
Thread.sleep(2000);
		je.executeScript("arguments[0].scrollIntoView(false)", user);

		je.executeScript("arguments[2].click()", user,password,login);

		

	}



}
