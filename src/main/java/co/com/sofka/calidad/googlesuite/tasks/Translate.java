package co.com.sofka.calidad.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.sofka.calidad.googlesuite.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Translate implements Task {

    private String word;

    public Translate(String word) {
        this.word = word;
    }

    public static Performable the(String word) {
        return instrumented(Translate.class, word);
    }

    @Override
    @Step("{0} Translate the word cheese from english to spanish")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_SELECT),
                Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
                Click.on(GoogleTranslatePage.TARGET_LANGUAGE_SELECT),
                Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
                Enter.theValue(word).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA)
        );
    }

}
