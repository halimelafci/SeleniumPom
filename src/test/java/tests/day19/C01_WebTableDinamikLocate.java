package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utils.Driver;

public class C01_WebTableDinamikLocate {

    // 3 test methodu olusturalim
// 1. method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

// 2. satiri yazdir   //tbody//tr[2]
// 7. satiri yazdir   //tbody//tr[7]
// 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
// 2. satirin 4. datasi   //tbody//tr[2]//td[4]
// 4.satirim  5.datasi    //tbody//tr[4]//td[5]
// 3. sutun numarasi verdigimde bana tum sutun'u yazdirsin

     HMCWebTablePage hmcWebTablePage;
     HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 1. method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2. satiri yazdir   //tbody//tr[2]
       // 7. satiri yazdir   //tbody//tr[7]

       //String satirDinamikXpath="tbody//tr["+ satirNo +"]";
       //WebElement satirElementi= Driver.getDriver().findElement(By.xpath(satirDinamikXpath));
       //
       //return satirElementi;

        hmcWebTablePage=new HMCWebTablePage();
        System.out.println("girdiginiz hucredeki element :"+hmcWebTablePage.hucreWebElementGetir(3, 5));


    }

    @Test
    public void sutunYazirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        // 3. sutun numarasi verdigimde bana tum sutun'u yazdirsin

        hmcWebTablePage.sutunYazdir(4);
        Driver.closeDriver();

    }
}
