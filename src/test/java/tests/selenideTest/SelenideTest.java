package tests.selenideTest;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest extends BaseTest {

    @Test
    @DisplayName("Issue search - Selenide")
    public void issueSearchSelenideTest() {

        open(BASE_URL);

        SEARCH_LINE.click();
        SEARCH_LINE.setValue(REPOSITORY_PATH);
        SEARCH_LINE.pressEnter();

        $(linkText(REPOSITORY_PATH)).click();
        ISSUE_TAB.click();
        $(withText(ISSUE_TEXT)).should(Condition.exist);
    }
}
