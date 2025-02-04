package testBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClass{

	public static WebDriver driver;

	// Log4j Class
   public static Logger logger;
   public Properties p;
   
	@BeforeClass(groups= {"Sanity","Regression", "Master", "DataDriven"})
	@Parameters({"os","browser"})
	public void setup(@Optional("Windows") String os, @Optional("Chrome") String br) throws InterruptedException, IOException{
		
		// Loading config.propertis file to read the values from the config file.
		//FileReader file=new FileReader("../src/main/resources/config.properties");
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");

		if (inputStream == null) {
		    throw new FileNotFoundException("Property file not found in the classpath");
		}

		 p = new Properties();
		p.load(inputStream);

		//p=new Properties();
		//p.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
		// if we want to run the test cases through Selenium Grid then we need to these Changes in class 
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
			
			DesiredCapabilities campabilities=new DesiredCapabilities();
			
			// OS Changes to run in remote servers
			
			if(os.equalsIgnoreCase("Windows")) {
				campabilities.setPlatform(Platform.WIN10);
				
			}
			else if(os.equalsIgnoreCase("linux")) {
				campabilities.setPlatform(Platform.LINUX);
				
			}
			else if(os.equalsIgnoreCase("mac")) {
				campabilities.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("No matching os");
				return;
			}
			
			// browser Changes to run in remote servers
			
			switch(br.toLowerCase()) {
			case "chrome": campabilities.setBrowserName("chrome"); break;
			case "edge": campabilities.setBrowserName("MicosoftEdge"); break;
			case "firefox": campabilities.setBrowserName("firefox"); break;
			default :System.out.println("No matching browser"); return;
			
			}
			
			driver=new RemoteWebDriver(new URL("  http://192.168.1.39:4444/wd/hub"),campabilities);
			
		}
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
			
			switch(br.toLowerCase()){
			case "chrome"  : driver = new ChromeDriver(); break;
			case "edge"    : driver = new EdgeDriver(); break;
			case "firefox" : driver = new FirefoxDriver(); break;
			default : System.out.println("The browser is invalid"); return;
			
			}
		}
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThinkPad\\eclipse-workspace\\SREM_HybridFramework\\chromedriver.exe");
		
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.get(p.getProperty("URL"));// Reading URL from the properties file.
		Thread.sleep(1000);
		driver.manage().window().maximize();
	}
	@AfterClass(groups= {"Sanity","Regression", "Master", "DataDriven"})
	public void teardown() {
		driver.close();

	}
	public String generatingrandomemail() {
		String Randomemail=RandomStringUtils.randomAlphabetic(5);
		return Randomemail;

	}

	public String generatingrandomNumber() {
		String RandomFirstDigit=RandomStringUtils.random(1, "6789");
		String RandomNumber=RandomStringUtils.randomNumeric(9);
		return (RandomFirstDigit+RandomNumber);

	}
	
	public String captureScreenshot(String tname) {
		
	String CurrentTimestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
	File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
	
	String targetFilePath=System.getProperty("user.dir")+ "\\screenshots\\" + tname + "_" + CurrentTimestamp + ".png";
	File targetFile=new File(targetFilePath);
	
	sourceFile.renameTo(targetFile);
	System.out.println(targetFilePath);
	
		return targetFilePath;
		
	
		
		
	}

}
