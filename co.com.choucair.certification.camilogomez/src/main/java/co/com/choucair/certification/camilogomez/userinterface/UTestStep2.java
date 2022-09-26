package co.com.choucair.certification.camilogomez.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UTestStep2  extends PageObject {
    public static final Target BUTTON = Target.the("button that continue next step on the form").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
