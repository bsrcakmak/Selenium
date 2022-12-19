package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_Navigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Youtube ana sayfasina gidelim .https://www.youtube.com/
        driver.get("https://www.youtube.com");

        // Amazon soyfasina gidelim. https://www.amazon.com/
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");

        // Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        // Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().back();

        // Sayfayi Refresh(yenile)yapalim
        driver.navigate().refresh();

        // Sayfayi kapatalim / Tum sayfalarikapatalim
        driver.close();




    }
}
