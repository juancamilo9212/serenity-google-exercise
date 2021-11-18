package co.com.sofka.calidad.googlesuite.stepdefinitions;

import co.com.sofka.calidad.googlesuite.tasks.GoTo;
import co.com.sofka.calidad.googlesuite.tasks.OpenTheBrowser;
import co.com.sofka.calidad.googlesuite.userinterface.GoogleHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.com.sofka.calidad.googlesuite.userinterface.GoogleResults.GOOGLE_TRANSLATOR;

public class GoogleTranslateStepDefinitions{

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor juan = Actor.named("Juan");
    private GoogleHomePage googleHomePage;

    @Before
    public void setUp(){
        juan.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }

    @Given("that Juan wants to translate a word")
    public void thatJuanWantsToTranslateAWord() {
        juan.wasAbleTo(
                OpenTheBrowser.on(googleHomePage),
                GoTo.theApp(GOOGLE_TRANSLATOR)
        );
    }
    @When("she translates the word cheese from english to spanish")
    public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {

    }
    @Then("she should see the word queso in the screen")
    public void sheShouldSeeTheWordQuesoInTheScreen() {

    }
}
