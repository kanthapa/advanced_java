package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodosPage extends BasePage {

    public TodosPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[data-testid=welcome]")
    WebElement welcomeMessage;

    public boolean isWelcomeDisplayed() {
        return welcomeMessage.isDisplayed();
    }


}
