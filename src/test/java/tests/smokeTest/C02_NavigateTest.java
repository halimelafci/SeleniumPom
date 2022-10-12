package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utils.ConfigReader;
import utils.Driver;

public class C02_NavigateTest {

    HotelMyCampPage hotelMyCampPage;
    @Test
    public void yanlisSifreTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
      hotelMyCampPage  =new HotelMyCampPage();
      hotelMyCampPage.ilkLoginLinki.click();
      hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
      hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
      hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());

    }

    @Test(groups ="miniSmok")
    public void yanliskullaniciTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage  =new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());


    }
}
