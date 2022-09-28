package tests.day17;

import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;

public class C03_YanlisKeyGirisi {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));//nulPointerException verir

        //eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        //HMCUrl yerine HMCurl yazarsak
        //ConfigReader.getProperty() o key'i bulamaz
        //ve nullPointerExcepyion firlatir


    }
}
