package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("login_theme")).sendKeys("orange");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.linkText("New Lead")).click();
        driver.findElement(By.name("salutationtype")).sendKeys("Mr.");
        driver.findElement(By.name("firstname")).sendKeys("Shubham");
        driver.findElement(By.name("lastname")).sendKeys("Jangali");
        driver.findElement(By.name("company")).sendKeys("Google");
        driver.findElement(By.name("designation")).sendKeys("Automation tester");
        driver.findElement(By.name("leadsource")).sendKeys("Employee");
        driver.findElement(By.name("industry")).sendKeys("Technology");
        driver.findElement(By.name("annualrevenue")).sendKeys("10000");
        driver.findElement(By.name("noofemployees")).sendKeys("20");
        driver.findElement(By.name("phone")).sendKeys(("8080956494"));
        driver.findElement(By.name("email")).sendKeys("shubhamjangali@gmail.com");
        driver.findElement(By.name("lane")).sendKeys("A/P Bhadgaon ");
        driver.findElement(By.name("code")).sendKeys("416502");
        driver.findElement(By.name("city")).sendKeys("Gadhinglaj");
        driver.findElement(By.name("state")).sendKeys("Maharastra");
        driver.findElement(By.name("button")).click();


        driver.findElement(By.linkText("Leads")).click();
        driver.findElement((By.linkText("Shubham Jangali"))).click();
        driver.findElement(By.name("Delete")).click();
        driver.switchTo().alert().accept();
//      driver.switchTo().alert().dismiss();


        driver.findElement(By.name("firstname")).sendKeys("Shubham");
        driver.findElement(By.name("button")).click();


    }

}
