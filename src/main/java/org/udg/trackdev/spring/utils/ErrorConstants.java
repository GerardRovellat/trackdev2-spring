package org.udg.trackdev.spring.utils;

/**
 * The type Error constants.
 */
public final class ErrorConstants {

    /**
     * The constant USER_MAIL_NOT_FOUND.
     */
    public static final String USER_MAIL_NOT_FOUND = "No existeix cap usuari amb aquest correu electrònic";
    /**
     * The constant USER_NOT_FOUND.
     */
    public static final String USER_NOT_FOUND = "L'usuari no existeix <%s>";
    /**
     * The constant USER_ALREADY_EXIST.
     */
    public static final String USER_ALREADY_EXIST = "L'usuari ja existeix";
    /**
     * The constant LOGIN_KO.
     */
    public static final String LOGIN_KO = "El correu electrònic o la contrasenya no són correctes";
    /**
     * The constant USER_DISABLED.
     */
    public static final String USER_DISABLED = "L'usuari no està habilitat, contacta amb l'administrador";
    /**
     * The constant REGISTER_KO.
     */
    public static final String REGISTER_KO = "Error al registrar l'usuari";
    /**
     * The constant RECOVERY_CODE_NOT_MATCH.
     */
    public static final String RECOVERY_CODE_NOT_MATCH = "El codi de recuperació no és correcte";
    /**
     * The constant USER_SHOULD_NOT_LOGEDIN.
     */
    public static final String USER_SHOULD_NOT_LOGEDIN = "El usuari no hauria d'estar autenticat";
    /**
     * The constant USER_NOT_LOGGED_IN.
     */
    public static final String USER_NOT_LOGGED_IN = "El usuari ha d'estar autenticat";
    /**
     * The constant UNKNOWN_ROLE.
     */
    public static final String UNKNOWN_ROLE = "Rol desconegut";
    /**
     * The constant INVALID_PRJ_NAME_LENGTH.
     */
    public static final String INVALID_PRJ_NAME_LENGTH = "El nom del projecte ha de tindre entre 1 i 50 caràcters";
    /**
     * The constant INVALID_COURSE_START_YEAR.
     */
    public static final String INVALID_COURSE_START_YEAR = "L'any seleccionat no és vàlid";

    /**
     * The constant INVALID_PRJ_QUALIFICATION.
     */
    public static final String INVALID_PRJ_QUALIFICATION = "La qualifiació ha de ser un valor entre 0 i 10";
    /**
     * The constant INVALID_SPRINT_NAME_LENGTH.
     */
    public static final String INVALID_SPRINT_NAME_LENGTH = "El nom del sprint ha de tindre entre 1 i 50 caràcters";
    /**
     * The constant INVALID_SUBJECT_NAME_LENGTH.
     */
    public static final String INVALID_SUBJECT_NAME_LENGTH = "El nom de l'assignatura ha de tindre entre 1 i 50 caràcters";
    /**
     * The constant INVALID_SUBJECT_ACRONYM_LENGTH.
     */
    public static final String INVALID_SUBJECT_ACRONYM_LENGTH = "El acronim de l'assignatura ha de tindre entre 3 i 5 caràcters";
    /**
     * The constant INVALID_TASK_NAME_LENGTH.
     */
    public static final String INVALID_TASK_NAME_LENGTH = "El nom de la tasca ha de tindre entre 1 i 100 caràcters";
    /**
     * The constant PASSWORD_MINIUM_LENGTH.
     */
    public static final String PASSWORD_MINIUM_LENGTH = "La contrasenya ha de tindre almenys 8 caracters";
    /**
     * The constant INVALID_MAIL_FORMAT.
     */
    public static final String INVALID_MAIL_FORMAT = "El correu electrònic no té un format vàlid";
    /**
     * The constant INVALID_MAIL_SIZE.
     */
    public static final String INVALID_MAIL_SIZE = "La longitud del correu electrònic no és vàlida";
    /**
     * The constant INVALID_USERNAME_SIZE.
     */
    public static final String INVALID_USERNAME_SIZE = "La longitud del nom d'usuari ha de tindre entre 1 i 50 caràcters";
    /**
     * The constant INVALID_USERNAME_FORMAT.
     */
    public static final String INVALID_USERNAME_FORMAT = "El nom d'usuari conte caràcters no vàlids";
    /**
     * The constant INVALID_PASSWORD_FORMAT.
     */
    public static final String INVALID_PASSWORD_FORMAT = "La contrasenya ha de contenir almenys una lletra minuscula, una majuscula i un numero";
    /**
     * The constant UNAUTHORIZED.
     */
    public static final String UNAUTHORIZED = "L'usuari no esta autoritzat a realitzar aquesta acció o veure aquest recurs";
    /**
     * The constant TASK_ALREADY_REVIEWED.
     */
    public static final String TASK_ALREADY_REVIEWED = "Aquest usuari ja ha revisat els punts d'aquesta tasca";
    /**
     * The constant PRJ_WITHOUT_MEMBERS.
     */
    public static final String PRJ_WITHOUT_MEMBERS = "El projecte ha de tindre almenys un membre";
    /**
     * The constant PRJ_WITHOUT_QUALIFICATION.
     */
    public static final String PRJ_WITHOUT_QUALIFICATION = "No es pot calcular la nota d'un projecte sense qualificació";
    /**
     * The constant SUBJECT_NOT_EXIST.
     */
    public static final String SUBJECT_NOT_EXIST = "L'assignatura no existeix";
    /**
     * The constant USER_NOT_PRJ_MEMBER.
     */
    public static final String USER_NOT_PRJ_MEMBER = "L'usuari no és membre del projecte";
    /**
     * The constant CAN_NOT_BE_NULL.
     */
    public static final String CAN_NOT_BE_NULL = "Hi ha un camp a NULL que no pot ser-ho";
    /**
     * The constant ENTITY_NOT_EXIST.
     */
    public static final String ENTITY_NOT_EXIST = "L'entitat no existeix";
    /**
     * The constant GITHUB_TOKEN_INVALID.
     */
    public static final String GITHUB_TOKEN_INVALID = "ERROR: Token invalid";
    /**
     * The constant API_GITHUB_KO.
     */
    public static final String API_GITHUB_KO = "ERROR: L'API de Github no funciona";
    /**
     * The constant EMPTY.
     */
    public static final String EMPTY = "";
}
