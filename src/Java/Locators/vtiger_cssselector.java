package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger_cssselector {
    public static void main(String[] args) {
        System.setProperty("webdtiver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("admin");
        driver.findElement(By.cssSelector("select[name=login_theme]")).sendKeys("Aqua");
        driver.findElement(By.cssSelector("input[name=Login]")).click();
        driver.findElement(By.cssSelector("td[class='moduleMenuBg']>table>tbody>tr>td:nth-child(3)>a")).click();
        driver.findElement(By.cssSelector("select[name=salutationtype]")).sendKeys("select[name=salutationtype]");
        driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Shubham");
        driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Jangali");
        driver.findElement(By.cssSelector("input[name=company]")).sendKeys("Java.Locators.facebook");
        driver.findElement(By.cssSelector("input[name=designation]")).sendKeys("Automation Tester");
        driver.findElement(By.cssSelector("select[name=leadsource]")).sendKeys("Employee");
        driver.findElement(By.cssSelector("select[name=industry]")).sendKeys("Technology");
        driver.findElement(By.cssSelector("input[name=annualrevenue]")).sendKeys("10000");
        driver.findElement(By.cssSelector("input[name=noofemployees]")).sendKeys("20");
        driver.findElement(By.cssSelector("input[name=mobile]")).sendKeys("8080956494");
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("shubhamjangali@gmail.com");
        driver.findElement(By.cssSelector("select[name=leadstatus]")).sendKeys("Qualified");
        driver.findElement(By.cssSelector("select[name=rating]")).sendKeys("Active");
        driver.findElement(By.cssSelector("input[name=assigntype]")).click();
        driver.findElement(By.cssSelector("textarea[name=lane]")).sendKeys("A/P Bhadgaon");
        driver.findElement(By.cssSelector("input[name=city]")).sendKeys("Gadhinglaj");
        driver.findElement(By.cssSelector("input[name=state]")).sendKeys("Maharashtra");
        driver.findElement(By.cssSelector("input[name=code]")).sendKeys("416502");
        driver.findElement(By.cssSelector("input[name=country]")).sendKeys("India");
        driver.findElement(By.cssSelector("form[name=\"EditView\"] > table:nth-child(10) > tbody > tr > td > div > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector("input[title=\"Edit [Alt+E]\"]")).click();
        driver.findElement(By.cssSelector("input[name=firstname]")).clear();
        driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Shubh");
        driver.findElement(By.cssSelector("input[title=\"Save [Alt+S]\"]")).click();
        driver.findElement(By.cssSelector("a[class=\"currentTab\"]")).click();
        driver.findElements(By.cssSelector("input[name='selected_id']")).get(10).click();
        driver.findElement(By.cssSelector("input[value=\"Delete\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"firstname\"][size=\"10\"]")).sendKeys("Shubh");
        driver.findElement(By.cssSelector("input[name=\"lastname\"][size=\"10\"]")).sendKeys("Jangali");
        driver.findElement(By.cssSelector("input[title=\"Search [Alt+Q]\"]")).click();

    }
}
