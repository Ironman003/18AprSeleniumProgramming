package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "chromdriver.exe");
//		WebDriver driver = new ChromeDriver();
		ChromeOptions chOp = new ChromeOptions();
		chOp.addArguments("headless");
		ChromeDriver driver = new ChromeDriver(chOp);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		TakesScreenshot obj = new ChromeDriver();
		//CREATED SCREEN SHOT INTERFACE WUTH OUTPUT TYPE FILE.
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(srcFile);
		File destFile = new File("SCREENSHOTS/googlef.png");//PATH OF THE FOLDER
//		FileHandler.copy(srcFile, destFile);
		File destDir = new File("D:");  //D: directory
		FileUtils.copyFileToDirectory(srcFile, destDir); //SAVED FILE ON D DIRECTORY
		FileUtils.copyFile(srcFile, destFile); // SAVED FILE OF FOLDER
		System.out.println(destFile);
		Thread.sleep(3000);
		driver.close();
	}
}
