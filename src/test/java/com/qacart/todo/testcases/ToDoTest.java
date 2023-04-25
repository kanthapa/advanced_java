package com.qacart.todo.testcases;

import com.github.javafaker.Faker;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.NewTodoPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qacart.todo.pages.TodosPage;
import com.qacart.todo.pages.SignupPage;

public class ToDoTest extends BaseTest {



    @Test
    public void shouldBeAbleToAddAToDo() {
        Faker faker = new Faker();
        String voornaam = faker.name().firstName();
        String lastname = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "Wachtw00rd!";

        /*        driver.get("https://todo.qacart.com/signup");*/

        boolean isWelcomeDisplayed = new SignupPage(driver)
                .load()
                .signup(voornaam, lastname, email, password)
                .isWelcomeDisplayed();

        Assert.assertTrue(isWelcomeDisplayed);

       boolean newTodoDisplayed  = new TodosPage(driver)
               .addNewToDo()
               .addNewToDoItem("Zet hier wat neer")
               .isNewTaskDisplayed();

       Assert.assertTrue(newTodoDisplayed);
   }

    @Test
    public void shouldBeAbleToDeleteAToDo() throws InterruptedException {
        this.shouldBeAbleToAddAToDo();
        Thread.sleep(1000);

        boolean isNoTodoDisplayed = new TodosPage(driver)
                .deleteTask()
                .isNoTodosDisplayed();

        Assert.assertTrue(isNoTodoDisplayed);






/*        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid=first-name]")).sendKeys(voornaam);
        driver.findElement(By.cssSelector("[data-testid=last-name]")).sendKeys(lastname);
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-testid=confirm-password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-testid=submit]")).click();

        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=welcome")).isDisplayed();

        driver.findElement(By.cssSelector("[data-testid=add]")).click();
        driver.findElement(By.cssSelector("[data-testid=new-todo]")).sendKeys("Name it anything");
        driver.findElement(By.cssSelector("[data-testid=submit-newTask]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[data-testid=delete]")).click();

        boolean noToDos = driver.findElement(By.cssSelector("[data-testid=no-todos]")).isDisplayed();
        Assert.assertTrue(noToDos);*/




    }
}
