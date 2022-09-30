package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HMCWebTablePage {

  public HMCWebTablePage() {
    PageFactory.initElements(Driver.getDriver(), this);

  }

    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy(xpath = "//table")
    public WebElement tumBodyWebElementi;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalariList;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;

    public void satirGetir(int satirNo){

      // 2. satiri yazdir   //tbody//tr[2]
      // 7. satiri yazdir   //tbody//tr[7]

      String satirDinamikXpath="tbody//tr["+ satirNo +"]";
    }

    public String hucreWebElementGetir(int satir,int sutun){


      // 2. satirin 4. datasi   //tbody//tr[2]//td[4]
     // 4.satirim  5.datasi    //tbody//tr[4]//td[5]

      String dinamikHucreXpath="tbody//tr["+ satir +"]//td["+ sutun +"]";

      WebElement istenenHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpath));
      String hucreDatasi=istenenHucreElementi.getText();

      return hucreDatasi;
    }


}
