package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage googlePage = new GooglePage();

    @Given("^the user enter in google$")
    public void theUserEnterInGoogle(){
        googlePage.navegateToGoogle();
    }

    @When("^the user clicks Voy a tener suerte button$")
    public void theUserClicksVoyATenerSuerteButton(){
        googlePage.clickVoyATenerSuerteButton();
    }

    @Then("^the Doodles page is showing$")
    public void theDoodlesPageIsShowing(){
        boolean doodlesPageIsDisplayed = googlePage.doodlePageIsDisplayed();
        Assert.assertTrue("The Doodle Page is not showing", doodlesPageIsDisplayed);
    }

    @When("^the user clicks Busqueda por imagen button$")
    public void theUserClicksBusquedaPorImagenButton(){
        googlePage.clickBusquedaPorImagenButton();
    }

    @Then("^the option to search by image is showing$")
    public void theOptionToSearchByImageIsShowing(){
        boolean optionToSearchByImageIsDisplayed = googlePage.optionToSearchByImageIsDisplayed();
        Assert.assertTrue("The Doodle Page is not showing", optionToSearchByImageIsDisplayed);
    }

}