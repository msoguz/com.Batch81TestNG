package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_DriverIlkTest {
    @Test
    public void test01() {
        /*
        TestBase class'ina extend ederek kullandigimiz driver yerine artik Driver class'indan kullanacagimiz
        getDriver() stattic method'unu kullaniriz
         */
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();

    }
}
