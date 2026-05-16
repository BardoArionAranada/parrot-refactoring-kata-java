package parrot;

/**
 * Tercera subclase extraida.
 * Representa al loro noruego azul antes de mover la logica fuera de la clase base.
 */
public class NorwegianBlueParrot extends Parrot {

    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE, 0, voltage, isNailed);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        // Si esta clavado, no se mueve; si no, la velocidad depende del voltaje.
        return isNailed ? 0 : Math.min(24.0, voltage * 12.0);
    }

    @Override
    public String getCry() {
        // El voltaje decide si el loro habla o si se queda en silencio.
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
