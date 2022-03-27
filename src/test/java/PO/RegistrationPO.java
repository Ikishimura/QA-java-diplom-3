package PO;
import com.UserOperations;
import com.codeborne.selenide.SelenideElement;
import com.model.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPO {
    @FindBy(how = How.LINK_TEXT,using = "Личный Кабинет")
    public SelenideElement getButtonPersonalArea;

    @FindBy(how = How.LINK_TEXT, using = "Зарегистрироваться")
    public SelenideElement getButtonRegistration;

    @FindBy(how = How.XPATH,using = ".//input[@class = 'text input__textfield text_type_main-default']")
    public SelenideElement getFieldName;

    @FindBy(how = How.XPATH, using = ".//fieldset[2]//input[@class='text input__textfield text_type_main-default']")
    public SelenideElement getFieldEmail;

    @FindBy(how = How.XPATH, using = ".//fieldset[3]//input[@class='text input__textfield text_type_main-default']")
    public SelenideElement getFieldPassword;

    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    public SelenideElement getButtonRegistration1;

    @FindBy(how = How.XPATH,using = ".//button[text()='Войти']")
    public SelenideElement getButtonEntrance;

    @FindBy(how = How.XPATH,using = ".//button[text()='Зарегистрироваться']")
    public SelenideElement getError;

    public void getClickButtonPersonalArea(){
        getButtonPersonalArea.click();
    }

    public void getButtonRegistrationClick(){
        getButtonRegistration.click();
    }

    public void getFieldNameClick(){
        getFieldName.click();
    }

    public void getClickFieldEmail(){
        getFieldEmail.click();
    }

    public void getClickFieldPassword(){
        getFieldPassword.click();
    }
    public void getClickButtonEntrance(){
        getButtonEntrance.click();
    }

    public void getClickButtonRegistration1(){
        getButtonRegistration1.click();
    }

    public void getClickError(){
        getError.click();
    }

    public void setValueFieldPassword(String password){
        getFieldPassword.setValue(password);
    }

    public void setValueFieldEmail(String email){
        getFieldEmail.setValue(email);
    }

    public void setValueFieldName(String name){
        getFieldName.setValue(name);
    }

    @Step
    public void setValueAndClickFieldEmail(String email) {
        getClickFieldEmail();
        setValueFieldEmail(email);
    }
    @Step
    public void setClickAndInputValueFieldName(String name){
        getFieldNameClick();
        setValueFieldName(name);
    }
    @Step
    public void setClickAndInputValueFieldPassword(String password){
        getClickFieldPassword();
        setValueFieldPassword(password);
    }
    @Step
    public void setFillingOutTheRegistrationForm (String email, String name,String password){
        setValueFieldName(name);
        setValueFieldEmail(email);
        setValueFieldPassword(password);
    }
}
