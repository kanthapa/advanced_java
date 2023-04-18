package com.qacart.todo.testcases;

import com.github.javafaker.Faker;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserTest extends BaseTest {


    @Test
    public void shouldBeAbleToSignup() {
        Faker faker = new Faker();
        String voornaam = faker.name().firstName();
        String lastname = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "Wachtw00rd!";


        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid=first-name]")).sendKeys(voornaam);
        driver.findElement(By.cssSelector("[data-testid=last-name]")).sendKeys(lastname);
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-testid=confirm-password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-testid=submit]")).click();

        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=welcome")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);










    }

}
