package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ConsumerLoansPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheConsumerLoansPage implements Task {
    private final PageObject page;

    public OpenTheConsumerLoansPage(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(ConsumerLoansPage.go());
    }

    public static OpenTheConsumerLoansPage Browser(PageObject page){
        return Tasks.instrumented(OpenTheConsumerLoansPage.class, page);
    }
}
