package co.com.choucair.certification.camilogomez.tasks;

import co.com.choucair.certification.camilogomez.userinterface.UTestStep2;
import co.com.choucair.certification.camilogomez.userinterface.UTestStep3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Step3  implements Task {
    public static Step3 onThePage() {
        return Tasks.instrumented(Step3.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestStep3.BUTTON));
    }
}
