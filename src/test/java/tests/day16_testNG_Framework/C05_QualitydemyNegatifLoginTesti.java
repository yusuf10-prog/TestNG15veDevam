package tests.day16_testNG_Framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_QualitydemyNegatifLoginTesti {

    QualitydemyPage qualitydemyPage;
    @Test
    public void gecersizPasswordTest(){
        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();
    }
}
