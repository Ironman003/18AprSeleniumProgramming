package RediffAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class rediff implements rediffLengthyWork {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(chromeKey, chromePath);
		WebDriver driver = new ChromeDriver();
		driver.get(rediffUrl);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement nameTxt = driver.findElement(By.name("fullname"));
		WebElement emailTxt = driver.findElement(By.xpath(email));
		WebElement passTxt = driver.findElement(By.xpath(pass));
		WebElement repassTxt = driver.findElement(By.xpath(repass));
		WebElement genderTxt = driver.findElement(By.xpath(gender));
		WebElement selectDayTxt = driver.findElement(By.xpath(selectDay));
		WebElement selectedMonthTxt = driver.findElement(By.xpath(selectMonth));
		WebElement selectedYearTxt = driver.findElement(By.xpath(selectYear));
		WebElement enterCity = driver.findElement(By.id("signup_city"));
		int count = 0;
		if (enterCity.isDisplayed()) {
			count++;
			System.out.println(count);

		} else {
			System.out.println("not");
		}
		if (emailTxt.isDisplayed()) {
			count++;
			System.out.println(count);
		}
		WebElement enterSchool = driver.findElement(By.name("school"));
		WebElement enterCollege = driver.findElement(By.xpath(college));
		WebElement enterCaptcha = driver.findElement(By.xpath(captcha));
		WebElement signUp = driver.findElement(By.className("submitbtn"));
		Select selectedDay = new Select(selectDayTxt);
		Select selectedMonth = new Select(selectedMonthTxt);
		Select selectedYear = new Select(selectedYearTxt);

		nameTxt.sendKeys("Akshay Kamble");
		Thread.sleep(1000);
		emailTxt.sendKeys("mrakshaykamble@gmail.com");
		Thread.sleep(1000);
		passTxt.sendKeys("qwerty03");
		Thread.sleep(1000);
		repassTxt.sendKeys("qwerty03");
		Thread.sleep(1000);
		genderTxt.click();
		Thread.sleep(1000);
		selectedDay.selectByIndex(12);
		Thread.sleep(1000);
		selectedMonth.selectByValue("01");
		Thread.sleep(1000);
		selectedYear.selectByVisibleText("1995");
		Thread.sleep(1000);
		enterCity.sendKeys("Kolhapur");
		Thread.sleep(1000);
//		enterCity.clear(); // Clears the DOM element
		enterSchool.sendKeys("D.M High School");
		Thread.sleep(1000);
		enterCollege.sendKeys("D.Y.P Engineering College");
		Thread.sleep(1000);
		enterCaptcha.sendKeys("We can not Automate the Captcha");
		Thread.sleep(1000);
		signUp.click();
		Thread.sleep(1000);
//		try {
		driver.navigate().refresh();
		// .click causes stale exception so we are refreshing page b4 that we can make
		// use of try catch also
		WebElement investerInfoClick = driver.findElement(By.xpath(investerInfo));
		investerInfoClick.click();
//		} catch (Exception e) {
//			System.out.println("Exception handled" + e);
//		}
		Thread.sleep(5000);
		driver.close();
	}
}
