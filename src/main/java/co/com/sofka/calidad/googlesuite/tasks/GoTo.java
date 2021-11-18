package co.com.sofka.calidad.googlesuite.tasks;

import co.com.sofka.calidad.googlesuite.userinterface.GoogleHomePage;
import co.com.sofka.calidad.googlesuite.userinterface.GoogleResults;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    private String searchQuery;

    public GoTo(String searchQuery) {
        this.searchQuery=searchQuery;
    }

    @Override
    @Step("{0} Types the word translator into search bar and clicks on the first result")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchQuery).into(GoogleResults.GOOGLE_SEARCH_BAR),
                Click.on(GoogleResults.GOOGLE_SUBMIT_BTN),
                Click.on(GoogleResults.GOOGLE_TRANSLATE_RESULT)
        );
    }

    public static Performable theApp(String searchQuery) {
        return instrumented(GoTo.class,searchQuery);
    }


}
