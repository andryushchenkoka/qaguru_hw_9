package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAnnotations {

    @Test
    @Feature("Здесь отображается Feature")
    @Story("Здесь отображается Story")
    @Owner("Здесь отображается Owner")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Здесь отображается Link value", url = "https://ya.ru/")
    @DisplayName("Здесь отображается DisplayName")
    public void doSomething() {

    }
}
