package co.edu.udea.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.Random;

import net.serenitybdd.screenplay.targets.Target;

public class SetRandomValue implements Interaction {
    private final int minValue;
    private final int maxValue;
    private final Target input;

    public SetRandomValue(int minValue, int maxValue, Target input){
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.input = input;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        Random random = new Random();
        int randomInteger = random.nextInt(maxValue - minValue + 1) + minValue;

        actor.attemptsTo(Enter.theValue(String.valueOf(randomInteger)).into(input));
    }

    public static SetRandomValue go(){
        return Tasks.instrumented(SetRandomValue.class);
    }
}
