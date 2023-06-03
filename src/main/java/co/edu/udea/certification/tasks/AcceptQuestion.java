package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ClickOn;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.BUTTON_ACCEPT_FEATURES;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.CHECKBOX_YES;

public class AcceptQuestion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.the(CHECKBOX_YES));
    }
    public static AcceptQuestion Browser(PageObject page){
        return Tasks.instrumented(AcceptQuestion.class, page);
    }
}
