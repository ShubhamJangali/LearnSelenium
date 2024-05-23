package Java.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Practice_Here {
    public static void main(String[] args) throws InterruptedException, AWTException {
        //System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
//        driver.findElement(By.partialLinkText("New Product")).click();

        // Using Sendkeys

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,500)","");
//        driver.findElement(By.xpath("//input[@name='imagename']")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\git.txt");


        // Using Robot Class

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        String file = "C:\\Users\\HP\\OneDrive\\Desktop\\git.txt";
        StringSelection selection = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//input[@name='imagename']"))).click().perform();
        Thread.sleep(3000);

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }
}
