package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {

    //● Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    //○ Username : manager
    //○ Password : Manager1!
    //● table( ) metodu oluşturun
    //○ Tüm table body'sinin boyutunu(sutun sayisi) bulun. /tbody
    //○ Table'daki tum body'I ve başlıkları(headers) konsolda yazdırın.
    //● printRows( ) metodu oluşturun //tr
    //○ table body'sinde bulunan toplam satir(row) sayısını bulun.
    //○ Table body'sinde bulunan satirlari(rows) konsolda yazdırın.
    //○ 4.satirdaki(row) elementleri konsolda yazdırın

   HMCWebTablePage hmcWebTablePage;



    @Test
    public void loginTesti(){


    }

    @Test
    public void tableTesti(){



    }

    @Test
    public void printRows(){

     hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());

        List<WebElement>satirlarWebElementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each:satirlarWebElementListesi

             ) {
            System.out.println(each.getText());

        }
        System.out.println(satirlarWebElementListesi.get(3));


    }
}
