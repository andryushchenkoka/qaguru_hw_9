package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class GithubTests extends BaseTest {

    private final String BASE_URL = "https://github.com/",
            REPOSITORY_PATH = "andryushchenkoka/qaguru_hw_9",
            ISSUE_TEXT = "#1";

    @Test
    @DisplayName("Issue search")
    public void issueSearchTest() {
        open(BASE_URL);

        $("input[name = 'q']").click();
        $("input[name = 'q']").setValue(REPOSITORY_PATH);
        $("input[name = 'q']").pressEnter();

        $(linkText(REPOSITORY_PATH)).click();
        $("#issues-tab").click();
        $(withText(ISSUE_TEXT)).should(Condition.exist);
    }
}
