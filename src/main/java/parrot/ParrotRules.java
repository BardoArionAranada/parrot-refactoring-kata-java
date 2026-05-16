package parrot;

/**
 * Constantes compartidas por las reglas del kata.
 * Centralizar estos valores evita duplicar numeros magicos en las especies concretas.
 */
final class ParrotRules {

    static final double BASE_SPEED = 12.0;
    static final double COCONUT_PENALTY = 9.0;
    static final double MAX_SPEED = 24.0;
    static final double VOLTAGE_FACTOR = 12.0;

    private ParrotRules() {
        // Clase de utileria: no debe instanciarse.
    }
}
