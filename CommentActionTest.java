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
public class CommentActionTest {
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
  public void commentAction() {
    driver.get("https://www.youtube.com/watch?v=NIxAc1gDmAo");
    driver.manage().window().setSize(new Dimension(1920, 1008));
    js.executeScript("window.scrollTo(0,338)");
    {
      WebElement element = driver.findElement(By.linkText("6 месяцев назад"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("simplebox-placeholder"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("contenteditable-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("#simple-box > .style-scope")).click();
    {
      WebElement element = driver.findElement(By.id("contenteditable-root"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'Отличный доклад и человек!'}", element);
    }
    driver.findElement(By.cssSelector("yt-button-shape:nth-child(1) > .yt-spec-button-shape-next--call-to-action .yt-spec-touch-feedback-shape--touch-response-inverse > .yt-spec-touch-feedback-shape__fill")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".style-scope:nth-child(9) > #dismissible .yt-core-image--fill-parent-height"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".style-scope:nth-child(7) > #dismissible #video-title"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
