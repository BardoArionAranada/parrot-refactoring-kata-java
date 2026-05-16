package parrot;

/**
 * Clase heredada que todavia decide el comportamiento segun el tipo.
 * El refactor movera cada regla a su propia subclase.
 */
public class Parrot {

    // Estado heredado compartido: cada campo solo le importa a un tipo por ahora.
    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    // Conservamos este constructor mientras los tests sigan creando esta clase directamente.
    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        // Cada rama representa la regla de velocidad de un tipo de loro.
        return switch (type) {
            case EUROPEAN -> getBaseSpeed(); // El loro europeo siempre vuela a la velocidad base.
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts); // Mas cocos, menos velocidad.
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage); // Si esta clavado, no se mueve.
        };
    }

    private double getBaseSpeed(double voltage) {
        // El voltaje aumenta la velocidad, pero nunca supera el limite configurado.
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        // Penalizacion por cocos usada solo por la rama del loro africano.
        return 9.0;
    }

    private double getBaseSpeed() {
        // Velocidad base comun para todas las ramas.
        return 12.0;
    }

    public String getCry() {
        // El grito tambien depende del tipo, asi que conserva el mismo olor heredado.
        return switch (type) {
            case EUROPEAN -> "Sqoork!"; // El loro europeo tiene un grito fijo.
            case AFRICAN -> "Sqaark!"; // El loro africano tiene un grito fijo.
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "..."; // El voltaje decide si habla o no.
        };
    }
}
