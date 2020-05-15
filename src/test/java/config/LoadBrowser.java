package config;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoadBrowser {
  
  public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
  System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM SOFTWARE\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  
  
  }

  @AfterClass
  public void afterClass() {
  
	  driver.quit();
  }

}
