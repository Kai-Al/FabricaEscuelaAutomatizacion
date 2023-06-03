package co.edu.udea.certification.interactions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;

public class ConsumerLoansPage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_KNOW_MORE_CREDIT_ZONE));
    }

    public static ConsumerLoansPage go(){
        return Tasks.instrumented(ConsumerLoansPage.class);
    }
}
