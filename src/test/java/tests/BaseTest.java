package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    protected final String BASE_URL = "https://github.com/",
            REPOSITORY_PATH = "andryushchenkoka/qaguru_hw_9",
            ISSUE_TEXT = "#2";

    protected final SelenideElement SEARCH_LINE = $("input[name = 'q']"),
            ISSUE_TAB = $("#issues-tab");

    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.headless = false;

        // Логгер добавляет в отчет скриншоты, копии страниц, подробный список шагов
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
