package Java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class practice_here {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://amazon.com");
//        System.out.println("amazon");
//        driver.get("https://www.selenium.dev/");
//        Thread.sleep(10000);
//
//        Robot r = new Robot();
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_F5);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_F5);




//        driver.get("http://localhost:100/index.php?action=Login&module=Users");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
//        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
//        WebElement ele = driver.findElement(By.xpath("//select[@name='login_theme']"));
//        Select sel = new Select(ele);
//       WebElement first =  sel.getFirstSelectedOption();
//        System.out.println("The first selected option is "+first.getText());
//        List<WebElement> option = sel.getOptions();
//        System.out.println("Total options in the dropdown is "+option.size());
//        for (WebElement list:option){
//            System.out.println(list.getText());
//        }
//        WebElement ele = driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]"));

//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
//        wait.until(ExpectedConditions.visibilityOf(ele));
//        wait.until(ExpectedConditions.elementToBeClickable(ele));


//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver webDriver) {
//                return driver.findElement(By.id("foo"));
//            }
//        });


//        driver.get("https://google.com");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement ele = driver.findElement(By.id("APjFqb"));
//        js.executeScript("arguments[0].value = 'search selenium';", ele);
    }
}
