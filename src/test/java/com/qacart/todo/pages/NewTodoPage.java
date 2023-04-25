package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qacart.todo.pages.TodosPage;
public class NewTodoPage extends BasePage{

    public NewTodoPage(WebDriver driver) { super(driver); }

    //Elements
    @FindBy(css = "[data-testid=new-todo]")
    WebElement newTodoInput;

    @FindBy(css = "[data-testid=submit-newTask]")
    WebElement submitTaskButton;

    // Methods

    public TodosPage addNewToDoItem(String toDoTask) {
        newTodoInput.sendKeys(toDoTask);
        submitTaskButton.click();
        return new TodosPage(driver);
    }


}
