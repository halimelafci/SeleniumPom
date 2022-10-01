package tests.day20;

import utils.ReusableMethods;

import java.io.FileInputStream;

public class C05_ExceliWebeYukleme {

    public void test01(){

        String dosyaYolu="src/resources/ulkeler (1).xlsx";

        String sayafaAdi="Sayfa1";
        ReusableMethods.mapOlustur(dosyaYolu,sayafaAdi);

    }
}
