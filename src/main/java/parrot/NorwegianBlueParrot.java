package parrot;

/**
 * Tercera subclase extraida.
 * Representa al loro noruego azul antes de mover la logica fuera de la clase base.
 */
public class NorwegianBlueParrot implements Parrot {
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        // Si esta clavado, no se mueve; si no, la velocidad depende del voltaje.
        return isNailed ? 0 : Math.min(ParrotRules.MAX_SPEED, voltage * ParrotRules.VOLTAGE_FACTOR);
    }

    @Override
    public String getCry() {
        // El voltaje decide si el loro habla o si se queda en silencio.
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
