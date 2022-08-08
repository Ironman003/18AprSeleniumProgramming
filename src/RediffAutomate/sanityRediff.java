package RediffAutomate;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sanityRediff implements rediffLengthyWork {
	static int cCount, aCount, iCount, imgCount, rCount, sCount, bCount, pCount, boldCount;

	private void show() throws InterruptedException {
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get(rediffUrl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		List<WebElement> cObj = driver.findElements(By.className("col1"));
		List<WebElement> iObj = driver.findElements(By.tagName("input"));
		List<WebElement> lObj = driver.findElements(By.tagName("a"));
		List<WebElement> imgObj = driver.findElements(By.tagName("img"));
		List<WebElement> rObj = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		List<WebElement> sObj = driver.findElements(By.tagName("select"));
		List<WebElement> bObj = driver.findElements(By.xpath("//input[@type=\"submit\"]"));
		List<WebElement> pObj = driver.findElements(By.tagName("p"));
		WebElement bTag = driver.findElement(By.tagName("b"));

		System.out.println("\n Below elements found by using class attribute:\n");
		for (WebElement classObj : cObj) {
			cCount++;
			System.out.print(classObj.isDisplayed());
			System.out.println("=" + cCount);
		}
		Thread.sleep(2000);
		System.out.println("\n Below elements found by using input tag:\n");
		Thread.sleep(3000);
		for (WebElement inputObj : iObj) {
			iCount++;
			System.out.print(inputObj.isDisplayed());
			System.out.println("=" + iCount);
		}
		Thread.sleep(2000);
		System.out.println("\n Below elements found by using anchor tag:\n");
		for (WebElement linkObj : lObj) {
			aCount++;
			System.out.print(linkObj.isDisplayed());
			System.out.println("=" + aCount);
		}
		Thread.sleep(2000);
		System.out.println("\n Below elements found by using img tag:\n");
		for (WebElement imageObj : imgObj) {
			imgCount++;
			System.out.print(imageObj.isDisplayed());
			System.out.println("=" + imgCount);
		}
		Thread.sleep(2000);
		System.out.println("\n Below elements found by using xpath:\n");
		for (WebElement radioObj : rObj) {
			rCount++;
			System.out.print(radioObj.isDisplayed());
			System.out.println("=" + rCount);
		}
		Thread.sleep(2000);
		System.out.println("\n Below elements found by using tagname \"select\":\n ");
		for (WebElement selectObj : sObj) {
			sCount++;
			System.out.print(selectObj.isDisplayed());
			System.out.println("=" + sCount);
		}
		Thread.sleep(2000);
		System.out.print("\n Below element found by using xpath:\n");
		for (WebElement buttonObj : bObj) {
			bCount++;
			System.out.print(buttonObj.isDisplayed());
			System.out.println("=" + bCount);
		}
		Thread.sleep(2000);
		System.out.println("\n Below elements found by using tagname\" p\":\n");
		for (WebElement paraObj : pObj) {
			pCount++;
			System.out.print(paraObj.isDisplayed());
			System.out.println("=" + pCount);
		}
		Thread.sleep(2000);
		System.out.println("\nBelow element found by using tagname\"b\":\n");
		if (bTag.isDisplayed()) {
			boldCount++;
			System.out.print(bTag.isDisplayed());
			System.out.println("=" + boldCount);
		}
		driver.close();
		
	}

	void showCount() {
		int count = (cCount + aCount + iCount + imgCount + rCount + sCount + bCount + pCount + boldCount);
		System.out.println("\n******************************************************");
		System.out.println("Total Count Of isDisplayed= \"true\" Webelement Is = " + (count - 2));
	}

	public static void main(String[] args) throws InterruptedException {
		sanityRediff obj = new sanityRediff();
		obj.show();
		obj.showCount();
	}
}