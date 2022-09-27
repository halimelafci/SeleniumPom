package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class C01_DriverIlkTest {

    // driver class'i sayesinde eski driver kulanilmiyor.
    // artık driver'e ihtiyac varsa Driver.getDriver() yazacagiz

    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");

        //amazona gittigini test et
        String actualTitle=Driver.driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        // Driver.getDriver methodu her calistigibda
        // driver=new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver Class'ini ilk calistirdigimizda new atamasi olsun
        // sonraki calistirmalarda atama olmasin istiyoruz
        // bunun icin driver=new ChromeDriver(); satiri if blogu icine alacagiz
        Driver.closeDriver();

    }

    @Test
    public void test2(){

        Driver.getDriver().get("https://www.bestbuy.com");
        String actualuRL=Driver.driver.getCurrentUrl();
        Assert.assertTrue(actualuRL.contains("bestbuy"));
        Driver.closeDriver();
    }
}
