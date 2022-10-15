package tests.day21;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.log4J.Log4JTest1;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    private static Logger logger= LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName()); // bu satiri log4j dersinde ekledik.

    @Test
    public void test01() throws IOException {

        logger.info("Hepsiburada sitesine gidilir."); // log4J dersinde yazildi

        //Hepsiburada web sayfasina gidiniz
        Driver.getDriver().get("https://hepsiburada.com");

        //Sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");

        logger.info("Ekran goruntusu alinir.");// log4J dersinde yazildi

        //sayfayi kapat
        Driver.closeDriver();

        logger.warn("Ekran kapatilir.");// log4J dersinde yazildi

    }

    @Test
    public void test02() throws IOException {
        //Amazon web sayfasina git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();

        //Nutella arat
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //Arama sonuc yazisi Webelementinin resmini al
        ReusableMethods.getScreenshotWebElement("aramaSonucWebElementi", amazonPage.aramaSonucWebElementi);


    }
}
