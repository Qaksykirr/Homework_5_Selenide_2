package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {

    @Test
    void githubTest() {
        // Откройте Гитхаб
        open("https://github.com/");
        // Выберите меню Open source -> Topics с помощью команды hover для Open source
        $(byText("Open Source")).hover();
        $("[href='/topics']").click();
        // Убедитесь что загрузилась нужная страница
        $("h2.h2").shouldHave(Condition.text("All featured topics"));
        $$(".p-responsive.mt-6 li").shouldHave(CollectionCondition.size(3));
    }

}
