package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {

    @Test
    public void test01() {


        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));

        //login butonuna bas
        //test data username: manager ,
        //test data password : Manager1!
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}
