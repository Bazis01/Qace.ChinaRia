package MainTests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static io.qameta.allure.Allure.step;


public class MainBase {

    @BeforeAll
    public static void setUp() {
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        step("Запускаем приложение", () -> {

        });
        step(" ", () -> {

        });

    }
}
