import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WikiGithub {


    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void WikiGithubTest() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();

        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class:"));

    }

}

