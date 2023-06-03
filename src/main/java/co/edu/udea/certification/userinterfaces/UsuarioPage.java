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
    public static final Target INPUT_UNITS_SEARCH = Target.the("Input Buscar unidad").locatedBy("/html/body/div[1]/main/form/div/input");
    public static final Target BUTTON_UNITS_SEARCH = Target.the("Button Buscar unidad").locatedBy("/html/body/div[1]/main/form/button");
    public static final Target OPTION_UNITS_ENGINEERING_FACULTY = Target.the("Option Facultad de ingenieria").locatedBy("//*[@id=\"__next\"]/main/div/div");

    // UNITS/IDUNIT***************************************
    public static final Target BUTTON_UNITS_PENCIL = Target.the("Button pencil in the route /units/idunit").locatedBy("/html/body/div[1]/main/div[2]/button[2]");
    public static final Target OPTION_UNITS_ACADEMIC_SUBUNIT = Target.the("Option Department of computer science").locatedBy("//*[@id=\"__next\"]/main/section[2]/div/div");
    public static final Target BUTTON_UNITS_RECYCLEBIN = Target.the("Button Recycle bin in the route /units/idunit").locatedBy("/html/body/div[1]/main/div[2]/button[1]");
    public static final Target TV_UNITS_DELETE = Target.the("Text to validate No se puede eliminar una unidad académica que tiene subunidades académicas").locatedBy("//*[@id=\"swal2-html-container\"]");

    // UNITS/IDUNIT/EDIT-UNIT*****************************
    public static final Target BUTTON_UNITS_EDITUNIT_PLUS = Target.the("Button + in the route /units/idunit/edit-unit").locatedBy("/html/body/div[1]/main/form/fieldset[2]/div/div/button");

    //UNITS/IDUNIT/CREATE-SUBUNIT*************************
    public static final Target INPUT_UNITS_CREATESUBUNIT_SUBUNIT_ACADEMIC_NAME = Target.the("Input Nombre de la subunidad academica").locatedBy("//*[@id=\"nameAcademicSubUnit\"]");
    public static final Target INPUT_UNITS_CREATESUBUNIT_SUBUNIT_ACADEMIC_CODE = Target.the("Input Codigo de la subunidad academica").locatedBy("//*[@id=\"codeAcademicSubUnit\"]");
    public static final Target SELECT_UNITS_CREATESUBUNIT_ACADEMIC_SUBUNIT_TYPE = Target.the("Select Tipo de subunidad academica").locatedBy("//*[@id=\"typeAcademicSubUnit\"]");
    public static final Target OPTION_UNITS_CREATESUBUNIT_ACADEMIC_SUBUNIT_TYPE = Target.the("Option Tipo de subunidad academica").locatedBy("//*[@id=\"typeAcademicSubUnit\"]/option[2]");
    public static final Target INPUT_UNITS_CREATESUBUNIT_BOSS_NAME = Target.the("Input Nombre del jefe").locatedBy("//*[@id=\"headName\"]");
    public static final Target INPUT_UNITS_CREATESUBUNIT_DESCRIPTION = Target.the("Input Descripcion").locatedBy("//*[@id=\"description\"]");
    public static final Target BUTTON_UNITS_CREATESUBUNIT_SEND = Target.the("Input Chulito").locatedBy("/html/body/div[1]/main/form/div/button[1]");
    // TV: Text to validate
    public static final Target TV_UNITS_CREATESUBUNIT_SENT = Target.the("Text to validate Operacion exitosa").locatedBy("//*[@id=\"swal2-title\"]");

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

    // subunits/idsubnit/create-program
    public static final Target INPUT_SUBUNITS_CREATEPROGRAM_PROGRAM_ACADEMIC_NAME = Target.the("Input Nombre del programa academico").locatedBy("//*[@id=\"nameAcademicProgram\"]");
    public static final Target INPUT_SUBUNITS_CREATEPROGRAM_PROGRAM_ACADEMIC_CODE = Target.the("Input Codigo del programa academico").locatedBy("//*[@id=\"codeAcademicProgram\"]");
    public static final Target INPUT_SUBUNITS_CREATEPROGRAM_SNIES_CODE = Target.the("Input Codigo SNIES del programa academico").locatedBy("//*[@id=\"sniesCode\"]");
    public static final Target SELECT_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_TYPE = Target.the("Select Tipo de programa academico").locatedBy("//*[@id=\"typeAcademicProgram\"]");
    public static final Target OPTION_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_TYPE = Target.the("Option Tipo de programa academico").locatedBy("//*[@id=\"typeAcademicProgram\"]/option[4]");
    public static final Target SELECT_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_MODALIDAD = Target.the("Select Modalidad de programa academico").locatedBy("//*[@id=\"modalityAcademicProgram\"]");
    public static final Target OPTION_SUBUNITS_CREATEPROGRAM_ACADEMIC_PROGRAM_MODALIDAD = Target.the("Option Modalidad de programa academico").locatedBy("//*[@id=\"modalityAcademicProgram\"]/option[2]");
}
