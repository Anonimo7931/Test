package co.com.choucair.certification.camilogomez.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));




}
