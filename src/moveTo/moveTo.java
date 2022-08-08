package moveTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions action = new Actions(driver);
		WebElement unm = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		WebElement ff =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
		int x1 = ff.getLocation().getX();
		int y1 = ff.getLocation().getY();
		driver.manage().window().maximize();
		int x = login.getLocation().getX();
		int y = login.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
//		action.moveToElement(unm).sendKeys("a@gmail.com").build().perform();
//		action.moveToElement(pwd).sendKeys("ddd").build().perform();
		action.moveByOffset(x, y).click().build().perform();

		Thread.sleep(2000);
//		driver.close();
		Dimension d1 =  new Dimension(x1, y1);
		Point d = new Point(x1, y1);
		driver.manage().window().setSize(d1);
		driver.manage().window().setPosition(d);;
	}

}
