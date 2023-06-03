package co.edu.udea.certification.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    // AUTOMATION EXERCISE FOR FABRICA ESCUELA

    // HOME PAGE******************************************
    public static final Target BUTTON_HOMEPAGE_CONECTAR = Target.the("Button conectar in the homepage").locatedBy("/html/body/div[1]/main/div/button");

    // UNITS**********************************************
    public static final Target BUTTON_UNITS_PLUS = Target.the("Button + in the route /units").locatedBy("/html/body/div[1]/main/div/button");

    // CREATE_UNIT****************************************
    public static final Target INPUT_CREATEUNIT_UNIT_ACADEMIC_NAME = Target.the("Input Nombre de la unidad academica").locatedBy("//*[@id=\"nameAcademicUnit\"]");
    public static final Target INPUT_CREATEUNIT_UNIT_ACADEMIC_CODE = Target.the("Input Codigo de la unidad academica").locatedBy("//*[@id=\"codeAcademicUnit\"]");
    public static final Target SELECT_CREATEUNIT_ACADEMIC_UNIT_TYPE = Target.the("Select Tipo de unidad academica").locatedBy("//*[@id=\"typeAcademicUnit\"]");
    public static final Target OPTION_CREATEUNIT_ACADEMIC_UNIT_TYPE = Target.the("Option Tipo de unidad academica").locatedBy("//*[@id=\"typeAcademicUnit\"]/option[2]");
    public static final Target INPUT_CREATEUNIT_DEANS_NAME = Target.the("Input Nombre del decano").locatedBy("//*[@id=\"deanName\"]");
    public static final Target INPUT_CREATEUNIT_DESCRIPTION = Target.the("Input Descripcion").locatedBy("//*[@id=\"description\"]");
    public static final Target INPUT_CREATEUNIT_LOCATION = Target.the("Input Ubicacion").locatedBy("//*[@id=\"ubicationAcademicUnit\"]");
    public static final Target INPUT_CREATEUNIT_URL = Target.the("Input Enlace de acuerdo de creacion").locatedBy("//*[@id=\"urlCreationAcademicUnit\"]");
    public static final Target INPUT_CREATEUNIT_COSTS_CENTER = Target.the("Input Centro de costos").locatedBy("//*[@id=\"costCenterCode\"]");
    public static final Target BUTTON_CREATEUNIT_SEND = Target.the("Input Chulito").locatedBy("//*[@id=\"__next\"]/main/form/div/button[1]");
    // TV: Text to validate
    public static final Target TV_CREATEUNIT_SENT = Target.the("Text to validate Operacion exitosa").locatedBy("//*[@id=\"swal2-title\"]");






    // AUTOMATION EXERCISE WITH BANCOLOMBIA PERSONAS
    public static final Target BUTTON_CLOSE_INITIAL_OFFERS = Target.the("Close initial offers").locatedBy("//*[@id=\"closeModalBtn\"]/span");
    public static final Target LINK_KNOW_MORE_CREDIT_ZONE = Target.the("Link know more credit zone").locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target TEXT_VALIDATION_I_AM_IN_CONSUMER_LOANS_PAGE =Target.the("Text in consumer loans page").locatedBy("//*[@id=\"dy-wcm-btti-ac2cf362\"]/div/div/div/div/div[1]/div/h1");
    public static final Target BUTTON_SIMULATE_FREE_INVESTMENT_CREDIT = Target.the("Simulate button").locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[4]/div/div[2]/div/a[1]");
    public static final Target BUTTON_ACCEPT_FEATURES = Target.the("Continue").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target CHECKBOX_YES = Target.the("Yes").locatedBy("//*[@id=\"opcion-si\"]/label");
    public static final Target INPUT_AMOUNT_TO_SIMULATE = Target.the("Amount to simulate").locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target INPUT_MONTHS_TO_SIMULATE = Target.the("Months to simulate").locatedBy("//*[@id=\"valor-plazo\"]");
    public static final Target INPUT_BIRTH_DATE = Target.the("Input for enter the birthdate").locatedBy("//*[@id=\"campo-fecha\"]");
    public static final Target INPUT_BIRTH_DATE_YEAR = Target.the("Year 2000").locatedBy("//td[@aria-label='2000']");
    public static final Target INPUT_BIRTH_DATE_MONTH = Target.the("Month January").locatedBy("//td[@aria-label='enero de 2000']");
    public static final Target INPUT_BIRTH_DATE_DAY= Target.the("Day 23").locatedBy("//td[@aria-label='23 de enero de 2000']");
    public static final Target BUTTON_SIMULATE = Target.the("Simulate").locatedBy("//*[@id=\"boton-simular\"]");
    public static final Target TEXT_VALIDATION = Target.the("Te ofrecemos estas opciones").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");
}
