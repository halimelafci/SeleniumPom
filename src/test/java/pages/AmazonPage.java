package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

     public class AmazonPage {

    //Bir Page classi actigimizda ilk yapmamiz gereken sey
    //parametresiz bir constructor olusturup
    //bu constructor icinde PageFactory ile driver'a ilk deger atamasini yapmak olmalidir

     public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
      @FindBy(id="twotabsearchtextbox")
      public WebElement amazonAramaKutusu;

         @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
         public WebElement sonucYazisiElementi;
}
