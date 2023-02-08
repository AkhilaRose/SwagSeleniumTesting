package configiration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver ;

	public static void initialisation()   {
		String browser = System.getProperty("browsername", "chrome"); // To take browser value
		switch (browser) // using maven from cmd using command
		{
		case "chrome":
			driver=new ChromeDriver();  
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		
		default:
			System.out.println("Entered browser not present in config.properties file");
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}
