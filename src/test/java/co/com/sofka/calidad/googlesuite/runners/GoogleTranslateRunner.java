package co.com.sofka.calidad.googlesuite.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/google_translate.feature",
        glue = "co.com.sofka.calidad.googlesuite.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GoogleTranslateRunner {

}
