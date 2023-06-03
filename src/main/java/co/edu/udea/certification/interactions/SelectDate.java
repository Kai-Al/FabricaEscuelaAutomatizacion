package co.edu.udea.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.INPUT_BIRTH_DATE_DAY;

public class SelectDate implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.the(INPUT_BIRTH_DATE));
        actor.attemptsTo(ClickOn.the(INPUT_BIRTH_DATE_YEAR));
        actor.attemptsTo(ClickOn.the(INPUT_BIRTH_DATE_MONTH));
        actor.attemptsTo(ClickOn.the(INPUT_BIRTH_DATE_DAY));
    }

    public static SelectDate go(){
        return Tasks.instrumented(SelectDate.class);
    }
}
