package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim
        driver.get("https://www.amazon.com/");

        // Search bolumunu locate edelim
        // WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        // id yi yanlis yazarsak NoSuchElementException hatasi verir
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        // tek bir elementi locate edeceksek findElement ile arariz

        // Search bolumunde iphone aratalim
        aramaKutusu.sendKeys("iphone", Keys.ENTER);  // arama kutusuna "iphone" yazip enter'a basmis oluyoruz


        /*
         Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
        etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
        Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
        Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
        findElement(BY.id("attribute degeri")) seklinde yazariz.
        */

        // Amazon sayfasindaki <input> ve <a> tag'larinin sayisini yazdiriniz
      List<WebElement> inputTags = driver.findElements(By.tagName("input"));
      System.out.println("Input Tag Sayisi : "+ inputTags.size());
        // birden fazla elementi locate edeceksek yazdiracaksak findElemets olarak cogul kullaniriz

      List<WebElement> linklerList = driver.findElements(By.tagName("a"));
      System.out.println("Link Sayisi : "+ linklerList.size());   // linklerin sayisini bulur

      for (WebElement w: linklerList) {
          System.out.println(w.getText());  // linkleri tek tek yazdirir
      }







    }
}
