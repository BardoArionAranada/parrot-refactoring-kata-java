package parrot;

/**
 * Implementacion del loro europeo.
 * Su velocidad y su grito son siempre fijos.
 */
public final class EuropeanParrot implements Parrot {

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
