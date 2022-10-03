package tests.day20;


import org.testng.Assert;
import utils.ReusableMethods;

public class C04_ReusableRunner {

    //ulkeler excelinde sayfa 1 de 11 index satirin,
    // .2 indexdeki hucrenin Azerbaycan oldugunu test edin

    String path="src/resources/ulkeler (1).xlsx";
    String expectedData="Azerbaycan";
    String actualData= ReusableMethods.hucreGetir(path,"Sayfa1",11,2).toString();

      //Assert.assertEquals(actualData,expectedData);
}
