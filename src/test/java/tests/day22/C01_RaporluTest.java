package tests.day22;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    @Test
    public void testName() {

//-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
// -login butonuna bas
        BrcPage brc=new BrcPage();
        brc.brcilkLoginButonu.click();
// -test data user email: customer@bluerentalcars.com ,

// -test data password : 12345 dataları girip login e basın
// -login butonuna tiklayin
        brc.brcemailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        brc.brcpasswordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        brc.brcikinciLoginButonu.click();
// -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

}
}



/*
Hatanin resmini RAPORDA görmek istersek  target altinda Rapor icinde yazdirilan resmin uzernie sag tiklayin --->
Open in --> uzerine gelin -->  Explorer tiklayin bilgisayardaki dosyaninzin icine yönleneceksiniz
oradan raporu cift tiklayin acilan yeni sayfada alta kucuk resim var uzerini tiklayin
ve karsimiza resim cikmis olacak .

 */