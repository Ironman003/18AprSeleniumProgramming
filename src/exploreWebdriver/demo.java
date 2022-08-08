package exploreWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.get("https://www.google.co.in/");
	
}
}
