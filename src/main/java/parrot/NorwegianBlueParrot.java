package parrot;

/**
 * Implementacion del loro noruego azul.
 * Su velocidad depende del voltaje y de si esta clavado.
 */
public final class NorwegianBlueParrot implements Parrot {
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        // Un loro clavado no se mueve; en caso contrario, el voltaje define la velocidad.
        return isNailed ? 0 : Math.min(ParrotRules.MAX_SPEED, voltage * ParrotRules.VOLTAGE_FACTOR);
    }

    @Override
    public String getCry() {
        // El voltaje decide si el loro emite un zumbido o silencio.
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
