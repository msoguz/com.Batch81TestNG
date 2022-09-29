package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        //Amazon ve facebook web sayfasina git
        String urlamazon=ConfigReader.getProperty("amazonUrl");
        String urlFace=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlamazon);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();


    }
}
