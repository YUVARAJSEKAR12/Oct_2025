package com.app.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.cucumber.java.Scenario;
import com.app.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base {
	
	//before and after
	
	@Before
	public void before() {
		System.out.println("Launching Chrome with DesiredCapabilities and ChromeOptions...");
	
	//browser launch 	
//		System.out.println("Launching Chrome with DesiredCapabilities and ChromeOptions...");
//
//        // Create ChromeOptions
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");     // Maximize window
//        options.addArguments("--disable-notifications"); // Disable browser notifications
//        options.addArguments("--incognito");           // Incognito mode
//
//
//        // Initialize WebDriver
//        driver = new ChromeDriver(options);
//
//        // Implicit wait
//  //      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 // You can set browser via System property: -Dbrowser=chrome
//        String browser = System.getProperty("browser", "chrome").toLowerCase();
//        System.out.println("Launching Browser: " + browser);
//
//        switch (browser) {
//            case "chrome":
//                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.addArguments("--start-maximized");
//                chromeOptions.addArguments("--disable-notifications");
//
//                DesiredCapabilities chromeCaps = new DesiredCapabilities();
//                chromeCaps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//                chromeOptions.merge(chromeCaps);
//
//                driver = new ChromeDriver(chromeOptions);
//                break;
//
//            case "firefox":
//                DesiredCapabilities firefoxCaps = new DesiredCapabilities();
//                driver = new FirefoxDriver();
//                driver.manage().window().maximize();
//                break;
//
//            case "edge":
//                DesiredCapabilities edgeCaps = new DesiredCapabilities();
//                driver = new EdgeDriver();
//                driver.manage().window().maximize();
//                break;
//
//            default:
//                throw new IllegalArgumentException("Browser not supported: " + browser);
//        }

        // Common setup for all browsers
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}

	@After
	public void teardown(Scenario scenario) {
		//screenshots and reports 
		 System.out.println("Scenario Status:" );

//	        // Capture screenshot if test fails
//	        if (scenario.isFailed()) {
//	            try {
//	                TakesScreenshot ts = (TakesScreenshot) driver;
//	                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//	                scenario.attach(screenshot, "image/png", "Failure Screenshot");
//	                System.out.println("Screenshot attached for failed scenario.");
//	            } catch (Exception e) {
//	                System.out.println("Exception while taking screenshot: " + e.getMessage());
//	            }
//	        }
//
//	        // Close browser
//	        if (driver != null) {
//	            driver.quit();
//	            System.out.println("Browser closed successfully.");
//	        }
//	    }
		
	}
}

