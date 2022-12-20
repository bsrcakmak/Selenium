package day03_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // -Amazon sayfasına gidiniz
        //-Arama kutusunu locate ediniz
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        //-Sayfayı kapatınız
    }
}
