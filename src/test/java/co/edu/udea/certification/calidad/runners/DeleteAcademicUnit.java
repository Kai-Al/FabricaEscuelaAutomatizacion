package co.edu.udea.certification.calidad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/delete_academic_unit.feature",
        glue = "co.edu.udea.certification.calidad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DeleteAcademicUnit {
}
