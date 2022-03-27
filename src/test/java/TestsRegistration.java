import PO.RegistrationPO;
import com.UserOperations;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class TestsRegistration {
    @DisplayName("Test success registration")
    @Test
    public void testSuccessRegistration(){
        RegistrationPO testsSuccessRegistration = open ("https://stellarburgers.nomoreparties.site",
                RegistrationPO.class);

        testsSuccessRegistration.getClickButtonPersonalArea();
        testsSuccessRegistration.getButtonRegistrationClick();

        testsSuccessRegistration.setFillingOutTheRegistrationForm(RandomStringUtils.randomAlphabetic(5)+"@mail.ru",
                RandomStringUtils.randomAlphabetic(7),RandomStringUtils.randomAlphabetic(6));

        testsSuccessRegistration.getClickButtonRegistration1();
        testsSuccessRegistration.getClickButtonEntrance();
    }
    @DisplayName("Test success registration with error")
    @Test
    public void testSuccessRegistrationWithError() {
        RegistrationPO testsSuccessRegistrationWithError = open("https://stellarburgers.nomoreparties.site",
                RegistrationPO.class);

        testsSuccessRegistrationWithError.getClickButtonPersonalArea();
        testsSuccessRegistrationWithError.getButtonRegistrationClick();

        testsSuccessRegistrationWithError.setFillingOutTheRegistrationForm(RandomStringUtils.randomAlphabetic(5)+"@mail.ru",
                RandomStringUtils.randomAlphabetic(7),RandomStringUtils.randomAlphabetic(4));

        testsSuccessRegistrationWithError.getClickError();
        testsSuccessRegistrationWithError.getClickButtonRegistration1();
    }
}
