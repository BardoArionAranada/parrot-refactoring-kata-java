package parrot;

/**
 * Contrato comun para cualquier loro del kata.
 * Cada implementacion concreta define su propia velocidad y su propio grito.
 */
public interface Parrot {

    double getSpeed();

    String getCry();
}
