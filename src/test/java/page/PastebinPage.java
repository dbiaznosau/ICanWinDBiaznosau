package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinPage {

    public WebDriver driver;
    public PastebinPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    @FindBy (id = "postform-text" )
    WebElement pasteCodeField;

    @FindBy (id = "select2-postform-expiration-container" )
    WebElement dropDownBtn;

    @FindBy (xpath = "//li[text()[contains(.,'10 Minutes')]]" )
    WebElement expirationOption;

    @FindBy (id = "postform-name" )
    WebElement pasteName;

    @FindBy (xpath = "//button[@type='submit']" )
    WebElement pasteBtn;

    public void pasteCode(String pasteCode){ pasteCodeField.sendKeys(pasteCode); }

    public void openDropdown (){
        dropDownBtn.click();
    }

    public void selectExpirationTime(String pasteExpirationValue){
        expirationOption.click();
    }

    public void pasteNameInput(String pasteNameInput){
        pasteName.sendKeys(pasteNameInput);
    }

    public void submitPaste (){
        pasteBtn.click();
    }


}
