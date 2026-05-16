package parrot;

/**
 * Constantes compartidas por las reglas del kata.
 * Centralizar estos valores evita duplicar numeros magicos en las especies concretas.
 */
final class ParrotRules {

    // Velocidad base compartida por las especies que vuelan.
    static final double BASE_SPEED = 12.0;
    // Penalizacion aplicada por cada coco en el loro africano.
    static final double COCONUT_PENALTY = 9.0;
    // Limite superior de velocidad para el loro noruego azul.
    static final double MAX_SPEED = 24.0;
    // Factor que convierte voltaje en velocidad para el loro noruego azul.
    static final double VOLTAGE_FACTOR = 12.0;

    private ParrotRules() {
        // Clase de utileria: no debe instanciarse.
    }
}
