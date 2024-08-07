package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    /*
    TestNG'de page class'lari
    surekli kullandigimiz bir sayfa / webSitesi
    locate'leri ve
    ilgili sayfada kullanilicak login gibi basit method'lari icerir.


    TestNG page class'larindaki locate'lere erisim icin
    Test class'larinda page calss'indan obje olusturulmasini benimsemistir.

     */

   public AmazonPage(){
       PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement cookie;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

   @FindBy(xpath ="//div[@class='a-section a-spacing-small a-spacing-top-small']" )
    public WebElement sonucYaziElementi;

   @FindBy(xpath = "(//h2[@class='a-size-mini s-line-clamp-1'])[1]")
    public WebElement ilkUrunElementi;

}
