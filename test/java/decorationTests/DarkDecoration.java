package decorationTests;

import MainTests.MainBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class DarkDecoration extends MainBase {
    @Test
    @DisplayName("Проверка верхней панели при светлой теме")
    void checkTopPanelB() {

        step("Включаем светлую тему", () -> {

        });
        step(" Проверяем наличие верхней панели", () -> {

        });

    }


    @Test
    @DisplayName("Проверка цвета текста и кнопок на верхней панели в белой теме")
    void checkColorTextTopPanel() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет текста и кнопок на вверхней панели == Black", () -> {

        });

    }

    @Test
    @DisplayName("Проверяем цвет верхней панели")
    void checkColorTopPanel() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет верхней панели == Orange", () -> {

        });

    }
    @Test
    @DisplayName("Проверяем цвет иконок в статус баре в белой теме")
    void checkColorIconsStatusbar() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет иконок в статус баре == Black", () -> {

        });

    }


    @Test
    @DisplayName("Проверка панели навигации в белой теме")
    void checkPanelNavigation() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем наличие панели навигации", () -> {

        });

    }

    @Test
    @DisplayName("Проверка цвета кнопок на панели навигации в белой теме")
    void checkColorButtonsPanelNavigation() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет кнопок на панели навигации == Black", () -> {

        });

    }

    @Test
    @DisplayName("Проверка цвета сепаратора в белой теме")
    void checkColorSeparators() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет сепаратора == Gray", () -> {

        });

    }


    @Test
    @DisplayName("Проверка цвета Title новости в белой теме")
    void checkColorTitleNews() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет TitleNew == Black", () -> {

        });

    }

    @Test
    @DisplayName("Проверка цвета даты новостей в белой теме")
    void checkColorDateNews() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет даты на новостях == Gray", () -> {

        });

    }

    @Test
    @DisplayName("Проверка приоритетных новостей на изменение цвета заголовка новостей в белой теме")
    void checkColorTitlePriorityNews() {


        step("Сделать свайп вниз до первой новости с приоритетом", () -> {

        });
        step("Проверить цвет текста в заголовке новости == Orange", () -> {

        });

    }



}
