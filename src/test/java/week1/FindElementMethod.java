package week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
       WebElement foot= driver.findElement(By.id("page-footer"));
        System.out.println("foot.getText() = " + foot.getText());
        System.out.println("foot.getTagName() = " + foot.getTagName());


    }
}
