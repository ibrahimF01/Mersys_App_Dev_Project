package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;

public class Demo6_Steps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @And("Click to Education and click to Setup and Subject Categories")
    public void clickToEducationAndClickToSetupAndSubjectCategories() {
        ln.findAndClick("education");
        ln.findAndClick("educationSetup");
        ln.findAndClick("subjectCategories");
    }

    @And("Write to name and code")
    public void writeToNameAndCode() {
        dc.findAndSend("nameInput","educationgrup7");
        dc.findAndSend("codeInput","2345678");
    }

    @And("Click to edit button")
    public void clickToEditButton() {
        dc.findAndSend("searchInput","grup7");
        dc.findAndClick("searchButton");
        dc.findAndClick("editButton");
    }

    @And("Rewrite to name and code")
    public void rewriteToNameAndCode() {
        dc.findAndSend("nameInput","educationgrup7NEW");
        dc.findAndSend("codeInput","2345678901");
    }

    @And("Click to delete button")
    public void clickToDeleteButton() {
        dc.SearchAndDelete("grup7");
    }
}
