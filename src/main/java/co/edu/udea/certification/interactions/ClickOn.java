package co.edu.udea.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction {
    private final Target button;
    public ClickOn(Target button){
        this.button = button;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(button));
    }

    public static ClickOn the(Target button){
        return Tasks.instrumented(ClickOn.class, button);
    }
}
