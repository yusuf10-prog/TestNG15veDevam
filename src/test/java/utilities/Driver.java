package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /* JUnit' de WebDriver objesi TestBase'den geliyordu.

   TestNG extends ile baglanma zorunlulugunu ortadan kaldirmak
   ve testi yazanlara daha fazla kontrol imkani vermek icin
   TestBase yerine Driver class'indan static 2 method ile
   driver olusturma ve kapatma islemlerini yapmayi tercih etmistir.
     */
    static WebDriver driver;  // biz deger atamadıgımız icin Java default olarak null point eder.
    public static WebDriver getDriver(){

        String browserName=ConfigReader.getProperty("browserName");

      if (driver==null){
          switch (browserName){
              case "safari":
                 // WebDriverManager.safaridriver().setup();
                  driver=new SafariDriver();
                  break;
              case "firefox":
                 // WebDriverManager.chromiumdriver().setup();
                  driver=new FirefoxDriver();
                  break;
              case "edge":
                 // WebDriverManager.edgedriver().setup();
                  driver=new EdgeDriver();
                  break;
              default:
                  //WebDriverManager.chromedriver().setup();
                  driver=new ChromeDriver();

          }
      }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
}
