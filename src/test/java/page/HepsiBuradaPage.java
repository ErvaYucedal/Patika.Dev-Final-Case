package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaPage {

    public  HepsiBuradaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="myAccount")
    public WebElement girisYap;

    @FindBy(id="login")
    public WebElement girisYapButon;

    @FindBy(id="txtUserName")
    public WebElement mail;

    @FindBy(id="btnLogin")
    public WebElement girisYapSisteme;

    @FindBy(id="txtPassword")
    public WebElement parola;

    @FindBy(id="btnEmailSelect")
    public WebElement girisYapAnaSayfaya;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement girisDogrulama;

    @FindBy(xpath = "//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']")
    public WebElement urunAra;

    @FindBy (partialLinkText = "Clear Men Kepeğe Karşı")
    public WebElement ilkUrun;



   // @FindBy (partialLinkText = "Skmei 1251")
   // public WebElement ilkUrun;

    @FindBy(xpath = "//div[@class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']")
    public WebElement ara;

    @FindBy(id="onetrust-accept-btn-handler")
    public WebElement cerezKabulEt;

    @FindBy(xpath = "//button[@class='button big with-icon']")
    public WebElement sepeteEkle;

    @FindBy(xpath ="//*[@class='checkoutui-Modal-iHhyy79iR28NvF33vKJb']")
    public WebElement uruneTekrarGel;

    @FindBy(xpath = "(//button[@class='add-to-basket button small'])[1]")
    public WebElement ikinciUrunSepeteEkle;

    @FindBy (xpath = "//*[text()='Clear Men Kepeğe Karşı']")
    public WebElement dogruUrunDogrulama;






}
