package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ClickOn;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.BUTTON_CLOSE_INITIAL_OFFERS;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.BUTTON_SIMULATE_FREE_INVESTMENT_CREDIT;

public class OpenSimulatorFreeInvestmentCredit implements Task {
    private final PageObject page;

    public OpenSimulatorFreeInvestmentCredit(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.the(BUTTON_SIMULATE_FREE_INVESTMENT_CREDIT));
    }
    public static OpenSimulatorFreeInvestmentCredit Browser(PageObject page){
        return Tasks.instrumented(OpenSimulatorFreeInvestmentCredit.class, page);
    }
}
