package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.get("https://www.cydeo.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.ebay.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close();

    }


}
