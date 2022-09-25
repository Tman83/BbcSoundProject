package com.BbcSoundProject.pages;

import com.BbcSoundProject.utilities.ConfigurationReader;
import com.BbcSoundProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public static void bbcSound() {
        String username= ConfigurationReader.getProperty("username");
        System.out.println(username);
        String password= ConfigurationReader.getProperty("password");
        System.out.println(password);
        Driver.getDriver().get(ConfigurationReader.getProperty("bbcSound.url"));

        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(username);
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(password);
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }
}
