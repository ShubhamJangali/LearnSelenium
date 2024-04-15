package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger_xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//select[@name=\"login_theme\"]")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"New Lead\"]")).click();
        driver.findElement(By.xpath("//select[@name=\"salutationtype\"]")).sendKeys("Mr.");
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Shubham");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Jangali");
        driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("Java.Locators.facebook");
        driver.findElement(By.xpath("//input[@name=\"designation\"]")).sendKeys("Automation Tester");
        driver.findElement(By.xpath("//select[@name=\"leadsource\"]")).sendKeys("Employee");
        driver.findElement(By.xpath("//select[@name=\"industry\"]")).sendKeys("Technology");
        driver.findElement(By.xpath("//input[@name=\"annualrevenue\"]")).sendKeys("10000");
        driver.findElement(By.xpath("//input[@name=\"noofemployees\"]")).sendKeys("20");
        driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("8080956494");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("shubhamjangali@gmail.com");
        driver.findElement(By.xpath("//select[@name=\"leadstatus\"]")).sendKeys("Qualified");
        driver.findElement(By.xpath("//select[@name=\"rating\"]")).sendKeys("Active");
        driver.findElement(By.xpath("//input[@value=\"U\"]")).click();
        driver.findElement(By.xpath("//textarea[@name=\"lane\"]")).sendKeys("A/P Bhadgaon");
        driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Gadhinglaj");
        driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Maharashtra");
        driver.findElement(By.xpath("//input[@name=\"code\"]")).sendKeys("416502");
        driver.findElement(By.xpath("//input[@name=\"country\"]")).sendKeys("India");
        //driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
        driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
        driver.findElement(By.xpath("//input[@title=\"Edit [Alt+E]\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Shubh");
        driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"currentTab\"]")).click();
        // Value changes dynamically
        driver.findElements(By.xpath("//input[@name=\"selected_id\"]")).get(10).click();
        driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"firstname\"][@size=\"10\"]")).sendKeys("Shubh");
        driver.findElement(By.xpath("//input[@name=\"lastname\"][@size=\"10\"]")).sendKeys("Jangali");
        driver.findElement(By.xpath("//input[@title=\"Search [Alt+Q]\"]")).click();

    }

}
