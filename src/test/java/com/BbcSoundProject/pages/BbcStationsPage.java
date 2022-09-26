package com.BbcSoundProject.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcStationsPage extends BasePage {

    @FindBy(xpath = "//h2[text()='Stations']")
    public WebElement BbcStationsVerification;

    @FindBy(xpath = "//span[text()='Radio 1']")
    public WebElement BbcRadio1Station;

    @FindBy(xpath = "//*[local-name()='svg' and contains(@class, 'sc-o-responsive-image__svg')] ")
    public List<WebElement> BbcNetworkStationsLogos;

    @FindBy(xpath = "//span[text()='Radio 1 Dance']")
    public WebElement BbcRadio1Dance;

    @FindBy(xpath = "//span[text()='Radio 1 Relax']")
    public WebElement BbcRadio1Relax;

    @FindBy(xpath = "//span[text()='Radio 1Xtra']")
    public WebElement BbcRadio1Xtra;

    @FindBy(xpath = "//span[text()='Radio 2']")
    public WebElement BbcRadio2;

    @FindBy(xpath = "//span[text()='Radio 3']")
    public WebElement BbcRadio3;

    @FindBy(xpath = "//span[text()='Radio 4']")
    public WebElement BbcRadio4;

    @FindBy(xpath = "//span[text()='Radio 4 LW']")
    public WebElement BbcRadio4LW;

    @FindBy(xpath = "//span[text()='Radio 4 Extra']")
    public WebElement BbcRadio4Extra;

    @FindBy(xpath = "//span[text()='Radio 5 Live']")
    public WebElement BbcRadio5Live;

    @FindBy(xpath = "//span[text()='Radio 5 Sports Extra']")
    public WebElement BbcRadio5SportXtra;

    @FindBy(xpath = "//span[text()='Radio 6 Music']")
    public WebElement BbcRadio6Music;

    @FindBy(xpath = "//span[text()='Asian Network']")
    public WebElement BbcRadioAsianNetwork;

    @FindBy(xpath = "//span[text()='World Service']")
    public WebElement BbcRadio1WorldService;

    @FindBy(xpath = "//span[text()='Radio Scotland']")
    public WebElement BbcRadioScotland;

    @FindBy(xpath = "//span[text()='Radio Scotland Extra']")
    public WebElement BbcRadioScotlandExtra;

    @FindBy(xpath = "//span[text()='Radio Orkney']")
    public WebElement BbcRadioOrkney;

    @FindBy(xpath = "//span[text()='Radio Shetland']")
    public WebElement BbcRadioShetland;

    @FindBy(xpath = "//span[text()='Radio nan Gàidheal']")
    public WebElement BbcRadionanGaidheal;

    @FindBy(xpath = "//span[text()='Radio Ulster']")
    public WebElement BbcRadioUlster;

    @FindBy(xpath = "//span[text()='Radio Foyle']")
    public WebElement BbcRadioFoyle;

    @FindBy(xpath = "//span[text()='Radio Wales']")
    public WebElement BbcRadioWales;

    @FindBy(xpath = "//span[text()='Radio Wales Extra']")
    public WebElement BbcRadioWalesExtra;

    @FindBy(xpath = "//span[text()='Radio Cymru']")
    public WebElement BbcRadioCymru;

    @FindBy(xpath = "//span[text()='Radio Cymru 2']")
    public WebElement BbcRadioCymru2;

    @FindBy(xpath = "//span[text()='CBeebies Radio']")
    public WebElement BbcRadioCbeebiesRadio;

}
