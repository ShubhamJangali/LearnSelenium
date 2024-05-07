package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowshandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Thread.sleep(5000);
        driver.findElement(By.id("newTabBtn")).click();
        Set<String> childs = driver.getWindowHandles();
        for (String child:childs){
            System.out.println(child);
        }

    }
}
