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
import static co.edu.udea.certification.userinterfaces.UsuarioPage.INPUT_UNITS_CREATESUBUNIT_SUBUNIT_ACADEMIC_CODE;

public class GoToAcademicSubunitFormAndFill implements Task {
    private final PageObject page;

    public GoToAcademicSubunitFormAndFill(PageObject page){
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
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_PENCIL));

        // Route: units/idUnit/edit-unit
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_EDITUNIT_PLUS));

        // Route: units/idUnit/create-subunit
        actor.attemptsTo(new SetValue("Department of Computer Science", INPUT_UNITS_CREATESUBUNIT_SUBUNIT_ACADEMIC_NAME));
        actor.attemptsTo(new SetRandomValue(1, 99, INPUT_UNITS_CREATESUBUNIT_SUBUNIT_ACADEMIC_CODE));
        actor.attemptsTo(new SelectOption(SELECT_UNITS_CREATESUBUNIT_ACADEMIC_SUBUNIT_TYPE, OPTION_UNITS_CREATESUBUNIT_ACADEMIC_SUBUNIT_TYPE));
        actor.attemptsTo(new SetValue("Diego Botia", INPUT_UNITS_CREATESUBUNIT_BOSS_NAME));
        actor.attemptsTo(new SetValue(
                "The computer science department advances the role of computing in our lives " +
                        "through research and prepares the next generation of computer scientists " +
                        "with its academic programs.",
                INPUT_UNITS_CREATESUBUNIT_DESCRIPTION));
        actor.attemptsTo(ClickOn.the(BUTTON_UNITS_CREATESUBUNIT_SEND));

        // Route: create-unit
        /*actor.attemptsTo(new SetValue("Faculty of Engineering", INPUT_CREATEUNIT_UNIT_ACADEMIC_NAME));
        actor.attemptsTo(new SetRandomValue(1, 99, INPUT_CREATEUNIT_UNIT_ACADEMIC_CODE));
        actor.attemptsTo(new SelectOption(SELECT_CREATEUNIT_ACADEMIC_UNIT_TYPE, OPTION_CREATEUNIT_ACADEMIC_UNIT_TYPE));
        actor.attemptsTo(new SetValue("Lossuperconocidos Calidad", INPUT_CREATEUNIT_DEANS_NAME));
        actor.attemptsTo(new SetValue(
                "We're educating tomorrow's leaders, pioneering " +
                        "research that's creating a digital, sustainable " +
                        "and healthier future, and forging strong collaborations " +
                        "with industry.",
                INPUT_CREATEUNIT_DESCRIPTION));
        actor.attemptsTo(new SetValue(
                "Medellin",
                INPUT_CREATEUNIT_LOCATION));
        actor.attemptsTo(new SetValue(
                "https://pla-udea-front.vercel.app/",
                INPUT_CREATEUNIT_URL));
        actor.attemptsTo(new SetRandomValue(
                10000000,
                1000000000,
                INPUT_CREATEUNIT_COSTS_CENTER));
        actor.attemptsTo(ClickOn.the(BUTTON_CREATEUNIT_SEND));*/
    }

    public static GoToAcademicSubunitFormAndFill solve(PageObject page){
        return Tasks.instrumented(GoToAcademicSubunitFormAndFill.class, page);
    }
}
