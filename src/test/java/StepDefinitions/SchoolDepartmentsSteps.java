package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.java.en.And;

public class SchoolDepartmentsSteps {

    LeftNav ln=new LeftNav();
    @And("Click on the Setup, School Location and Departments Button")
    public void clickOnTheSetupSchoolLocationAndDepartmentsButton() {
            ln.findAndClick("setupOne");
            ln.findAndClick("SchoolSetup");
            ln.findAndClick("Departments");
    }
}
