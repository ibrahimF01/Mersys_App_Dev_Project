package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")//
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")//
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;
    //omer
    @FindBy(xpath = "(//span[text()='Human Resources'])[1]")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement humanResSetup;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement educationSetup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "(//span[text()='Human Resources'])")
    private WebElement HumanResources;

    @FindBy(xpath = "//span[contains(@class,'nav-link-title ng-tns-c249-18 ng-star-inserted')]")
    private WebElement setupThree;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement Attestations;


    @FindBy(xpath = "(//span[text()='Position Categories'])")
    private WebElement PositionsCategories;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement SchoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement Locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement Departments;

    //ahmet

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement BankAccounts;


    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement GradeLevels;




    WebElement myElement;
    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExamsOne" : myElement =entranceExamsOne; break;
            case "setupTwo" : myElement =setupTwo; break;
            case "entranceExamsTwo" : myElement =entranceExamsTwo; break;
            case "humanResources" : myElement =humanResources; break;
            case "humanResSetup" : myElement =humanResSetup; break;
            case "positions" : myElement =positions; break;
            case "education" : myElement =education; break;
            case "educationSetup" : myElement =educationSetup; break;
            case "subjectCategories" : myElement =subjectCategories; break;
            case "HumanResources" : myElement =HumanResources; break;
            case "setupThree" : myElement =setupThree; break;
            case "Positions" : myElement =PositionsCategories;
            case "Attestations" : myElement =Attestations;
            case "documentTypes" : myElement =documentTypes;
            case "fields" : myElement =fields;
            case "SchoolSetup" : myElement =SchoolSetup; break;
            case "Locations" : myElement =Locations; break;
            case "Departments" : myElement =Departments; break;
            case "BankAccounts" : myElement =BankAccounts; break;
            case "GradeLevels" : myElement =GradeLevels; break;



        }

        clickFunction(myElement);
    }

}
