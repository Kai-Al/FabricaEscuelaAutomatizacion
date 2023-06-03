package co.edu.udea.certification.calidad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_new_academic_subunit.feature",
        glue = "co.edu.udea.certification.calidad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreateNewAcademicSubunit {
}
