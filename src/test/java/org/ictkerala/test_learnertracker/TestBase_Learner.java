package org.ictkerala.test_learnertracker;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.ictkerala.ictaklearnertracker.Officer;
import org.ictkerala.ictaklearnertracker.Trainer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase_Learner {

WebDriver driver;
Trainer Logobj;
Officer Logobj1;
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		String downloadFilepath = System.getProperty("user.dir");
		chromePrefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", chromePrefs);
	    driver = new ChromeDriver(options);
	    /*File file = new File(downloadFilepath+"\\SampleCSV - Sheet1.csv");
	    if(file.exists())
	    {
	    	System.out.println("file got successfully downloaded");
	    }
	    else
	    {
	    	System.out.println("file is not downloaded");
	    }*/
		driver.get("https://learnertracker.netlify.app/");
		Logobj = new Trainer(driver);
		Logobj1 = new Officer(driver);
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
   @AfterClass
 public void TearDown()  {
	  
	   System.out.println("all testcase exicuted");
	   //driver.quit();
	   
  }

}

