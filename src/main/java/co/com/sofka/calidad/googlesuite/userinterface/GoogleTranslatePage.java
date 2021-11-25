package co.com.sofka.calidad.googlesuite.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

    public static final Target SOURCE_LANGUAGE_SELECT = Target.the("Source language Button").located(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[2]/button[1]/div[2]"));
    public static final Target TARGET_LANGUAGE_SELECT = Target.the("Target language Button").located(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[5]/button[1]/div[2]"));
    public static final Target SOURCE_LANGUAGE_OPTION= Target.the("Source language option").locatedBy("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[3]/c-wiz[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[50]/div[2]");
    public static final Target TARGET_LANGUAGE_OPTION= Target.the("Target language option").locatedBy("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[3]/c-wiz[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[30]/div[2]");
    public static final Target SOURCE_LANGUAGE_TEXTAREA=Target.the("Source Language Text Area").located(By.tagName("textArea"));
    public static final Target TARGET_LANGUAGE_TEXTAREA=Target.the("Source Language Text Area").locatedBy(".dePhmb .J0lOec");
}
