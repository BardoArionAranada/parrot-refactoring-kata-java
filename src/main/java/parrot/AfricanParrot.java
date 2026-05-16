package parrot;

/**
 * Primer corte del comportamiento africano como clase propia.
 * La logica aun refleja la regla heredada mientras seguimos el refactor por pasos pequenos.
 */
public class AfricanParrot extends Parrot {

    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        // La regla actual deja el calculo de velocidad africana facil de leer en un solo lugar.
        return Math.max(0, 12.0 - 9.0 * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        // El loro africano tiene un grito fijo.
        return "Sqaark!";
    }
}
