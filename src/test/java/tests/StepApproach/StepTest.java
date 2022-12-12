package tests.StepApproach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

public class StepTest extends BaseTest {

    private final String BASE_URL = "https://github.com/",
            REPOSITORY_PATH = "andryushchenkoka/qaguru_hw_9",
            ISSUE_TEXT = "#2";

    @Test
    @DisplayName("Issue search - WebSteps")
    public void issueSearchWebStepsTest() {

        new WebSteps().openMainPage(BASE_URL)
                .searchForRepository(REPOSITORY_PATH)
                .clickOnRepoLink(REPOSITORY_PATH)
                .openIssuesTab()
                .shouldSeeIssueWithNumber(ISSUE_TEXT);

    }
}
