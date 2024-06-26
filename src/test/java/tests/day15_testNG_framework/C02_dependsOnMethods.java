package tests.day15_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_dependsOnMethods {
    // uc tane test method'u olusturun
    //1- amazonTest: amazon anasayfaya gidip url'in amazon icerdigini test edelim.
    //2- nutellaTest: Nutella icin arama yapip arama sonuclarinin Nutella icerdigini test edelim
    //3- ilkUrunTesti: ilk urunu click yapip, urun isminin Nutella icerdigini test edin

    /*
    DependsOnMethods priority'den farklidir.
    DepensOnMethods hangi method'un once calisacagina karar vermez
    sadece yazildigi test calismadan once, baglandigi testin
    calistigindan ve PASSED oldugundan emin olmak ister

    Bagli oldugu test calismaz veya calisir ama PASSED olmazsa
    DependOnMethods'un yazildigi test IGNORE olur.

    DependsOnMethods yazildigi method tek basina calistirilmak istenirse
    once bagli oldugu testin calismasi ve PASSED olmasi gerektiginden
    kendinden once bagli oldugu method'un calismasini saglar.

    Ama bu baglanti birden fazla method'u calistirmaz.

    priority kullanilarak bir method'un once calismasi istense de
    o method onceligi bagli oldugu method'a devreder.
    bagli olunan method da baska method'a bagliysa once onu calistirir.

     */

    @Test
    public void amazonTest(){
        Driver.getDriver().get("https://www.amazon.com.tr");

        WebElement  cookieKabulEt= Driver.getDriver().findElement(By.xpath("//input[@id='sp-cc-accept']"));
        cookieKabulEt.click();

        String expectedUrlIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
    }
    @Test(dependsOnMethods = "amazonTest")
    public void nutellaTest(){
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        WebElement sonucYaziElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedIcerik="Nutella";
        String actualSonucYazisi=sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }
    @Test(priority = -1,dependsOnMethods = "nutellaTest")
    public void ilkUrunTesti(){

        Driver.getDriver().findElement(By.xpath("(//img[@class='s-image s-image-optimized-rendering'])[1]")).click();
        WebElement urunIsimElementi=Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));

        String expectedIcerik="Nutella";
        String actualUrunIsmi=urunIsimElementi.getText();

        Assert.assertTrue(actualUrunIsmi.contains(expectedIcerik));
        Driver.closeDriver();
    }
}
