package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.awt.Robot;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;

public class _04_DocumentTypesSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("And Click on the element in the left Nav")
    public void andClickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            ln.findAndClick(listElement.get(i));
        }

    }
    @And("Click on the space with robot")
    public void clickOnTheSpaceWithRobot() {
        try {
            GWD.Bekle(2);
            Robot r = new Robot();
            r.mouseMove(500, 850);
            r.mousePress(InputEvent.BUTTON1_MASK);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
            GWD.Bekle(1);
        }
    }

    @And("User sending the data in Dialog content")
    public void userSendingTheDataInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {dc.findAndContainsText("successMessage","success");
    }

    @And("Delete items from dialog")
    public void deleteItemsFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            dc.SearchAndDelete(listElement.get(i));
        }
    }
}
