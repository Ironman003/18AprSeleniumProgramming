package RediffAutomate;

public interface rediffLengthyWork {
	String chromePath = "chromedriver.exe";
	String chromeKey = "WebDriver.chrome.driver";
	String rediffUrl = "https://is.rediff.com/signup/register";
	String email = "//input[@name='emailid']";
	String pass = "//input[@name='pass']";
	String repass = "//input[@name='repass']";
	String gender = "//input[@value='m']";
	String selectDay = "//select[@name='date_day']";
	String selectMonth = "//select[@name='date_mon']";
	String selectYear = "//select[@name='Date_Year']";
	String college = "//input[@onfocus='validateSignupForm(5)']";
	String captcha = "//input[@name='fld_captcha']";
	String investerInfo="//a[text()='Disclaimer']";
	//a[text()='Investor Information']
}
