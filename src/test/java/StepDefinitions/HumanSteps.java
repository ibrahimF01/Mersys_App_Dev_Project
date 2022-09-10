package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HumanSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the Human Resouces Position in the left Nav")
    public void clickOnTheHumanResoucesPositionInTheLeftNav() {
        ln.findAndClick("HumanResources");
        ln.findAndClick("setupThree");
        ln.findAndClick("Positions");
    }

    @Then("User Add Human Position")
    public void userAddHumanPosition() {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","group7");
        dc.findAndClick("saveButton");
        dc.findAndClick("closeDialog");
    }

    @Then("User Edit Human Position")
    public void userEditHumanPosition() {
        dc.findAndSend("searchInput","group7");
        dc.findAndClick("searchButton");
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","group07");
        dc.findAndClick("saveButton");
        dc.findAndClick("closeDialog");
    }

    @Then("User Delete Human Position")
    public void userDeleteHumanPosition() {
        dc.findAndSend("searchInput","group07");
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");


    }


}
