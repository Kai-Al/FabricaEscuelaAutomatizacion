package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.SetRandomValue;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.INPUT_AMOUNT_TO_SIMULATE;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.INPUT_MONTHS_TO_SIMULATE;

public class setMonthsToBeSimulated implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(SetRandomValue.go());

        actor.attemptsTo(new SetRandomValue(48,84, INPUT_MONTHS_TO_SIMULATE));
    }

    public static setMonthsToBeSimulated Browser(PageObject page){
        return Tasks.instrumented(setMonthsToBeSimulated.class, page);
    }
}
