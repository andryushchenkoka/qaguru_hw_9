package tests.stepTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.BaseTest;

public class StepTest extends BaseTest {

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
