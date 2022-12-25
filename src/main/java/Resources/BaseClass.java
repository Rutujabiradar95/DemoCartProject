package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver dr;
	public static void browerLaunch() throws IOException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\frames\\eclipse-workspace\\TutorialNinjaProject\\src\\main\\java\\Resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String brName=prop.getProperty("browser");
		if(brName.equalsIgnoreCase("chrome")) {
			dr=new ChromeDriver();
		}
		else {
			System.out.println("Please enter valid browser name");
		}
		//dr.get("http://tutorialsninja.com/demo/");
	}
	@BeforeTest
	public void launch() throws IOException {
		browerLaunch();
		dr.get("http://tutorialsninja.com/demo//");
		dr.manage().window().maximize();
	}
}
