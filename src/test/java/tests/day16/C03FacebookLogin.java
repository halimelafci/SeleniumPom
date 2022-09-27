package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utils.Driver;

public class C03FacebookLogin {

    //1 - https://www.facebook.com/ adresine gidin
    // 2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    // 3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    // 4- Basarili giris yapilamadigini test edin


    @Test
    public void test01() throws InterruptedException {

        //1 - https://www.facebook.com/ adresine gidin

        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage=new FacebookPage();


        // 2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        // 3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();

        Thread.sleep(3000);

        // 4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());

        Driver.closeDriver();


    }
}
