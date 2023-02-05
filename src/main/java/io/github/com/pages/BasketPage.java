package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

public class BasketPage extends WebPage {

    @UI("//div[@id='trolley_page_product_1']//a[@onclick='return false;']")
    public static WebElement selectedDeliverButton;
    @UI("//div[@id='CPC_trolley_page_product_1']//a[@onclick='return false;']")
    public static WebElement selectedClickAndCollectButton;

    @UI("#CPC_trolley_page_product_unit_price_1")
    public static WebElement priceUnderHeadingField1;

    @UI("#CPC_trolley_page_product_total_price_1")
    public static WebElement totalPriceField1;

    @UI("#trolley_page_product_unit_price_1")
    public static WebElement priceUnderHeadingField2;

    @UI("#trolley_page_product_total_price_1")
    public static WebElement totalPriceField2;
    @UI("#trolley_page_product_total_goods")
    public static WebElement subTotalField;

    @UI("#trolley_page_delivery")
    public static WebElement deliveryField;

    @UI("#trolley_page_grand_total")
    public static WebElement totalField;
}
