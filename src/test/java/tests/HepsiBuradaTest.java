package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

import static utilities.ReusableMethods.waitFor;

public class HepsiBuradaTest {
    HepsiBuradaPage hepsiBuradaPage=new HepsiBuradaPage();
    Logger log=(Logger) LogManager.getLogger(HepsiBuradaTest.class);
    @Test
    public void test01()  {

        // 1_Kullanici https://www.hepsiburada.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));
        log.info("anasayfaya gidildi");



        // 2_Kullanici giris yapmak icin giris yap sekmesine tiklar
        hepsiBuradaPage.cerezKabulEt.click();
        log.info("cerezler kabul edildi");
        hepsiBuradaPage.girisYap.click();
        log.info("giriş yap butonuna tiklatildi");
        hepsiBuradaPage.girisYapButon.click();
        hepsiBuradaPage.mail.sendKeys(ConfigReader.getProperty("email"));
        log.info("mail adresi girildi");
        hepsiBuradaPage.girisYapSisteme.click();
        hepsiBuradaPage.parola.sendKeys(ConfigReader.getProperty("password"));
        log.info("parola girildi");
        hepsiBuradaPage.girisYapAnaSayfaya.click();
        log.info("kullanıcı girişiyle giriş yapıldı ");


        // 3_Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
        Assert.assertTrue(hepsiBuradaPage.girisDogrulama.isDisplayed());

        //4_Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
        hepsiBuradaPage.urunAra.sendKeys("şampuan");
        hepsiBuradaPage.ara.click();

        //5_Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        hepsiBuradaPage.ilkUrun.click();

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

        //7_Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
        Assert.assertTrue(hepsiBuradaPage.dogruUrunDogrulama.getText().contains("Clear Men Kepeğe Karşı"));
        System.out.println("Secilen urunun dogru eklendigi dogrulandi");
        Driver.closeDriver();
    }


}
