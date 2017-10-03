package my.project;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeBrowser1 {

    public static void main (String[] args){

    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://rvision.exadel.com");
    System.out.println ("Site Title is: " + driver.getTitle());
    driver.findElement(By.xpath("//input[@type='text'][@name='loginForm:login']")).sendKeys("amazur");
    driver.findElement(By.xpath("//input[@type='password'][@name='loginForm:password']")).sendKeys("Password12");
    driver.findElement(By.xpath("//input[@type='submit'][@name='loginForm:j_idt39']")).click();

        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//span[text()='Time Offs']")).click();

        System.out.println("Test");


        }

}





