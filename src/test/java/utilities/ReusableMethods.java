package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethods {
    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void tumSayfaFotografCek(String resimAdi){
        // her screenshot'in benzersiz bir isme sahip olmasi icin
        // 1- Method'un cagrildigin yerden resim adi yollanacak
        // 2- sonuna tarih etiketi ekleyelim 2310062013

        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyMMddHHmm");
        String tarihEtiketi=localDateTime.format(formatter);

        //target/screenShots/tumSayfaScreenshot.jpg
        String dinamikDosyaYolu="target/screenShots/" + resimAdi + tarihEtiketi+ ".jpg";

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver(); // tss objesi olusturduk.

        File tumSayfaSS=new File(dinamikDosyaYolu); // kaydedecegimiz yeri hazirladik

        File geciciDosya=tss.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciDosya,tumSayfaSS);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void webElementFotografCek(WebElement webElement, String resimAdi){
        // her screenshot'in benzersiz bir isme sahip olmasi icin
        // 1- Method'un cagrildigin yerden resim adi yollanacak
        // 2- sonuna tarih etiketi ekleyelim 2310062013

        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyMMddHHmm");
        String tarihEtiketi=localDateTime.format(formatter);

        //target/screenShots/tumSayfaScreenshot.jpg
        String dinamikDosyaYolu="target/screenShots/" + resimAdi + tarihEtiketi+ ".jpg";

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver(); // tss objesi olusturduk.

        File tumSayfaSS=new File(dinamikDosyaYolu); // kaydedecegimiz yeri hazirladik

        File geciciDosya=webElement.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciDosya,tumSayfaSS);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
