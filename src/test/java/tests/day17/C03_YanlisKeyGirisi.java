package tests.day17;

import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;

public class C03_YanlisKeyGirisi {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));//nulPointerException verir
    }
}
