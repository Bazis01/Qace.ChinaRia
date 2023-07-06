package decorationTests;

import MainTests.MainBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class WhiteDecoration extends MainBase {
    @Test
    @DisplayName("Проверка верхней панели при светлой теме")
    void checkTopPanelW() {

        step("Включаем светлую тему", () -> {

        });
        step(" Проверяем наличие верхней панели", () -> {

        });

    }


    @Test
    @DisplayName("Проверка цвета текста и кнопок на верхней панели в белой теме")
    void checkColorTextTopPanelW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет текста и кнопок на вверхней панели == Black", () -> {

        });

    }

    @Test
    @DisplayName("Проверяем цвет верхней панели")
    void checkColorTopPanelW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет верхней панели == Orange", () -> {

        });

    }

    @Test
    @DisplayName("Проверяем цвет иконок в статус баре в белой теме")
    void checkColorIconsStatusbarW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет иконок в статус баре == Black", () -> {

        });

    }


    @Test
    @DisplayName("Проверка панели навигации в белой теме")
    void checkPanelNavigationW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем наличие панели навигации", () -> {

        });

    }

    @Test
    @DisplayName("Проверка цвета кнопок на панели навигации в белой теме")
    void checkColorButtonsPanelNavigationW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет кнопок на панели навигации == Black", () -> {

        });

    }

    @Test
    @DisplayName("Проверка цвета сепаратора в белой теме")
    void checkColorSeparatorsW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет сепаратора == Gray", () -> {

        });

    }


    @Test
    @DisplayName("Проверка цвета Title новости в белой теме")
    void checkColorTitleNewsW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет TitleNew == Black", () -> {

        });

    }

    @Test
    @DisplayName("Проверка цвета даты новостей в белой теме")
    void checkColorDateNewsW() {

        step("Включаем белую тему", () -> {

        });
        step("Проверяем цвет даты на новостях == Gray", () -> {

        });

    }



    @Test
    @DisplayName("Проверка приоритетных новостей на изменение цвета заголовка новостей в белой теме")
    void checkColorTitlePriorityNewsW() {


        step("Сделать свайп вниз до первой новости с приоритетом", () -> {

        });
        step("Проверить цвет текста в заголовке новости == Orange", () -> {

        });

    }


}
