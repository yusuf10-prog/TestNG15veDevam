package tests.day16_testNG_Framework;

import org.testng.annotations.Test;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void nutellaTesti(){
        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com.tr");


        // Nutella icin arama yapalim

        // arama sonuclarinin Nutella icerdigini test edelim

        // driver'i kapatalim

    }
}
