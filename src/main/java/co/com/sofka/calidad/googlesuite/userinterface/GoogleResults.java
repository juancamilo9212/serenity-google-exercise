package co.com.sofka.calidad.googlesuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleResults {
    public static Target GOOGLE_SEARCH_BAR = Target.the("Google Search Bar").located(By.xpath("//input[@name='q']"));
    public static Target GOOGLE_SUBMIT_BTN = Target.the("Google Submit Button").located(By.xpath("//input[@type='submit']"));
    public static Target GOOGLE_TRANSLATE_RESULT = Target.the("Google Translate Result").located(By.xpath("//a[@href='https://translate.google.com/?hl=es']"));
    public static String GOOGLE_TRANSLATOR = "Traductor";
}
