package tests.LambdaApproach;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaTest extends BaseTest {

    private final String BASE_URL = "https://github.com/",
            REPOSITORY_PATH = "andryushchenkoka/qaguru_hw_9",
            ISSUE_TEXT = "#2";

    private final SelenideElement SEARCH_LINE = $("input[name = 'q']"),
            ISSUE_TAB = $("#issues-tab");

    @Test
    @DisplayName("Issue search - Lambda")
    public void issueSearchLambdaTest() {

        step("Открыть главную страницу " + BASE_URL, () -> {
            open(BASE_URL);
        });

        step("Найти репозиторий " + REPOSITORY_PATH, () -> {
            SEARCH_LINE.click();
            SEARCH_LINE.setValue(REPOSITORY_PATH);
            SEARCH_LINE.pressEnter();
        });

        step("Кликнуть по ссылке репозитория " + REPOSITORY_PATH, () -> {
            $(linkText(REPOSITORY_PATH)).click();
        });

        step("Кликнуть по табу Issues", () -> {
            ISSUE_TAB.click();
        });

        step("Проверить наличие Issue с номером " + ISSUE_TEXT, () -> {
            $(withText(ISSUE_TEXT)).should(Condition.exist);
        });
    }
}
