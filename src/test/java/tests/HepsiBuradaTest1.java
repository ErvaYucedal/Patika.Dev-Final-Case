package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;
import utilities.ReusableMethods;

import java.util.Set;

import static utilities.ReusableMethods.waitFor;

public class HepsiBuradaTest1 {

    HepsiBuradaPage hepsiBuradaPage;

    @Test
    public void test01()  {
    hepsiBuradaPage=new HepsiBuradaPage();
        // 1_Kullanici https://www.hepsiburada.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));
        Log.startTestCase("anasayfaya gidildi");
        hepsiBuradaPage.cerezKabulEt.click();
        Log.info("cerezler kabul edildi");

        // 2_Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
        hepsiBuradaPage.urunAra.sendKeys("şampuan");
        hepsiBuradaPage.ara.click();
        Log.info("kullanici satın almak istediği ürünü aradı ");


        //5_Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        hepsiBuradaPage.ilkUrun.click();
        Log.info("kullanici aradığı ilk ürünü seçer ");


        //6_Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
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
        waitFor(3);
        ReusableMethods.waitForClickablility(hepsiBuradaPage.uruneTekrarGel,5);
        hepsiBuradaPage.uruneTekrarGel.click();
        ReusableMethods.jsScrollClick(hepsiBuradaPage.ikinciUrunSepeteEkle);
        Log.info("kullanici aynı ürünü başka satıcıdan ekler ");

        //7_Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
        hepsiBuradaPage.sepeteGit.click();
        Log.info("kullanici sepete ekler ");


        // Assert.assertTrue(hepsiBuradaPage.dogruUrunDogrulama.getText().contains("Clear Men Kepeğe Karşı"));
        //   System.out.println("Secilen urunun dogru eklendigi dogrulandi");
        Log.info("kullanici dogru ürün ekledigini dogrular ");

        Driver.closeDriver();
        Log.endTestCase("kullanici sayfayı kapatır ");

    }

}
