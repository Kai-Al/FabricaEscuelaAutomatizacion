package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ClickOn;
import co.edu.udea.certification.interactions.SetValue;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;

public class TryToDeleteAcademicUnitWithoutAcademicSubunities implements Task {
    private final PageObject page;

    public TryToDeleteAcademicUnitWithoutAcademicSubunities(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        // Route: Home page
        actor.attemptsTo(ClickOn.the(BUTTON_HOMEPAGE_CONECTAR));

        // Route: units
        actor.attemptsTo(new SetValue("Faculty of Engineering", INPUT_UNITS_SEARCH));
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_SEARCH));
        actor.attemptsTo(ClickOn.the(OPTION_UNITS_ENGINEERING_FACULTY));

        // Route: units/idUnit
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_RECYCLEBIN));
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_CONFIRM_DELETE));

    }

    public static TryToDeleteAcademicUnitWithoutAcademicSubunities solve(PageObject page){
        return Tasks.instrumented(TryToDeleteAcademicUnitWithoutAcademicSubunities.class, page);
    }
}
