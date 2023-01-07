package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("www.google.com");
        driver.get("www.cydeo.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }


}
