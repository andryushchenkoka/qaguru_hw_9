package tests.stepTest;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Открыть главную страницу")
    public WebSteps openMainPage(String mainPageUrl) {
        open(mainPageUrl);

        return this;
    }

    @Step
    public WebSteps searchForRepository(String repository) {
        $("input[name = 'q']").click();
        $("input[name = 'q']").setValue(repository);
        $("input[name = 'q']").pressEnter();

        return this;
    }

    @Step
    public WebSteps clickOnRepoLink(String repositoryLink) {
        $(linkText(repositoryLink)).click();

        return this;
    }

    @Step
    public WebSteps openIssuesTab() {
        $("#issues-tab").click();

        return this;
    }

    @Step
    public void shouldSeeIssueWithNumber(String issueText) {
        $(withText(issueText)).should(Condition.exist);
    }
}
