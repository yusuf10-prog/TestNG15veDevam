package tests.day17_testNGFramework_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ConcurrentModificationException;

public class C02_QualitydemyPozitifLoginTesti {
    @Test
    public void pozitifLoginTesti(){
        //1 - https://www.qualitydemy.com/ anasayfasina gidin.
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //2 - login linkine basin.
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        //3 - Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
        //4 - Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //5 - Login butonuna basarak login olun.
        qualitydemyPage.loginButonu.click();
        //6 - Basarili olarak giris yapilabildigini test edin.
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());
        //7 - Tüm sayfanin fotosu cekilir.
        ReusableMethods.tumSayfaFotografCek("QualitiydemyPozitifLogin");
        //8 - Sayfa kapatilir.
        Driver.closeDriver();


    }
}
