package parrot;

/**
 * Primera subclase extraida.
 * Hace explicito el comportamiento europeo antes de quitar el switch heredado.
 */
public class EuropeanParrot extends Parrot {

    private static final double BASE_SPEED = 12.0;

    @Override
    public double getSpeed() {
        // El loro europeo siempre vuela a la velocidad base.
        return BASE_SPEED;
    }

    @Override
    public String getCry() {
        // Grito fijo para esta especie.
        return "Sqoork!";
    }
}
