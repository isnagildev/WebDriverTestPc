package ejemplo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest {
  private WebDriver driver;	
  @Test
  public void test() {
    driver.get("https://www.google.es");
    driver.manage().window().maximize();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
