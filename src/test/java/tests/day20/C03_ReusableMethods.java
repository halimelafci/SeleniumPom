package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReusableMethods {

    public static  Cell hucreGetir(String path,int satirIndex,int hucreIndex){

        Cell cell;

        try {
            FileInputStream fis=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fis);
            cell=workbook.getSheet(path).getRow(satirIndex).getCell(hucreIndex);


        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
