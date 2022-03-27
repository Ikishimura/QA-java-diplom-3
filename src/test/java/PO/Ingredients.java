package PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class Ingredients {
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/section[1]/div[1]/div[3]")
    public SelenideElement getFilling;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/section[1]/div[2]/ul[3]/a[3]/div[2]")
    public SelenideElement visibleCutlet;
    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/section[1]/div[1]/div[2]")
    public SelenideElement getSauce;
    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/section[1]/div[2]/ul[2]/a[1]/p")
    public SelenideElement visibleSauce;
    @FindBy(how = How.XPATH,using = "/html/body/div/div/section[1]/div[1]/button")
    public SelenideElement buttonExit;
    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/section[1]/div[1]/div[1]")
    public SelenideElement getBun;
    @FindBy(how = How.XPATH,using = "/html/body/div/div/main/section[1]/div[2]/ul[1]/a[1]/p")
    public SelenideElement visibleBun;
    @Step
    public void getClickBun(){
        getBun.click();
        visibleBun.shouldBe(Condition.visible, Duration.ofSeconds(1)).click();
        buttonExit.click();
    }
    @Step
    public void getClickSauce(){
        getSauce.click();
        visibleSauce.shouldBe(Condition.visible, Duration.ofSeconds(1)).click();
        buttonExit.click();
    }
    @Step
    public void getClickOnFilling(){
        getFilling.click();
        visibleCutlet.shouldBe(Condition.visible, Duration.ofSeconds(1)).click();
        buttonExit.click();
    }
}
