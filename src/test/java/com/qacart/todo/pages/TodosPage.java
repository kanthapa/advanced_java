package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qacart.todo.pages.NewTodoPage;


public class TodosPage extends BasePage {

    public TodosPage(WebDriver driver) {
        super(driver);
    }

    // Elements

    @FindBy(css = "[data-testid=add]")
    private WebElement addButton;

    @FindBy(css = "[data-testid=welcome]")
    WebElement welcomeMessage;

    @FindBy(css = "[data-testid=todo-item]")
    private WebElement toDoItem;

    @FindBy(css = "[data-testid=delete]")
    private WebElement deleteButton;

    @FindBy(css = "[data-testid=no-todos]")
    private WebElement noToDos;

    // Methods

    public boolean isWelcomeDisplayed() {
        return welcomeMessage.isDisplayed();
    }

    public NewTodoPage addNewToDo() {
        addButton.click();
        return new NewTodoPage(driver);
    }

    public boolean isNewTaskDisplayed() {
        return toDoItem.isDisplayed();
    }

    public TodosPage deleteTask(){
        deleteButton.click();
        return new TodosPage(driver);
    }

    public boolean isNoTodosDisplayed() {
        return noToDos.isDisplayed();
    }

}

