package co.edu.udea.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.INPUT_BIRTH_DATE_DAY;

public class SelectOption implements Interaction{
    private final Target select;
    private final Target option;

    public SelectOption(Target select, Target option){
        this.select = select;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.the(select));
        actor.attemptsTo(ClickOn.the(option));
    }
    public static SelectOption select(){
        return Tasks.instrumented(SelectOption.class);
    }
}
