package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        // driver.get("https://amazon.com");  ---> bununla da adrese gidebiliriz aralarinda fark yok

        // Hepsiburada sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");

        // Tekrar amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().back();

        // Tekrar techproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        // Son sayfada sayfayi yenileyelim(refresh)
        driver.navigate().refresh();

        // Ve sayfayi kapatalim
        driver.close();


    }
}
