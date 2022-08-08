package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicImpMethods {

	static void getGoogle() throws InterruptedException {
	
		// *****************Google URL**********************
		BasicImpMethods obj = new BasicImpMethods();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize(); // maximizing the window
		Thread.sleep(2000); // puts in a sleep for 2 second
		String expectedTitle = "Google"; // getting title from title tag of HTML
		String title = driver.getTitle(); // get-title method which gives current title of web-page
		String expectedUrl = "https://www.google.co.in/"; 
		String url = driver.getCurrentUrl();
		
		if (expectedTitle.equals(title) && expectedUrl.equals(url))//comparing both title and URL 
		{
			System.out.println("Title && URL test case pass");

		} else {
			System.out.println("Title && URL test case failed");
		}
		Thread.sleep(2000);
		changeLayoutGoogle(); //calling method where we changes the layout of page
		obj.changePositionGoogle();//calling method where we changes the position
		driver.quit();        //closing the tabs
	}

	static void changeLayoutGoogle() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Dimension d = new Dimension(25, 500);// layout dimension set to the current page
		driver.manage().window().setSize(d); // provided d object to the set-size method.
		driver.findElement(By.name("q")).sendKeys("You have changed the Layout of web page");
		Thread.sleep(3000); // puts in a sleep for 2 second
		driver.manage().window().minimize();
		driver.close(); // closes the current opened window
		driver.findElement(By.partialLinkText("g"));
	}
	void changePositionGoogle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(8000);
//		Point p = new Point(200,25);	//Position of web-page changed
//		driver.manage().window().setPosition(p); 
//		Thread.sleep(2000);
		//Find the web-element by using the method.
//		driver.findElement(By.name("q")).sendKeys("Good! you have changed the position of web page");
//		Thread.sleep(1000);
		driver.manage().window().minimize();
//		driver.close();//closes the current web-page window 
	}

	public static void main(String[] args) throws InterruptedException {
//		ChromeDriver driver = new ChromeDriver();
//		BasicImpMethods obj = new BasicImpMethods();
//		getGoogle();
//		obj.changePositionGoogle();
		changeLayoutGoogle();
//		obj.changeLayoutGoogle();
//		driver.close();  
//		driver.quit();
	}
}
