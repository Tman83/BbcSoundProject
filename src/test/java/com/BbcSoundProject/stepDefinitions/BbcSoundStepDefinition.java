package com.BbcSoundProject.stepDefinitions;

import com.BbcSoundProject.pages.*;
import com.BbcSoundProject.utilities.BrowserUtils;
import com.BbcSoundProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class BbcSoundStepDefinition {

  BbcBasePage basePage = new BbcBasePage();
  BbcStationsPage stationsPage = new BbcStationsPage();
  HiphopRnbAndDancehallCategoryPage hiphopRnbAndDancehallCategoryPage = new HiphopRnbAndDancehallCategoryPage();

  @Given("that I am on the BBC Sounds Homepage")
  public void that_i_am_on_the_bbc_sounds_homepage() {
    Assert.assertEquals(basePage.BbcHomepageVerification.getText(),"Listen Live");
  }

  @When("I select the ‘Home’ logo")
  public void i_select_the_home_logo() {
     basePage.BbcSoundHomeNavigationLink.click();
  }

  @Then("I am on the Sounds Homepage")
  public void i_am_on_the_sounds_homepage() {
    String expectedPageTitle = "BBC Sounds - Music. Radio. Podcasts";
    String actualPageTitle = Driver.getDriver().getTitle();
    System.out.println("Page title : " + expectedPageTitle);
    Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));
    Assert.assertEquals(basePage.BbcHomepageVerification.getText(),"Listen Live");
  }

  @And("I can see the Radio 1 logo")
  public void i_can_see_the_radio_logo() {
    Assert.assertTrue(basePage.BbcSoundRadio1Logo.isDisplayed());
  }

  @And("I can see the Radio 2 logo")
  public void iCanSeeTheRadioLogo() {
    Assert.assertTrue(basePage.BbcSoundRadio2Logo.isDisplayed());
  }

//  @When("I click the ‘View all Stations & Schedules’ link")
//  public void i_click_the_view_all_stations_schedules_link() {
//     basePage.BbcSoundViewAllStationsSchedulesLink.click();
//    BrowserUtils.sleep(3);
//  }

  @When("I click the {string} link")
  public void i_click_the_link(String attribute) {
    basePage.selectPage(attribute);
    BrowserUtils.sleep(3);
  }

  @Then("I am on the ‘Stations’ page")
  public void i_am_on_the_stations_page() {
      String expectedPageTitle = "BBC Sounds - Stations & Schedules";
      String actualPageTitle = Driver.getDriver().getTitle();
      System.out.println("Page title : " + actualPageTitle);
      Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));

      Assert.assertEquals(stationsPage.BbcStationsVerification.getText(),"Stations");
  }


  @Then("I see {int} network station logos")
  public void i_see_network_station_logos(int expectedNetworkStationsLogoCount) {
    Integer actualNetworkStationsLogoCount = stationsPage.BbcNetworkStationsLogos.size();

    Assert.assertTrue("Some Network Station Logos are MISSING!!!", actualNetworkStationsLogoCount == expectedNetworkStationsLogoCount);
    System.out.println("Total network station Logo count : " + actualNetworkStationsLogoCount);

  }


//  @Then("I see 26 network station logos")
//  public void i_see_network_station_logos(Integer expectedNetworkStationsLogoCount) {

//    ArrayList<WebElement> bbcRadio = new ArrayList<>();

//    bbcRadio.add(stationsPage.BbcRadio1Dance);
//    bbcRadio.add(stationsPage.BbcRadioFoyle);
//    bbcRadio.add(stationsPage.BbcRadio5Live);
//    bbcRadio.add(stationsPage.BbcRadio1Relax);
//    bbcRadio.add(stationsPage.BbcRadio1WorldService);
//    bbcRadio.add(stationsPage.BbcRadio1Station);
//    bbcRadio.add(stationsPage.BbcRadio1Xtra);
//    bbcRadio.add(stationsPage.BbcRadio2);
//    bbcRadio.add(stationsPage.BbcRadio3);
//    bbcRadio.add(stationsPage.BbcRadio4);
//    bbcRadio.add(stationsPage.BbcRadio4Extra);
//    bbcRadio.add(stationsPage.BbcRadio4LW);
//    bbcRadio.add(stationsPage.BbcRadio5SportXtra);
//    bbcRadio.add(stationsPage.BbcRadio6Music);
//    bbcRadio.add(stationsPage.BbcRadioAsianNetwork);
//    bbcRadio.add(stationsPage.BbcRadioCbeebiesRadio);
//    bbcRadio.add(stationsPage.BbcRadioCymru);
//    bbcRadio.add(stationsPage.BbcRadioCymru2);
//    bbcRadio.add(stationsPage.BbcRadionanGaidheal);
//    bbcRadio.add(stationsPage.BbcRadioOrkney);
//    bbcRadio.add(stationsPage.BbcRadioScotland);
//    bbcRadio.add(stationsPage.BbcRadioScotlandExtra);
//    bbcRadio.add(stationsPage.BbcRadioShetland);
//    bbcRadio.add(stationsPage.BbcRadioUlster);
//    bbcRadio.add(stationsPage.BbcRadioWales);
//    bbcRadio.add(stationsPage.BbcRadioWalesExtra);

//    Integer actualNetworkStationsLogoCount = stationsPage.BbcNetworkStationsLogos.size();
//
//    Assert.assertTrue("Some Network Station Logos are MISSING!!!", actualNetworkStationsLogoCount == expectedNetworkStationsLogoCount);
//    System.out.println("Total network station Logo count : " + actualNetworkStationsLogoCount);

//    System.out.println(bbcRadio.size());
//
//    Assert.assertEquals(bbcRadio.size(),26);

//  }


  @When("I select Hip Hop, RnB & Dancehall Category")
  public void iSelectHipHopRnBDancehallCategory() {
    basePage.BbcSoundHipHopCategoryLink.click();
  }

  @Then("I am on ‘Hip Hop, RnB & Dancehall’ Category page")
  public void iAmOnHipHopRnBDancehallCategoryPage() {
    String expectedPageTitle = "BBC Sounds - Categories - Hip Hop, RnB & Dancehall";
    String actualPageTitle = Driver.getDriver().getTitle();
    System.out.println("Page title : " + expectedPageTitle);
    Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));
    Assert.assertEquals(hiphopRnbAndDancehallCategoryPage.BbcSoundHipHopRnbAndDancehallPageVerification.getText(),"Hip Hop, RnB & Dancehall");
  }

  @And("I see the Category page is sorted by popular")
  public void iSeeTheCategoryPageIsSortedByPopular() {
    hiphopRnbAndDancehallCategoryPage.BbcSoundHipHopRnbAndDancehallViewAllLink.click();

    Select sortBy = new Select(hiphopRnbAndDancehallCategoryPage.BbcSoundHipHopRnbAndDancehallsortByDropdown);

    String popular = sortBy.getFirstSelectedOption().getText();

    Assert.assertEquals("Category page is NOT sorted by popular", popular,"Popular");

  }
}
