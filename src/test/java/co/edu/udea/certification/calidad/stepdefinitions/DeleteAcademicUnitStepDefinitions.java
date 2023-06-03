package co.edu.udea.certification.calidad.stepdefinitions;

import co.edu.udea.certification.questions.IsSuccessfulOperation;
import co.edu.udea.certification.questions.IsThereAnErrorDeletingAcademicUnit;
import co.edu.udea.certification.tasks.GoToAcademicUnitFormAndFill;
import co.edu.udea.certification.tasks.TryToDeleteAcademicUnitWithAcademicSubunities;
import co.edu.udea.certification.tasks.TryToDeleteAcademicUnitWithoutAcademicSubunities;
import co.edu.udea.certification.userinterfaces.UsuarioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DeleteAcademicUnitStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    private Actor admin = Actor.named("LosSuperConocidos");

    @Given("I am in the home page of PLA 4")
    public void iAmInTheHomePage(){
        // We maximize the window
        driver.manage().window().maximize();

        // The investor can surf through the browser
        admin.can(BrowseTheWeb.with(driver));
    }

    // DELETE AN ACADEMIC UNIT WITH SUBUNITIES
    @When("I go to academic unit with subunits and I try to delete the academic unit")
    public void tryToDeleteAcademicUnitWithAcademicSubunities(){
        admin.attemptsTo(TryToDeleteAcademicUnitWithAcademicSubunities.solve(new UsuarioPage()));
    }

    @Then("I cannot delete the academy unit")
    public void deleteAcademicUnitWithAcademicSubunities(){
        //admin.should(seeThat(ISeeThreeOptionsForInvesting.verify(),equalTo(true)));
        admin.should(seeThat(IsThereAnErrorDeletingAcademicUnit.verify(),equalTo(true)));
    }

    // DELETE AN ACADEMIC UNIT WITHOUT SUBUNITIES
    @Given("I am in the home page of PLA 5")
    public void iAmInTheHomePage2(){
        // We maximize the window
        driver.manage().window().maximize();

        // The investor can surf through the browser
        admin.can(BrowseTheWeb.with(driver));
    }

    @When("I go to academic unit without subunits and I try to delete the academic unit")
    public void tryToDeleteAcademicUnitWithoutAcademicSubunities(){
        admin.attemptsTo(TryToDeleteAcademicUnitWithoutAcademicSubunities.solve(new UsuarioPage()));
    }

    @Then("I can delete the academy unit")
    public void deleteAcademicUnit(){
        //admin.should(seeThat(ISeeThreeOptionsForInvesting.verify(),equalTo(true)));
        admin.should(seeThat(IsThereAnErrorDeletingAcademicUnit.verify(),equalTo(true)));
    }
}
