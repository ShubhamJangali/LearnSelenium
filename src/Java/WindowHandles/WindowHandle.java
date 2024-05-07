package Java.WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://localhost:100/");
//        driver.manage().window().maximize();
//        driver.findElement(By.name("user_name")).sendKeys("admin");
//        driver.findElement(By.name("user_password")).sendKeys("admin");
//        driver.findElement(By.name("Login")).click();
//        driver.findElement(By.xpath("//a[text()='New Account']")).click();
//        driver.findElement(By.xpath("//input[@title='Change']")).click();
//        Set<String> allwin = driver.getWindowHandles();
//        Iterator<String> windows =  allwin.iterator();
//        String parentwin = windows.next();
//        System.out.println(parentwin);
//        String childwin = windows.next();
//        System.out.println(childwin);
//        driver.switchTo().window(childwin);
//        driver.findElement(By.xpath("//a[text()='vtiger']")).click();
////        Thread.sleep(2000);
//        driver.switchTo().window(parentwin);
//        driver.close();



        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//a[text()='vtiger Customer Portal']")).click();
        Set<String> allwin = driver.getWindowHandles();
        Iterator<String> windows =  allwin.iterator();
        String parentwin = windows.next();
        System.out.println(parentwin);
        String childwin = windows.next();
        System.out.println(childwin);
        driver.switchTo().window(childwin);
        driver.findElement(By.xpath("//span[@id='loginspan']")).click();
        driver.close();
//        Thread.sleep(2000);
        driver.switchTo().window(parentwin);
        driver.close();

    }
}
