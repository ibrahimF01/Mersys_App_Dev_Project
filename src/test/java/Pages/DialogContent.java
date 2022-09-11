package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;
    //omer
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(css = "mat-slide-toggle[formcontrolname='required']")
    private WebElement required;

    @FindBy(css = "mat-slide-toggle[formcontrolname='active']")
    private WebElement active;

    @FindBy(css = "mat-slide-toggle[formcontrolname='useCamera']")
    private WebElement useCamera;

    @FindBy(css = "textarea[formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "(//span[text()='Stage'])[3]")
    private WebElement stageCheck;

    @FindBy(xpath = "//span[text()=' Student Registration ']")
    private WebElement studentRegistration;

    @FindBy(xpath = "//span[text()=' Examination ']")
    private WebElement examination;

    @FindBy(xpath = "//span[text()=' Employment ']")
    private WebElement employment;

    @FindBy(xpath = "//span[text()=' Certificate ']")
    private WebElement certificate;

    @FindBy(xpath = "//span[text()=' Contract ']")
    private WebElement contract;

    @FindBy(xpath = "//span[text()=' Dismissal ']")
    private WebElement dismissal;

    @FindBy(css = "mat-select[formcontrolname='type']")
    private WebElement fieldType;

    @FindBy(xpath = "//span[text()=' List of Value ']")
    private WebElement listOfValue;

    @FindBy(css = "ms-text-field[formcontrolname='key']")
    private WebElement keyInput;

    @FindBy(css = "ms-text-field[placeholder$='VALUE']")
    private WebElement valueInput;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement exAddButton;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacity;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement code;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement section;

    @FindBy(xpath = "//span[text()='School Department']")
    private WebElement SchoolDepartment;



    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;
            case "description" : myElement =description; break;
            case "keyInput" : myElement =keyInput; break;
            case "valueInput" : myElement =valueInput; break;
            case "capacity" : myElement =capacity; break;
            case "code" : myElement =code; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "editButton" : myElement =editButton; break;
            case "required" : myElement =required; break;
            case "active" : myElement =active; break;
            case "useCamera" : myElement =useCamera; break;
            case "stageCheck" : myElement =stageCheck; break;
            case "studentRegistration" : myElement =studentRegistration; break;
            case "examination" : myElement =examination; break;
            case "employment" : myElement =employment; break;
            case "certificate" : myElement =certificate; break;
            case "contract" : myElement =contract; break;
            case "dismissal" : myElement =dismissal; break;
            case "fieldType" : myElement =fieldType; break;
            case "listOfValue" : myElement =listOfValue; break;
            case "exAddButton" : myElement =exAddButton; break;
            case "section" : myElement =section; break;
            case "SchoolDepartment" : myElement =SchoolDepartment; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        findAndClick("deleteButton");
        waitUntilClickable(deleteDialogBtn);
        findAndClick("deleteDialogBtn");
    }













}
