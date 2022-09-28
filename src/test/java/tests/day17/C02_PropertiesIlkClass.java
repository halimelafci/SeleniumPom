package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utils.ConfigReader;
import utils.Driver;

public class C02_PropertiesIlkClass {

    @Test
    public void positiveLoginTest(){
        // Hotelmycamp sitesine positive login testini POM' a tam uygun olarak yapiniz.

      //     https://www.hotelmycamp.com/  adresine git
      //Driver.getDriver().get("buraya yapistirmak icin, properties dosyasina git HMCUrl'e karsilik gelen degeri getir..");
      //     Login butonuna bas
      //     test data username: manager1 ,
      //     test data password: manager1!
      //     Degerleri girildiginde sayfaya girilmedigini test et.


        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();

        hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));

        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();

        Assert.assertTrue(hotelMyCampPage.basariliGirisYazisiElementi.isDisplayed());

    }
}
