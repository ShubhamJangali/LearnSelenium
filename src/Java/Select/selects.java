package Java.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class selects {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        WebElement ele = driver.findElement(By.name("login_theme"));
        Select select = new Select(ele);
        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> ls = select.getOptions();
        for (WebElement el : ls){
            System.out.println(el.getText());
        }
       // select.selectByIndex(2);
        //select.selectByValue("orange");
        select.selectByVisibleText("Aqua");
        Thread.sleep(2000);
        driver.findElement(By.name("Login")).click();

    }
}
