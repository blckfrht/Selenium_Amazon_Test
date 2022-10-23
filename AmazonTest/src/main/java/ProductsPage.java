import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By shippingOptionLocator = By.xpath("//span[contains(text(),'1.000 üzeri sonuç arasından 1-48 arası gösteriliyo')]");
    By productNameLocator = By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//span[1]");
    public ProductsPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
