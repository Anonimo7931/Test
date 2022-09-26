package co.com.choucair.certification.camilogomez.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UTestStep4  extends PageObject {

    public static final Target PASS = Target.the("Box where do we write the pass").
    located(By.id("password"));
    public static final Target RPASS = Target.the("Box where do we write the pass").
            located(By.id("confirmPassword"));

    public static final Target TERM_OF_USER = Target.the("Box where do we write the pass").
    located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTING = Target.the("Box where do we write the pass").
            located(By.id("privacySetting"));
    public static final Target NEXT = Target.the("button that finish the form")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
