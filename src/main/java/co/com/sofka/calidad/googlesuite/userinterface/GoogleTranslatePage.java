package co.com.sofka.calidad.googlesuite.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

    public static final Target SOURCE_LANGUAGE = Target.the("Source language Button").located(By.xpath("button[aria-label='Más idiomas de origen']:"));
    public static final Target TARGET_LANGUAGE = Target.the("Target language Button").located(By.xpath("button[@aria-label='Más idiomas de origen']"));

}
