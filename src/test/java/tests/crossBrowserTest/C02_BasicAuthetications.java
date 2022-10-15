package tests.crossBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBaseCross;

public class C02_BasicAuthetications extends TestBaseCross {

    @Test
    public void authencationTesti(){

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebElement congratMesajElementi=driver.findElement(By.tagName("p"));

        Assert.assertTrue(congratMesajElementi.isDisplayed());
    }
}

