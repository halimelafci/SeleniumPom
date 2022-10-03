package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {

    @Test
    public void test01() throws IOException {
        // ulkeler exceline 5.sutun olarak nufus sutunu ekleyelim
// 3. satirdaki ulkenin nufusunu 1000000 yapalim
// 1- dosyaya ulasalim
// 2- class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim
// 3- dosyada yapmak istedigimiz degisiklikleri
// kopya workbook'da yapalim
// ilk satirin 5. hucresine NUFUS basligini yazdiralim
//      3. satirdaki ulkenin nufusunu 1000000 yapalim
// 4- kopyada yaptigimiz degisiklikleri ana dosyaya kaydedelim

        String path="src/resources/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        // ulkeler exceline 5.sutun olarak nufus sutunu ekleyelim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        // 3. satirdaki ulkenin nufusunu 1000000 yapalim dosyaya ulasalim
        //class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

        // 3- dosyada yapmak istedigimiz degisiklikleri
         // kopya workbook'da yapalim
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);




    }
}
