package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        String dosyaYolu="src/resources/ulkeler (1).xlsx";

        FileInputStream fis=new FileInputStream(dosyaYolu);

        Workbook workbook= WorkbookFactory.create(fis);
         Sheet sheet=workbook.getSheet("Sayfa1");//sayfaya git

        Row row= sheet.getRow(4); //satira git
        Cell cell=row.getCell(2);//dorduncu satirin 2.datasini getir
        System.out.println(cell);


        // biz FIS ile okudugumuz excel dosyasini projemiz icerisinde kullanabilmek icin
      // Apachi POI dependency yardimi ile bir Workbook olusturduk

      //** Bu workbook bizim projemizin icerisinde ulkeler excelinin bir kopyasini kullanmamizi sagliyor

       // Excel'in yapisis geregi bir hucreye ulasabilmek icin workbook dan baslayarak
       // sirasiyla sheet, row ve cell objeleri olusturmamiz gerekir

        //indexi 4 olan satirdaki , index 2 olan hucrenin Andorra oldugunu test edin
        String expecteData="Andorra";
        Assert.assertEquals(cell.toString(),expecteData);


        //5. index satirin 3 index hucresini getir
        row= sheet.getRow(5);
        cell= row.getCell(3);

        System.out.println(cell);



    }
}
