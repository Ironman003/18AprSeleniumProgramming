package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableHandels {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/indices");
		driver.manage().window().maximize();
		WebElement showMoreLess = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMoreLess.click();
		Thread.sleep(2000);
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='dataTable']//tr[1]//td"));

		System.out.println(row.get(1));
		System.out.println(col.size());

		for (int i = 0; i < row.size(); i++) {
			System.out.println(row.get(i).getText());
			row.get(i).getTagName();
			System.out.println(row.get(i).getTagName());
			
		}

//		ArrayList<WebElement> obj = new ArrayList<>(row);
//		System.out.println(obj.size());
//		WebElement store = driver.findElement(By.xpath("//a[text()='See all 100 market voices']"));
//		System.out.println(obj.size());
//		System.out.println(obj.get(15).getText());
//
//		for (WebElement webElement : obj) {
//			System.out.println(webElement.getText());
//		}
		Thread.sleep(2000);
		driver.close();
	}

}
