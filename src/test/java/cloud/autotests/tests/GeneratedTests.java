package cloud.autotests.tests;

import cloud.autotests.helpers.DriverSettings;
import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @BeforeAll
    static void setUpTimeout() {
        Configuration.timeout = 6000;
    }

    @Test
    @DisplayName("Проверка title главной страницы")
    void titleTest() {
        step("Открытие страницы Альфа-банка", () ->
                open("https://alfabank.ru/"));

        step("title главной страницы должен быть: Альфа-Банк - кредитные и дебетовые карты, " +
                "кредиты наличными,автокредитование, ипотека " +
                "и другие банковские услуги физическим и юридическим лицам – Альфа-Банк'", () -> {
            String expectedTitle = "Альфа-Банк - кредитные и дебетовые карты, кредиты наличными, " +
                    "автокредитование, ипотека и другие банковские услуги физическим и юридическим лицам – Альфа-Банк";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Переход на страницу Интернет-банка")
    void checkOpenPageInternetBankTest() {
        step("Открытие страницы Альфа-банка", () ->
                open("https://alfabank.ru/"));

        step("Клик по кнопке Интернет-банк", () -> {
                    $(".H1Cda9").click();
        });

        step("title главной страницы должен быть: Интернет-банк «Альфа-Клик»", () -> {
            String expectedTitle = "Интернет-банк «Альфа-Клик»";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Переход на страницу Накопительный счёт")
    void checkOpenPageSavingsAccountTest() {
        step("Открытие страницы Альфа-банка", () ->
                open("https://alfabank.ru/"));

        step("Клик по кнопке Альфа-Счёт", () -> {
            $("#Main-Page-Important-Info-2").click();
        });

        step("title главной страницы должен быть: Накопительный счет «Альфа-Счет» - " +
                "вклады и инвестиции в Альфа-Банк", () -> {
            String expectedTitle = "Накопительный счет «Альфа-Счет» - вклады и инвестиции в Альфа-Банк";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Переход на страницу Альфа-Вклад")
    void checkOpenPageDepositsTest() {
        step("Открытие страницы Альфа-банка", () ->
                open("https://alfabank.ru/"));

        step("Клик по кнопке Альфа-Вклад", () -> {
            $("#Main-Page-Important-Info-3").click();
        });

        step("title главной страницы должен быть: Вклад «Альфа-Вклад» | " +
                "Открыть выгодный вклад в Альфа-Банке", () -> {
            String expectedTitle = "Вклад «Альфа-Вклад» | Открыть выгодный вклад в Альфа-Банке";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Переход на страницу Зарплатная Альфа-Карта")
    void checkOpenPageSalaryCardTest() {
        step("Открытие страницы Альфа-банка", () ->
                open("https://alfabank.ru/"));

        step("Клик по кнопке Зарплатная Альфа-Карта", () -> {
            $("#Main-Page-Important-Info-6").click();
        });

        step("title главной страницы должен быть: Индивидуальная зарплатная карта — «Альфа-Банк»", () -> {
            String expectedTitle = "Индивидуальная зарплатная карта — «Альфа-Банк»";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Переход на страницу Мобильное приложение для iOS и Android")
    void checkOpenPageOnlineTest() {
        step("Открытие страницы Альфа-банка", () ->
                open("https://alfabank.ru/"));

        step("Клик по кнопке Мобильное приложение для iOS и Android", () -> {
            $(".dHnQtm").click();
        });

        step("title главной страницы должен быть: Приложение Альфа-Банка - " +
                "безопасный доступ к вашим счетам и картам — «Альфа-Банк»", () -> {
            String expectedTitle = "Приложение Альфа-Банка - безопасный доступ к вашим счетам и картам — «Альфа-Банк»";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

}
