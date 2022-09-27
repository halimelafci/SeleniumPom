package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utils.Driver;

public class C02_PageIlkClass {

    // POM' de farkli class'lara farkli sekilde ulasilmasi benimsenmistir
    // Driver class'i icin static yontemi kullaniyoruz
    // Page Class'lari icin ise obje uzerinden kullanilmasi tercih edilmistir




    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        //arama cubuguna Nutella yazalım aratalim
        AmazonPage amazonPage=new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonucunun Nutella icerdigini test edelim

        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));

    }


    @Test
    public void test02(){
       //amazona gidip java aratalim

        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java", Keys.ENTER);


       //sonucun java icerdigini test edelim
        String actualSonuc=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonuc.contains("java"));

    }
}
