package sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class act {

        private static Logger Log = LogManager.getLogger(sample.act.class.getName());

        public static void main(String[] args) {

            Log.debug("Setting chrome driver property");
            System.setProperty("webdriver.chrome.driver","/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
            WebDriver driver =new ChromeDriver();
            driver.manage().window().maximize();
            Log.info("Window Maximized");
            Log.debug("Now hitting Amazon server");
            driver.get("https://www.amazon.com/");
            Log.info("Landed on amazon home page");
            Actions a =new Actions(driver);

/* a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))) .click().keyDown(Keys.SHIFT).sendKeys("capitalletters").doubleClick().build().perform();
a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();*/


            driver.get("http://jqueryui.com/demos/droppable/");
            Log.debug("Getting the frames count");
            System.out.println(driver.findElements(By.tagName("iframe")).size());
            Log.info("Frames count retreived");
            try
            {
                driver.switchTo().frame(0);
                Log.info("Successfully switched to frame");
            }
            catch(Exception e)
            {
                Log.error("Cannot identify the frame");
            }
//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
            Log.debug("Identifying Draggable objects");
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));
            new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
            Log.info("Drag and drop success");

            driver.quit();

        }
}
