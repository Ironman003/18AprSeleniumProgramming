package exploreWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverMethods extends lenghtyWork {
	static driverMethods obj = new driverMethods();

	static void getClassName() {
		Class<? extends driverMethods> s = (obj.getClass());
		System.out.println(
				"Here we are getting current class name with the help pf getClass method which takes class object as parameter.");
		System.out.println("Returns the belonging class name of specified object = " + s);
	}

	void sourceCode() {
//		System.setProperty("ok google", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String s = driver.getPageSource();
		String d = driver.getWindowHandle();
		System.out.println("Here we are getting source code of specified url");
		System.out.println(s);
		driver.close();	
	}

	void windowHandle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver1.get("https://register.rediff.com/register/register.php?FormName=user_details");
		String googleId = driver.getWindowHandle();
		String rediffReg =	driver1.getWindowHandle();
		storedString(googleId);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		driver1.switchTo().window(rediffReg);
		driver1.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
//		getClassName();//CURRENT CLASS NAME
//		obj.sourceCode(); //PAGE SOURCE CODE
		obj.windowHandle(); //UNIQUE ID
	}
}
