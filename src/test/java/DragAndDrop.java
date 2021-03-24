import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll
    static void setup() {

        Configuration.startMaximized = true;
    }

    @Test
    public void DragAndDropTest () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        String columnA = "#column-a";
        String columnB = "#column-b";

        $(columnA).shouldHave(text("A"));
        $(columnB).shouldHave(text("B"));

        $(columnA).dragAndDropTo($(columnB));

        $(columnA).shouldHave(text("B"));
        $(columnB).shouldHave(text("A"));


    }

}
