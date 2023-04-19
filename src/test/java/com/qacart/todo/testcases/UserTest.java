package com.qacart.todo.testcases;

import com.github.javafaker.Faker;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.SignupPage;
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


        boolean isWelcomeDisplayed = new SignupPage(driver)
                .load()
                .signup(voornaam, lastname, email, password)
                .isWelcomeDisplayed();

        Assert.assertTrue(isWelcomeDisplayed);










    }

}
