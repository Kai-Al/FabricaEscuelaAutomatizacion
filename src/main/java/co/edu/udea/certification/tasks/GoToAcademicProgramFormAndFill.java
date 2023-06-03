package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ClickOn;
import co.edu.udea.certification.interactions.SelectOption;
import co.edu.udea.certification.interactions.SetRandomValue;
import co.edu.udea.certification.interactions.SetValue;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;

public class GoToAcademicProgramFormAndFill implements Task {
    private final PageObject page;

    public GoToAcademicProgramFormAndFill(PageObject page){
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
        actor.attemptsTo(ClickOn.the(OPTION_UNITS_ACADEMIC_SUBUNIT));

        // Route: subunits/idsubnit
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_PENCIL));

        // Route: subunits/idsubnit/edit-subunit
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_EDITUNIT_PLUS));

        // Route: subunits/idsubunit/create-program
        actor.attemptsTo(new SetValue("Master in Data science and engineering", INPUT_SUBUNITS_CREATEPROGRAM_PROGRAM_ACADEMIC_NAME));
        actor.attemptsTo(new SetRandomValue(1, 99, INPUT_SUBUNITS_CREATEPROGRAM_PROGRAM_ACADEMIC_CODE));
        actor.attemptsTo(new SetRandomValue(1, 10000, INPUT_SUBUNITS_CREATEPROGRAM_SNIES_CODE));
        actor.attemptsTo(new SetValue(
                "At present several scientific and humanistic disciplines make strong " +
                        "use of digital data, mainly in order to analyse decision-making processes. " +
                        "Graduates in \"Data science and engineering\" play a key role in all these " +
                        "disciplines.",
                INPUT_UNITS_CREATESUBUNIT_DESCRIPTION));
        actor.attemptsTo(new SelectOption(SELECT_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_TYPE, OPTION_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_TYPE));
        actor.attemptsTo(new SelectOption(SELECT_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_MODALIDAD, OPTION_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_MODALIDAD));
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_CREATESUBUNIT_SEND));

    }

    public static GoToAcademicProgramFormAndFill solve(PageObject page){
        return Tasks.instrumented(GoToAcademicProgramFormAndFill.class, page);
    }
}
