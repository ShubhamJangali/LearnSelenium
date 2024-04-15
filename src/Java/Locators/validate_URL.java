package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;

public class validate_URL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("हिन्दी"));
        String url = link.getAttribute("href");
        try{
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int statusCode = connection.getResponseCode();
            if (statusCode==HttpURLConnection.HTTP_OK){
                System.out.println("The link is working");
            }
            else{
                System.out.println("The link is broken");
            }
            connection.disconnect();
        }
        catch (Exception e){
            System.out.println("Error validating link: " + url);
            e.printStackTrace();
        }

    }
}
