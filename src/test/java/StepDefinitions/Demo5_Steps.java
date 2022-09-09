package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Demo5_Steps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Click to Human Resources and click to Setup and positions")
    public void clickToHumanResourcesAndClickToSetupandpositions() {
        ln.findAndClick("humanResources");
        ln.findAndClick("humanResSetup");
        ln.findAndClick("positions");

    }

    @And("Click to add button")
    public void ClickToAddButton() {
        dc.findAndClick("addButton");
    }

    @And("Write to name and short name")
    public void writeToNameAndShortName() {
        dc.findAndSend("nameInput", "grup7");
        dc.findAndSend("shortName", "testing");
    }

    @Then("Click to save button and verify")
    public void clickToSaveButtonAndVerify() {
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage", "success");
    }

    @And("Click to Positions and Click to edit button")
    public void clickToPositionsAndClickToEditButton() {
        ln.findAndClick("positions");
        dc.findAndSend("searchInput","grup7");
        dc.findAndClick("searchButton");
        dc.findAndClick("editButton");
    }

    @And("Rewrite to name and short name")
    public void rewriteToNameAndShortName() {
        dc.findAndSend("nameInput", "grup7New");
        dc.findAndSend("shortName", "testingNew");

    }

    @And("Click to Positions and Click to delete button")
    public void clickToPositionsAndClickToDeleteButton() {
        ln.findAndClick("positions");
        dc.SearchAndDelete("grup7");

    }

    @Then("Click to delete button and verify")
    public void clickToDeleteButtonAndVerify() {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
        dc.findAndContainsText("successMessage","success");
    }
}
