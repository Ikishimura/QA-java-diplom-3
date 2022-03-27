import PO.EntrancePO;
import PO.Ingredients;
import PO.RegistrationPO;
import com.UserOperations;

import com.model.User;
import com.model.UserRegisterResponse;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestEntrance {
    public UserOperations userOperations;
    private RegistrationPO registrationPO;
    private EntrancePO entrancePO;
    public UserRegisterResponse userRegisterResponse;
    @Before
    public void setUp(){
        userOperations = new UserOperations();
        userRegisterResponse= new UserRegisterResponse();
        entrancePO = open ("https://stellarburgers.nomoreparties.site",
                EntrancePO.class);
        registrationPO = open ("https://stellarburgers.nomoreparties.site",
                RegistrationPO.class);
        userOperations.register();
    }
    @After
    public void tearDown(){
        userOperations.delete();
    }
    @DisplayName("Test by clicking entrance in account")
    @Test
    public void testByClickingEntranceInAccount(){
        UserOperations userOperations = new UserOperations();
        String fields = userOperations.register().values().toString();
        System.out.println(fields);

        StringBuilder email = new StringBuilder(fields);
        email.delete(45,46);
        String fieldsEmail = email.delete(0,25).toString();
        System.out.println(fieldsEmail);

        StringBuilder password = new StringBuilder(fields);
        password.delete(0,1);
        String fieldPassword = password.delete(10,46).toString();
        System.out.println(fieldPassword);

        StringBuilder name = new StringBuilder(fields);
        name.delete(0,13);
        String fieldName = name.delete(10,46).toString();
        System.out.println(fieldName);

        entrancePO.getClickButtonEntranceInAccount();
        entrancePO.setClickAndInputValueFieldEmailAndPassword(fieldsEmail,fieldPassword);
        entrancePO.getClickButtonEntrance();
        entrancePO.getClickButtonEntranceInAccount();
        entrancePO.checkIdOrder();
    }
    @DisplayName("Test by clicking entrance personal area")
    @Test
    public void testByClickingEntrancePersonalArea(){
        UserOperations userOperations = new UserOperations();
        String fields = userOperations.register().values().toString();
        System.out.println(fields);
        StringBuilder email = new StringBuilder(fields);
        email.delete(45,46);
        String fieldsEmail = email.delete(0,25).toString();
        System.out.println(fieldsEmail);

        StringBuilder password = new StringBuilder(fields);
        password.delete(0,1);
        String fieldPassword = password.delete(10,46).toString();
        System.out.println(fieldPassword);

        StringBuilder name = new StringBuilder(fields);
        name.delete(0,13);
        String fieldName = name.delete(10,46).toString();
        System.out.println(fieldName);

        registrationPO.getClickButtonPersonalArea();
        entrancePO.setClickAndInputValueFieldEmailAndPassword(fieldsEmail, fieldPassword);
        entrancePO.getClickButtonEntrance();
        entrancePO.getClickButtonEntranceInAccount();
        entrancePO.checkIdOrder();
    }
    @DisplayName("Test by clicking entrance on page registration")
    @Test
    public void testByClickingEntranceOnPageRegistration(){
        UserOperations userOperations = new UserOperations();
        String fields = userOperations.register().values().toString();
        System.out.println(fields);

        StringBuilder email = new StringBuilder(fields);
        email.delete(45,46);
        String fieldsEmail = email.delete(0,25).toString();
        System.out.println(fieldsEmail);

        StringBuilder password = new StringBuilder(fields);
        password.delete(0,1);
        String fieldPassword = password.delete(10,46).toString();
        System.out.println(fieldPassword);

        StringBuilder name = new StringBuilder(fields);
        name.delete(0,13);
        String fieldName = name.delete(10,46).toString();
        System.out.println(fieldName);

        registrationPO.getClickButtonPersonalArea();
        entrancePO.getClickButtonEntranceRegistrationPage();
        entrancePO.getClickButtonEntranceRegistrationPage();
        entrancePO.setClickAndInputValueFieldEmailAndPassword(fieldsEmail,fieldPassword);
        entrancePO.getClickButtonEntrance();
        entrancePO.getClickButtonEntranceInAccount();
        entrancePO.checkIdOrder();
    }
    @DisplayName("Test by clicking entrance on page restart password") //Тоже
    @Test
    public void testByClickingEntranceOnPageRestartPassword(){

        UserOperations userOperations = new UserOperations();
        String fields = userOperations.register().values().toString();
        System.out.println(fields);

        StringBuilder email = new StringBuilder(fields);
        email.delete(45,46);
        String fieldsEmail = email.delete(0,25).toString();
        System.out.println(fieldsEmail);

        StringBuilder password = new StringBuilder(fields);
        password.delete(0,1);
        String fieldPassword = password.delete(10,46).toString();
        System.out.println(fieldPassword);

        StringBuilder name = new StringBuilder(fields);
        name.delete(0,13);
        String fieldName = name.delete(10,46).toString();
        System.out.println(fieldName);

        registrationPO.getClickButtonPersonalArea();
        entrancePO.getClickButtonRestorePassword();
        entrancePO.getClickButtonEntranceRegistrationPage();
        entrancePO.setClickAndInputValueFieldEmailAndPassword(fieldsEmail,fieldPassword);
        entrancePO.getClickButtonEntrance();
        entrancePO.getClickButtonEntranceInAccount();
        entrancePO.checkIdOrder();
    }
}
