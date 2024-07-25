package tests.day17_testNGFramework_assertions;

import org.testng.annotations.Test;

public class C05_SoftAssert {
    /*
    TestNG assertion konusunda da bize bir alternatif sunar.

    TestNG iki farklı Assertion class'ina sahiptir

    1-Assert
        Bu Junit'teki assertion ile bire bir aynidir.
        sadece isimlendirirken diger alternatif softAssert oldugundan
        Assert class'ina da HARD ASSERT denir.

        hard assert karsilastigi ilk failed'da
        calismayi durdurur, dolayisiyla geriye kalan assertion'larin
        passed veya failed sonuclarindan hangisini alacagini BİLEMEYİZ
     2-Soft Assert
        Soft Assert biz raporla diyene kadar
        yaptigi tum testlerin sonuclarini kendisi tutar test passed de olsa
        failed de olsa calismaya devam eder.

        ne zaman raporla dersek
        tum failed olanlari bize rapor eder ve calismayi durdurur.

        eger hic failed olan yoksa
        class calismaya devam eder.

     */

    @Test
    public void softAssertionTesti(){

    }
}
