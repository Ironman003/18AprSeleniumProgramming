package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class learnAllScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		// screenshot ? //webpage
		// web opn
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver obj = new ChromeDriver();// opn chrome // blank
//		TakesScreenshot obbb = new ChromeDriver();
		obj.get("https://meet.google.com/vkc-ovzr-umm");
		// screen file source take inter => casting ChromeDriver obj =>copy soucr to
		// dest
//		File source = obbb.getScreenshotAs(OutputType.FILE);
//		ChromeDriver  obj = new TakesScreenshot();
		File source = ((TakesScreenshot) obj).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("SCREENSHOTS/abcdmeet.jpg");
		File destD = new File("SCREENSHOTS/DirectoryImg/gmeet.jpg");
//		FileHandler.copy(source, dest);
//		FileUtils.copyFile(source, dest);
//		File destD = new File("D:");
//		FileUtils.copyFileToDirectory(source, destD);
//		FileUtils.copyFile(source, dest);
//		FileUtils.copyDirectory(dest, destD, true);
//		FileUtils.delete(dest);
		Thread.sleep(2000);
		obj.close();
	}

}
