package StepDefinitions;


import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;


public class SchoolLocationsSteps {// Haşir

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements){
        List<String> listElement=elements.asList(String.class);
        for (int i=0;i<listElement.size();i++){
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements){
        List<List<String>> listElement=elements.asLists(String.class);
        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @And("Click on the Setup, School Location and Locations Button")
    public void clickOnTheElementInTheLeftNav() {
        ln.findAndClick("setupOne");
        ln.findAndClick("SchoolSetup");
        ln.findAndClick("Locations");
    }
}
