package parrot;

/**
 * Clase base abstracta para la jerarquia de loros.
 * La idea es conservar el punto comun mientras cada subclase define su propio comportamiento.
 */
public abstract class Parrot {

    public abstract double getSpeed();

    public abstract String getCry();
}
