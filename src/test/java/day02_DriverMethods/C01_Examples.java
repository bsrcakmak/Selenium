package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {

        /*
        -Ilk once browser;i maximize yapalim sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim
        -Sirasiyla amazon, facebook ve youtube sayfalarina gidelim.
        -Amazon sayfasina tekrar donelim
        -Amazon sayfasinin Url'ini https://www.amazon.com/ adresine esit oldugunu test edelim
        -Sayfanin konumunu ve size'ini yazdiralim
        -Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
        -istedigimiz sekilde oldugunu test edelim
        - Ve sayfayi kapatalim
         */


        WebDriver driver = new ChromeDriver();


        // ilk once browser;i maximize yapalim
        driver.manage().window().maximize();


        // sonra tum sayfa icin max bekleme suresi olarak 15 sn belirtelim
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // Sirasiyla amazon, facebook ve youtube sayfalarina gidelim.
        driver.get("https://www.amazon.com/");
        driver.get("https://www.facebook.com/");
        driver.get("https://www.youtube.com/");


        // Amazon sayfasina tekrar donelim
        driver.navigate().back();
        driver.navigate().back();


        // Amazon sayfasinin Url'ini https://www.amazon.com/ adresine esit oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url Testi PASSED");
        } else {
            System.out.println("Url Testi FAILED");
        }


        // Sayfanin konumunu ve size'ini yazdiralim
        System.out.println("Sayfanin size'i : "+ driver.manage().window().getSize());
        System.out.println("Sayfanin konumu : "+ driver.manage().window().getPosition());


        // Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanin yeni size'i : "+ driver.manage().window().getSize());
        System.out.println("Sayfanin yeni konumu : "+ driver.manage().window().getPosition());


        // istedigimiz sekilde oldugunu test edelim
        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Size Testi PASSED");
        } else System.out.println("Size Testi FAILED");

        Point actualYeniPosition = driver.manage().window().getPosition();
        if(actualYeniPosition.getX()==50 && actualYeniPosition.getY()==50){
            System.out.println("Position Testi PASSED");
        } else System.out.println("Position Testi FAILED");


        // Ve sayfayi kapatalim
        driver.close();


    }
}
