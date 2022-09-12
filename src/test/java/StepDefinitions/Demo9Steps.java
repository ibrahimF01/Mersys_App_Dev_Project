package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Demo9Steps {

     DialogContent dc=new DialogContent();
     LeftNav ln=new LeftNav();
    @And("Click on the Setup, Parameters and Bank Account Button")
    public void clickOnTheSetupParametersAndBankAccountButton() {
       ln.findAndClick("setupOne");
       ln.findAndClick("parameters");
       ln.findAndClick("BankAccounts");

    }

    //Add
    @And("Add Bank account button")
    public void addBankAccountButton() {
      dc.findAndClick("addButton");

    }
    @And("Fill the text areas")
    public void fillTheTextAreas() {

        dc.findAndSend("bankName","Ziraat44");
        dc.findAndSend("iban","TR441625");
        dc.findAndClick("Currency");
        dc.findAndClick("Currencychoice");
        dc.findAndSend("integration","441644");

    }

    @Then("Click the save button and verify")
    public void clickTheSaveButtonAndVerify() {
        dc.findAndClick("saveButton");
        dc.findAndContainsText("successMessage","success");
    }

    //Edit
    @And("Click the Edit Button")
    public void clickTheEditButton() {
        dc.findAndClick("editButton");

    }

    @And("Refill the text areas")
    public void refillTheTextAreas() {
        dc.findAndSend("bankName","Ziraat4416");
        dc.findAndSend("iban","TR4415");
        dc.findAndClick("Currency");
        dc.findAndClick("Currencychoice");
        dc.findAndSend("integration","441645");

    }

    //Delete
    @And("Click the Delete button and submit")
    public void clickTheDeleteButtonAndSubmit() {

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }

}
