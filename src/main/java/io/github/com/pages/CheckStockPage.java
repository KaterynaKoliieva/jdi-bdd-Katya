package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;


public class CheckStockPage extends WebPage {

    @UI("#search_branch_textbox") public static TextField findStoresField;
    @UI("#search_branch_button") public static Button findStoresButton;
    @UI("//button[@class='lb-btn-cancel']") public static Button closeButton;
    @UI("#add_for_collection_button_1") public static Button addToBasketButton;
    @UI("//a[@href='/jsp/trolley/trolleyPage.jsp?reprice=true']") public static Button basketButton;
}
