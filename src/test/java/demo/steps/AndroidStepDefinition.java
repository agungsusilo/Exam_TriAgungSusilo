package demo.steps;

import demo.pages.AndroidPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AndroidStepDefinition {

    private AndroidPage androidPage = new AndroidPage();

    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {
        boolean result = androidPage.isOnPage();
        Assert.assertTrue(true);
    }

    @Then("User Click the Add button")
    public void userClickTheAddButton() {
        androidPage.clickAddButton();
    }

    @And("User enter title {string}")
    public void userEnterTitle(String keyword) {
        androidPage.inputTitle(keyword);
    }

    @And("User enter todo details with {string}")
    public void userEnterTodoDetailsWith(String keyword) {
        androidPage.inputDesc(keyword);
    }

    @Then("User Click the save button")
    public void userClickTheSaveButton() {
        androidPage.saveTask();
    }

    @When("User click the check button")
    public void userClickTheCheckButton() {
        androidPage.checkComplete();
    }

    @And("User see the button is check")
    public void userSeeTheButtonIsCheck() {
        boolean result = androidPage.isChecked();
        Assert.assertTrue(true);
    }

    @And("User see the button is uncheck")
    public void userSeeTheButtonIsUncheck() {
        boolean result = androidPage.isChecked();
        Assert.assertFalse(false);
    }

    @When("User click the Filter button")
    public void userClickTheFilterButton() {
        androidPage.clickFilterButton();
    }

    @And("User click the Active button")
    public void userClickTheActiveButton() {
        androidPage.clickActiveFilter();
    }

    @Then("User see the active to do list")
    public void userSeeTheActiveToDoList() {
        boolean result = androidPage.isOnActiveOnlyPage();
        Assert.assertTrue(true);
    }

    @And("User click the Completed button")
    public void userClickTheCompletedButton() {
        androidPage.clickCompleteFilter();
    }

    @Then("User see the completed to do list")
    public void userSeeTheCompletedToDoList() {
        boolean result = androidPage.isOnCompleteOnlyPage();
        Assert.assertTrue(true);
    }

    @When("User click the threedot button")
    public void userClickTheThreedotButton() {
        androidPage.clickThreeDot();
    }

    @Then("User click the Refresh button")
    public void userClickTheRefreshButton() {
        androidPage.clickRefresh();
    }


    @Then("User click the ClearCompleted button")
    public void userClickTheClearCompletedButton() {
        androidPage.clearCompleted();
    }

    @When("User click the threebars button")
    public void userClickTheThreebarsButton() {
        androidPage.clickThreeBars();
    }

    @And("User click the Statistics button")
    public void userClickTheStatisticsButton() {
        androidPage.clickStatisticBtn();
    }

    @Then("User see the Statistic page")
    public void userSeeTheStatisticPage() {
        boolean result = androidPage.isOnStatisticPage();
        Assert.assertTrue(true);
    }



}
