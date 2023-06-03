package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.SetRandomValue;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.INPUT_AMOUNT_TO_SIMULATE;

public class setAmountToBeSimulated  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(SetRandomValue.go());

        actor.attemptsTo(new SetRandomValue(1000000,500000000, INPUT_AMOUNT_TO_SIMULATE));
    }

    public static setAmountToBeSimulated Browser(PageObject page){
        return Tasks.instrumented(setAmountToBeSimulated.class, page);
    }
}
