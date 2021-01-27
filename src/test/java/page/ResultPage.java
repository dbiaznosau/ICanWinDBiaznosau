package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
    public WebDriver driver;
    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }
    @FindBy(xpath = "//*[@class='textarea']" )
    WebElement pastedCodeField;

    public String pastedCodeText() {
        return pastedCodeField.getText();
    }

}
