package tests.practice09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class SearchProductTest extends TestBaseRapor {

    SearchProductPage searchProductPage;
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void searchProductPage() throws InterruptedException {


        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("http://automationexercise.com");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        //TODO: Test case bizden hangi sayafayi dogrulammizi istiyorsa
        // TODO: o sayfadan unique olan bir seyi locate etmemiz lazim.(url olabilir.)
        String homeUrl = "https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), homeUrl);

        searchProductPage = new SearchProductPage();

        // 4. 'Ürünler' butonuna tıklayın
        searchProductPage.productPageUrl.click();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın]
        Assert.assertTrue(searchProductPage.allProductTitle.isDisplayed());

        //   String productPageUrl="https://automationexercise.com/products";
        //   Assert.assertEquals(Driver.getDriver().getCurrentUrl(),productPageUrl);


        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProductPage.searchBox.sendKeys("blue top");
        searchProductPage.searchButton.click();
        //  actions.click(searchProductPage.searchButton).click().perform();  boyle de olur!!!!!


        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searchProductPage.searchProductTitle.isDisplayed());
        //List<WebElement> urunListesi=searchProductPage.searchProductList;
      //  for (WebElement each : urunListesi
      //  ) {
     //       Assert.assertTrue(each.isDisplayed());
            Thread.sleep(500);
        }

        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        //  actions.click(searchProductPage.viewProduct).perform();
        //   Assert.assertTrue(searchProductPage.blueTop.isDisplayed());

   // }
}