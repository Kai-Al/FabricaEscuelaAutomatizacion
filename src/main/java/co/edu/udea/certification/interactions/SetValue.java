package co.edu.udea.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.Random;


import net.serenitybdd.screenplay.targets.Target;

public class SetValue implements Interaction{
    private final String value;
    private final Target inputTarget;

    public SetValue(String value, Target inputTarget){
        this.value = value;
        this.inputTarget = inputTarget;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(value).into(inputTarget));
    }

    public static SetValue set(){
        return Tasks.instrumented(SetValue.class);
    }
}
