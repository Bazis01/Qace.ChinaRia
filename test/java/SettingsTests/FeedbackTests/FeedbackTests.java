package SettingsTests.FeedbackTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class FeedbackTests extends FeedbackBase {

    @Test
    @DisplayName("Проверка верхней панели")
    void checkTopPanel() {

        step("Включаем темную тему", () -> {

        });
        step(" Проверяем наличие верхней панели", () -> {

        });

    }

    @Test
    @DisplayName(" Проверяем Сепаратор на некорректные данные в поле почта")
    void checkEmailSeparatorColorError() {

        step("Нажимаем на поле Email", () -> {

        });
        step("Вводим текст: qwerty", () -> {

        });
        step(" Проверяем цвет сепаратора под полем Email == Red ", () -> {

        });
    }

    @Test
    @DisplayName(" Проверяем Сепаратор на некорректные данные в поле Сообщение")
    void checkMessageSeparatorColorError() {

        step("Нажимаем на поле Message", () -> {

        });
        step("Вводим текст на 500 символов", () -> {

        });
        step(" Проверяем цвет сепаратора под полем Message == Red ", () -> {

        });
    }

    @Test
    @DisplayName(" Проверяем цвет текста на активной кнопке")
    void checkColorTextActiveButtonSend() {
        step("Нажимаем на поле Message", () -> {

        });
        step("Вводим текст на 10 символов", () -> {

        });
        step("Нажимаем на поле Email", () -> {

        });
        step("Вводим почту: qwertyuiop@gmail.com", () -> {

        });
        step(" Проверяем цвет текста на кнопке Send == White ", () -> {

        });
    }

    @Test
    @DisplayName("Проверка кнопки назад")
    void checkBackButton() {

        step(" Нажимаем кнопку Back", () -> {

        });
        step(" Проверяем что перешли в Settings", () -> {

        });

    }

    @Test
    @DisplayName("Проверка активность кнопки Отправить")
    void checkActiveButtonSend() {
        step("Нажимаем на поле Message", () -> {

        });
        step("Вводим текст на 10 символов", () -> {

        });
        step("Нажимаем на поле Email", () -> {

        });
        step("Вводим почту: qwertyuiop@gmail.com", () -> {

        });
        step(" Проверяем что кнопка Send активна", () -> {

        });

    }

    @Test
    @DisplayName("Проверка кнопки назад в Разделе Обратная связь")
    void checkActiveButtonSe() {
        step("Нажимаем на поле Message", () -> {

        });
        step("Вводим текст на 10 символов", () -> {

        });
        step("Нажимаем на поле Email", () -> {

        });
        step("Вводим почту: qwertyuiop@gmail.com", () -> {

        });
        step(" Проверяем что кнопка Send активна", () -> {

        });

    }


}
