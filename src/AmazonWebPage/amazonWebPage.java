package AmazonWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Saravan\\Desktop\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.amazon.co.in");
		driver.close();
	}

}
