package parrot;

/**
 * Primera subclase extraida.
 * Hace explicito el comportamiento europeo antes de quitar el switch heredado.
 */
public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
        super(ParrotTypeEnum.EUROPEAN, 0, 0, false);
    }

    @Override
    public double getSpeed() {
        // El loro europeo siempre vuela a la velocidad base.
        return 12.0;
    }

    @Override
    public String getCry() {
        // Grito fijo para esta especie.
        return "Sqoork!";
    }
}
