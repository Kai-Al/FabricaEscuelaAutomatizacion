package co.edu.udea.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.TV_CREATEUNIT_SENT;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.TV_UNITS_DELETE;


public class IsThereAnErrorDeletingAcademicUnit implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = actor.asksFor(Text.of(TV_UNITS_DELETE).asString());
        System.out.println(stringTemporal+"*******************************");
        return stringTemporal.contains("No se puede eliminar una unidad acad") &&
                stringTemporal.contains("mica que tiene subunidades acad") &&
                stringTemporal.contains("micas");
    }

    public static IsThereAnErrorDeletingAcademicUnit verify(){
        return new IsThereAnErrorDeletingAcademicUnit();
    }
}
