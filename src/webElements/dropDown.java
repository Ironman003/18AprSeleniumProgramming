package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown implements lengthyPaths {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(store); //implemented in interface
		WebElement day = driver.findElement(By.xpath(dateOfBirthDay));
		Select select = new Select(day); //web element is select
		List<WebElement> dayOptions = select.getOptions(); //getting select options
		for (int i = 0; i < dayOptions.size(); i++) {
			String storeDays = dayOptions.get(i).getText();//getting text of each option
			dayOptions.get(i).click();
//			String fd = dayOptions.get(i).getTagName();
//			System.out.println(fd);// option is a tag name
			Thread.sleep(200);//wait for 2 MS SEC
			System.out.println(storeDays);//printing the options
		}
		Thread.sleep(2000);//sleep for 2 SEC
		driver.close();//closing the current tab

	}
}
