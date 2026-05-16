package parrot;

/**
 * Primera subclase extraida.
 * Hace explicito el comportamiento europeo antes de quitar el switch heredado.
 */
public class EuropeanParrot implements Parrot {

    @Override
    public double getSpeed() {
        // El loro europeo siempre vuela a la velocidad base.
        return ParrotRules.BASE_SPEED;
    }

    @Override
    public String getCry() {
        // Grito fijo para esta especie.
        return "Sqoork!";
    }
}
