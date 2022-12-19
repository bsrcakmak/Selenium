package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar_Testi {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("youtube")){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAILED --> " + actualTitle);
        }

        //3.Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yiyazdırın.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("youtube")){
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED --> "+ actualUrl);
        }

        //4.Daha sonra Amazon sayfasina gidinhttps://www.amazon.com/
        driver.get("https://www.amazon.com");

        //5.Youtube sayfasina geri donun
        driver.navigate().back();

        //6.Sayfayi yenileyin
        driver.navigate().refresh();

        //7.Amazon sayfasina donun
        driver.navigate().back();

        //8.Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //9.Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title)yazdırın.
        String actualTitle2= driver.getTitle();
        if (actualTitle.contains("Amazon")){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAILED --> " + actualTitle2);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/olup olmadığını doğrulayın, degilse doğru URL'yiyazdırın
        String actualUrl2= driver.getCurrentUrl();
        if (actualUrl.equals("https://www.amazon.com/")){
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED --> "+ actualUrl2);
        }

        //11.Sayfayi kapatin
        driver.close();
    }
}
