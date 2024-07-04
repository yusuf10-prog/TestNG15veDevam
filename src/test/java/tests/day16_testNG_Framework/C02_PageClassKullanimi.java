package tests.day16_testNG_Framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void nutellaTesti(){

        AmazonPage amazonPage=new AmazonPage();

        // amazona gidelim

        Driver.getDriver().get("https://www.amazon.com.tr");

        // cookie yi kabul etme işlemi.

        amazonPage.cookie.click();


        // Nutella icin arama yapalim


        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuclarinin Nutella icerdigini test edelim
        String expectedIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        // driver'i kapatalim

        Driver.closeDriver();

    }
}
