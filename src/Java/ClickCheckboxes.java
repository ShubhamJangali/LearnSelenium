package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

// for select multiple checkboxes
// //tr[contains(td/a/text(), 'Guddadevi')]/td/input[@type='checkbox']

public class ClickCheckboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/index.php?module=Accounts&action=index");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.findElement(By.xpath("(//a[text()=\"Accounts\"])[1]")).click();
        List<WebElement> Checkboxes = driver.findElements(By.xpath("//tr[contains(td/a/text(), 'Guddadevi')]/td/input[@type='checkbox']"));
        for (WebElement boxes : Checkboxes){
            boxes.click();
        }
    }
}
