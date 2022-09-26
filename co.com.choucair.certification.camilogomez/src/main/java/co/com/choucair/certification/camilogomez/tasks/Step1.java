package co.com.choucair.certification.camilogomez.tasks;

import co.com.choucair.certification.camilogomez.userinterface.UTestRegisterPage;
import co.com.choucair.certification.camilogomez.userinterface.UTestStep1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Step1  implements Task {
    public static Step1 onThePage() {
        return Tasks.instrumented(Step1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Camilo").into(UTestStep1.FIRST_NAME),
                Enter.theValue("Gomez").into(UTestStep1.LAST_NAME),
                Enter.theValue("Camilo.Gomez@gmail.com").into(UTestStep1.EMAIL_ADDRESS),
                Click.on(UTestStep1.MONTH),
                Click.on(UTestStep1.DAY),
                Click.on(UTestStep1.YEAR),
                Click.on(UTestStep1.NEXT)
        );
    }
}
