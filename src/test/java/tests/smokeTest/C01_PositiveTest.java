package tests.smokeTest;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utils.ConfigReader;
import utils.Driver;

public class C01_PositiveTest {

    @Test
    public void positiveLoginTesti() throws InterruptedException {

        //1) com.techproed altinda bir package olustur : smoketest
        // 2) Bir Class olustur : PositiveTest
        // 3) Bir test method olustur positiveLoginTest() https://www.hotelmycamp.com adresine git login butonuna bas
        // test data username: manager , test data password : Manager1! Degerleri girildiginde
        // sayfaya basarili sekilde girilebildigini test et

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        Thread.sleep(3000);
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
}
