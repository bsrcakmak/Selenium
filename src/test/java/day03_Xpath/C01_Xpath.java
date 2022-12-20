package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // Add Element butonuna basin
        Thread.sleep(3000);
        // WebElement addButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //               <button onclick="addElement()">Add Element</button>
        // Xpath kullanımında locate edeceğimiz webElement text'e sahipse yukaridaki şekilde kullanabiliriz
        addButtonT.click();


        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()){   // bir webElementin gorunur olup olmadigina isDisplayed() methodu ile bakariz
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


        // Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();


        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveEYazisi = driver.findElement(By.xpath("//h3"));
        if (addRemoveEYazisi.isDisplayed()){
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");






    }
}
