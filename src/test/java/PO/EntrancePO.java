package PO;

import com.UserOperations;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.model.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EntrancePO {
    public UserOperations userOperations = new UserOperations();
    @FindBy(how = How.XPATH,using = ".//input[@class = 'text input__textfield text_type_main-default']")
    public SelenideElement getFieldEmail;

    @FindBy(how = How.XPATH, using = ".//input[@type = 'password']")
    public SelenideElement getFieldPassword;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/form/button")
    public SelenideElement getButtonEntrance;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div/p/a")
    public SelenideElement getButtonEntranceRegistrationPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div/p[2]/a")
    public SelenideElement getButtonRestorePassword;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/nav/ul/li[1]/a/p")
    public SelenideElement getButtonConstructor;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/header/nav/div")
    public SelenideElement getButtonStellarBurgers;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/nav/ul/li[3]/button")
    public SelenideElement getExit;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/section[2]/div/button")
    public SelenideElement getButtonEntrance1;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/section/div[1]/div/p")
    public SelenideElement getIdOrder;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/h2")
    public SelenideElement checkExit;

    @Step
    public void checkExit(){
        checkExit.shouldBe(Condition.visible);
    }
    @Step
    public void checkIdOrder(){
        getIdOrder.shouldBe(Condition.visible);
    }
    @Step
    public void getClickButtonEntranceInAccount(){
        getButtonEntrance1.click();
    }
    @Step
    public void getClickExit(){
        getExit.click();
    }
    @Step
    public void getFieldEmailClick(){
        getFieldEmail.click();
    }
    @Step
    public void getFieldPasswordClick(){
        getFieldPassword.click();
    }
    @Step
    public void getClickButtonEntrance(){
        getButtonEntrance.click();
    }
    @Step
    public void getClickButtonEntranceRegistrationPage(){
        getButtonEntranceRegistrationPage.click();
    }
    @Step
    public void getClickButtonRestorePassword(){
        getButtonRestorePassword.click();
    }
    @Step
    public void getClickButtonConstructor(){
        getButtonConstructor.click();
    }
    @Step
    public void getClickButtonStellarBurgers(){
        getButtonStellarBurgers.click();
    }
    @Step
    public void setValueEmail(String email){
        getFieldEmail.setValue(email);
    }
    @Step
    public void setValueFieldPassword(String password){
        getFieldPassword.setValue(password);
    }
    @Step
    public void setClickAndInputValueFieldEmail(String email){
        getFieldEmailClick();
        setValueEmail(email);
    }
    @Step
    public void setClickAndInputValueFieldPassword(String password){
        getFieldPasswordClick();
        setValueFieldPassword(password);
    }
    @Step
    public void setClickAndInputValueFieldEmailAndPassword(String email, String password){
        setClickAndInputValueFieldEmail(email);
        setClickAndInputValueFieldPassword(password);
    }
}
