package com.BbcSoundProject.pages;

import com.BbcSoundProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcBasePage {

    public BbcBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[text()='Listen Live']")
    public WebElement BbcHomepageVerification;

    @FindBy(xpath = "//span[@class='sc-c-sounds-nav__link-text gel-pica']")
    public WebElement BbcSoundHomeNavigationLink;

    @FindBy(xpath = "(//a[@class='sc-c-network-item__link sc-o-link'])[1]")
    public WebElement BbcSoundRadio1Logo;

    @FindBy(xpath = "//li[@data-id='bbc_radio_two']")
    public WebElement BbcSoundRadio2Logo;

    @FindBy(xpath = "(//span[text()='View all Stations & Schedules'])[1]")
    public WebElement BbcSoundViewAllStationsSchedulesLink;

    @FindBy(xpath = "//div[text()='Hip Hop, RnB & Dancehall']")
    public WebElement BbcSoundHipHopCategoryLink;



}
