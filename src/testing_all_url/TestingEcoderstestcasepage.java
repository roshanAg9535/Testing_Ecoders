package testing_all_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcoderstestcasepage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/testcase");
		Thread.sleep(5000);
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String sourcecode= driver.getPageSource();
		System.out.println(sourcecode);
		String Url = "http://127.0.0.1:5000/testcase";
		if(Url.equals(url))
		{
			System.out.println("Url matched test case has passed");
		}
		else
		{
			System.out.println("Url did not match,Url test case failed");
		}
		driver.quit();
		
	}

}
