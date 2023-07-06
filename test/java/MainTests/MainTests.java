package MainTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MainTests extends MainBase {


    @Test
    @DisplayName("Проверка пометки приоритетных новостей ")
    void checkPriorityNews() {


        step("Сделать свайп вниз до первой новости с пометкой приоритет", () -> {

        });
        step("Проверить расположение молнии приоритетных новостей ", () -> {

        });

    }




    @Test
    @DisplayName("Проверка цвета пометки эксклюзивных новостей ")
    void checkColorTextExclusiveNews() {


        step("Сделать свайп вниз до первой новости с пометкой Эксклюзив", () -> {

        });
        step("Проверить цвет текста эксклюзив == Red", () -> {

        });

    }



    @Test
    @DisplayName("Проверка выделения кнопок на панели навигации")
    void checkSelectButtonNavigationPanel() {


        step("Нажать на любой раздел", () -> {

        });
        step("Проверить выделение кнопки после перехода в данный раздел", () -> {

        });


    }

    @Test
    @DisplayName("Проверка выделения кнопоки Main в разделе главное")
    void checkSelectButtonMain() {

        step("Провереть выделение кнопки Main", () -> {

        });

    }
    @Test
    @DisplayName("Проверка расположения даты на новостях ")
    void checkLocationDateNews() {


        step("Проверяем расположение даты на новостях", () -> {

        });

    }


    @Test
    @DisplayName("Проверка наличие новостей в разделе Main")
    void checkNewsSectionMain() {

        step("Проверяем наличие новостей", () -> {

        });

    }


    @Test
    @DisplayName("Проверка наличие кнопок на панели навигации")
    void checkButtonsPanelNavigation() {

        step("Проверяем наличие кнопок на панели навигации", () -> {

        });

    }

    @Test
    @DisplayName("Проверка наличие кнопок на верхней панели")
    void checkTextAndButtonTopPanel() {

        step("Проверяем наличие кнопок на вверхней панели", () -> {

        });

    }

    @Test
    @DisplayName("Проверка Корректного текста на верхней панели")
    void checkTextTopPanel() {

        step("Проверяем текст на вверхней панели", () -> {

        });

    }



}

