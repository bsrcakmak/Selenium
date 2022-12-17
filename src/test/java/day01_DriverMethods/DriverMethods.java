package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();   // Bos bir browser actik
        driver.get("https://www.amazon.com");    // ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfa Basligi: " + driver.getTitle());   // icinde olunan sayfanin basligini verir
        System.out.println("Sayfa Url'i :  " + driver.getCurrentUrl());  // icinde olunan sayfanin url'ini verir
        // System.out.println(driver.getPageSource());  // icinde olunan sayfanin kaynak kodlarini String olarak getirir
        System.out.println(driver.getWindowHandle());  // icinde olunan sayfa veya tablarin handle degerlerini gosterir
                                                       // Bize o window'a ait hash degerini verir,
                                                       // biz bu hash degerlerini bir String'e atayip pencereler arasi gecis yapabiliriz


    }
}
