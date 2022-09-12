package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class Demo10Steps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Click on the Setup, Parameters and Bank Grade Level Button")
    public void clickOnTheSetupParametersAndBankGradeLevelButton() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("GradeLevels");
    }

    @And("Click Add Grade Level button")
    public void clickAddGradeLevelButton() {
        dc.findAndClick("addButton");

    }

    @And("Fill the text area")
    public void fillTheTextArea() {
        dc.findAndSend("nameInput","amet2");
        dc.findAndSend("shortName","ecik434");
        dc.findAndSend("order","1");

    }

    @And("Refill the text area")
    public void refillTheTextArea() {
        dc.findAndSend("nameInput","amet442");
        dc.findAndSend("shortName","ecik442");
        dc.findAndSend("order","1");


    }
}
