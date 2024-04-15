package Java.Assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

    public void log(String user_name, String password) {
        String name = user_name;
        String pass = password;
        System.setProperty("webdriver.chromedriver.driver", "F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.close();
    }

    public void log(String user_name, String password, String theme) {
        String name = user_name;
        String pass = password;
        String themes = theme;
        System.setProperty("webdriver.chromedriver.driver", "F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//select[@name=\"login_theme\"]")).sendKeys(themes);
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.close();
    }

    public void log(String user_name, String password, String theme, String language) {
        String name = user_name;
        String pass = password;
        String themes = theme;
        String lang = language;
        System.setProperty("webdriver.chromedriver.driver", "F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pass);
        driver.findElement(By.xpath("//select[@name=\"login_theme\"]")).sendKeys(themes);
        driver.findElement(By.xpath("//select[@name=\"login_language\"]")).sendKeys(lang);
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.close();
    }
}
