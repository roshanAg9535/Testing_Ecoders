package ecoders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcodersdefectpage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/defect");
		Thread.sleep(5000);
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String sourcecode= driver.getPageSource();
		System.out.println(sourcecode);
		String title = "Ecoders-Defectreportpage";
		if(title.equals(titleofpage))
		{
			System.out.println("Title matched test case has passed");
		}
		else
		{
			System.out.println("Tile did not match,Tile test case failed");
		}
		driver.quit();
		
	}

}
