package parrot;

/**
 * Clase base abstracta para la jerarquia de loros.
 * La idea es conservar el punto comun mientras cada subclase define su propio comportamiento.
 */
public abstract class Parrot {

    // Estado heredado que todavia acompana la transicion del diseño antiguo al nuevo.
    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    // Constructor protegido: solo las subclases deben inicializar esta base abstracta.
    protected Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    public abstract String getCry();
}
