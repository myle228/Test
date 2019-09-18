package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//System.out.println("hello");
//	}
	public WebDriver driver = null;
	@Test
	public void Demo() throws IOException {
		System.out.println("hello July");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/myle/eclipse-workspace/TestNG-demo/src/test/datadriven.properties");
		prop.load(fis);
		if (prop.getProperty("browser").equals("firefox")){
			 driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equals("chrome")) {
			 driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	@BeforeTest
	public void expenseJuly() {
		System.out.println("more than half income");
	}
	

}
