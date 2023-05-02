// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ChangePlaylistTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void changePlaylist() {
    driver.get("https://www.youtube.com/playlist?list=PLlXQGa4zzXd5A4JuvIa-pmwiFIbuUwU1Z");
    driver.manage().window().setSize(new Dimension(945, 1008));
    {
      WebElement element = driver.findElement(By.cssSelector(".metadata-wrapper > .style-scope > #edit-button .yt-spec-touch-feedback-shape__fill"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".metadata-wrapper > .style-scope > #edit-button .yt-spec-touch-feedback-shape__fill")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#input-2 > .style-scope")).click();
    driver.findElement(By.cssSelector("#input-2 > .style-scope")).sendKeys("Клименков не Топ");
    driver.findElement(By.id("primary")).click();
  }
}
