package tests.day20;

import org.testng.annotations.Test;
import utils.ReusableMethods;

import java.io.FileInputStream;

public class C05_ExceliWebeYukleme {



    @Test
    public void test01(){

        String dosyaYolu="src/resources/ulkeler (1).xlsx";

        String sayafaAdi="Sayfa1";
        ReusableMethods.mapOlustur(dosyaYolu,sayafaAdi);
        System.out.println(ReusableMethods.mapOlustur(dosyaYolu,sayafaAdi));

    }
}
