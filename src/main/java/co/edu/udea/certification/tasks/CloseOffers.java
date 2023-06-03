package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ClickOn;
import co.edu.udea.certification.interactions.ConsumerLoansPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.BUTTON_CLOSE_INITIAL_OFFERS;

public class CloseOffers implements Task {
    private final PageObject page;

    public CloseOffers(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(ClickOn.the(BUTTON_CLOSE_INITIAL_OFFERS));
    }

    public static CloseOffers Browser(PageObject page){
        return Tasks.instrumented(CloseOffers.class, page);
    }
}
