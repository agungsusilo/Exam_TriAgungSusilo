package demo.steps;

import demo.pages.GoogleHome;
import demo.pages.GoogleResult;
import demo.pages.WikipediaResult;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PokemonStepDef {
    private GoogleHome googleHome = new GoogleHome();
    private GoogleResult googleResult = new GoogleResult();
    private WikipediaResult wikipediaResult = new WikipediaResult();

    @Given("User open google home page")
    public void userOpenGoogleHomePage() {
        googleHome.openHomePage();
    }

    @When("User input Search Pokemon {string} and click Enter")
    public void userInputSearchPokemonAndClickEnter(String keyword) {
        googleHome.inputSearch(keyword);
    }

    @Then("User click the first search result")
    public void userClickTheFirstSearchResult() {
        googleResult.getFirstLink();
    }

    @And("User go to the wikipedia article")
    public void userGoToTheWikipediaArticle() {
    }

    @And("User verify that pokemon name is same as API")
    public void userVerifyThatPokemonNameIsSameAsAPI() {
    }

    @Then("USer verify that pokemon number is same as API")
    public void userVerifyThatPokemonNumberIsSameAsAPI() {
    }
}
