package parrot;

/**
 * Implementacion del loro africano.
 * Su velocidad depende de la cantidad de cocos que carga.
 */
public final class AfricanParrot implements Parrot {
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        // Cada coco reduce la velocidad segun la regla del kata.
        return Math.max(0, ParrotRules.BASE_SPEED - ParrotRules.COCONUT_PENALTY * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        // El loro africano siempre mantiene el mismo grito.
        return "Sqaark!";
    }
}
