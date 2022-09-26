package co.com.choucair.certification.camilogomez.tasks;

import co.com.choucair.certification.camilogomez.userinterface.UTestStep1;
import co.com.choucair.certification.camilogomez.userinterface.UTestStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Step4 implements Task {
    public static Step4 onThePage() {
        return Tasks.instrumented(Step4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Camilo1234*").into(UTestStep4.PASS),
                Enter.theValue("Camilo1234*").into(UTestStep4.RPASS),
                Click.on(UTestStep4.TERM_OF_USER),
                Click.on(UTestStep4.PRIVACY_SETTING),
                Click.on(UTestStep4.NEXT)
        );
    }
}
