package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

import java.util.Set;

public class HepsiBuradaTest1 {

    HepsiBuradaPage hepsiBuradaPage;

    @Test
    public void test01()  {
    hepsiBuradaPage=new HepsiBuradaPage();
        // 1_Kullanici https://www.hepsiburada.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));
        Log.info("anasayfaya gidildi");

        // 2_Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
        hepsiBuradaPage.urunAra.sendKeys("şampuan");
        hepsiBuradaPage.ara.click();
        Assert.assertTrue(hepsiBuradaPage.girisDogrulama.isDisplayed());
        hepsiBuradaPage.urunAra.sendKeys("şampuan");
        hepsiBuradaPage.ara.click();


        // 3_Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        hepsiBuradaPage.ilkUrun.click();
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();
        String ikinciSayfaWindowHandleDegeri="";
        for (String each:windowHandleSeti){
            if(!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaWindowHandleDegeri=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWindowHandleDegeri);
        hepsiBuradaPage.sepeteEkle.click();
        hepsiBuradaPage.ikinciUrunSepeteEkle.click();


        // 4_Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.

    }
}
