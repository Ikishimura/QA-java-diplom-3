import PO.Ingredients;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestClickOnIngredients {
    @DisplayName("Test click on filling")
    @Test
    public void testClickOnFilling(){
        Ingredients ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        ingredients.getClickOnFilling();

    }
    @DisplayName("Test click on sauce")
    @Test
    public void testClickOnSauce(){
        Ingredients ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        ingredients.getClickOnFilling();
        ingredients.getClickSauce();
    }
    @DisplayName("Test click on bun")
    @Test
    public void testClickOnBun(){
        Ingredients ingredients = open ("https://stellarburgers.nomoreparties.site",
                Ingredients.class);
        ingredients.getClickOnFilling();
        ingredients.getClickBun();
    }
}
