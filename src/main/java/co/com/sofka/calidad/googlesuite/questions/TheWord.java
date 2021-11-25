package co.com.sofka.calidad.googlesuite.questions;
import co.com.sofka.calidad.googlesuite.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;
import net.thucydides.core.annotations.Step;

public class TheWord extends WebDriverQuestion implements Question<String> {

    public TheWord() {
    }

    public static TheWord translated() {
        return new TheWord();
    }

    @Override
    @Step("{0} see the word translated is Queso")
    public String answeredBy(Actor actor) {
        return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXTAREA)
                .viewedBy(actor)
                .asString();
    }


}
