package com.BbcSoundProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  HiphopRnbAndDancehallCategoryPage extends BbcBasePage{

    @FindBy(xpath = "//div[text()='Hip Hop, RnB & Dancehall']")
    public WebElement HipHopRnbAndDancehallCategoryLink;

    @FindBy(xpath = "//h2[text()='Hip Hop, RnB & Dancehall']")
    public WebElement BbcSoundHipHopRnbAndDancehallPageVerification;

    @FindBy(xpath = "//span[text()='View all']")
    public WebElement BbcSoundHipHopRnbAndDancehallViewAllLink;

    @FindBy(id = "sort")
    public WebElement BbcSoundHipHopRnbAndDancehallsortByDropdown;

}
