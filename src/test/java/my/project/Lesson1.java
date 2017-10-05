package my.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://webtime.exadel.com");

    }
}