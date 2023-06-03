package co.edu.udea.certification.tasks;

import co.edu.udea.certification.interactions.ClickOn;
import co.edu.udea.certification.interactions.SelectDate;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.sql.SQLOutput;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;

public class setMyBirthDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectDate.go());
    }
    public static setMyBirthDate Browser(){
        return Tasks.instrumented(setMyBirthDate.class);
    }
}
