package Java.Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainfile {
    public static void main(String[] args) {
        Login lg = new Login();
        lg.log("admin", "admin");
        lg.log("admin", "admin", "orange");
        lg.log("admin", "admin", "orange", "US English");
    }
}
