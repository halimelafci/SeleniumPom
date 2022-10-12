package tests.day21;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utils.Driver;
import utils.ReusableMethods;
import utils.TestBaseRapor;

import static utils.TestBaseRapor.extentReports;
import static utils.TestBaseRapor.extentTest;

public class C02_FacebookTesti extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("facebook","fake isimle girilmedigi test edildi");
        //1 - https://www.facebook.com/ adresine gidin

        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage=new FacebookPage();


        // 2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        // 3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        extentTest.info("facebook giris bilgileri faker ile dolduruldu");

        Thread.sleep(3000);

        // 4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());

        extentTest.info("girilemedigi test edildi");


}}
