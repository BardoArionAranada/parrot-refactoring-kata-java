package parrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas de caracterizacion del comportamiento heredado actual.
 * Estas pruebas sirven como red de seguridad mientras el refactor mueve reglas a subclases.
 */
class ParrotTest {

    @Test
    void getSpeedOfEuropeanParrot() {
        // El loro europeo siempre debe volar a la velocidad base.
        Parrot parrot = new EuropeanParrot();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedOfAfricanParrot_With_One_Coconut() {
        // Un coco reduce la velocidad del loro africano.
        Parrot parrot = new AfricanParrot(1);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        // Dos cocos son suficientes para dejar la velocidad en cero.
        Parrot parrot = new AfricanParrot(2);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedOfAfricanParrot_With_No_Coconuts() {
        // Sin cocos, el loro africano conserva la velocidad base.
        Parrot parrot = new AfricanParrot(0);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedNorwegianBlueParrot_nailed() {
        // Un loro noruego clavado no puede moverse.
        Parrot parrot = new NorwegianBlueParrot(1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedNorwegianBlueParrot_not_nailed() {
        // El voltaje aumenta la velocidad cuando el loro no esta clavado.
        Parrot parrot = new NorwegianBlueParrot(1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        // La velocidad basada en voltaje tiene un tope maximo.
        Parrot parrot = new NorwegianBlueParrot(4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }

    @Test
    void getCryOfEuropeanParrot() {
        // El loro europeo tiene un grito fijo.
        Parrot parrot = new EuropeanParrot();
        assertEquals("Sqoork!", parrot.getCry());
    }

    @Test
    void getCryOfAfricanParrot() {
        // El loro africano tambien tiene un grito fijo.
        Parrot parrot = new AfricanParrot(1);
        assertEquals("Sqaark!", parrot.getCry());
    }

    @Test
    void getCryOfNorwegianBlueHighVoltage() {
        // El voltaje convierte el grito del loro noruego en zumbido.
        Parrot parrot = new NorwegianBlueParrot(4, false);
        assertEquals("Bzzzzzz", parrot.getCry());
    }

    @Test
    void getCryOfNorwegianBlueNoVoltage() {
        // Sin voltaje, el grito cae al silencio.
        Parrot parrot = new NorwegianBlueParrot(0, false);
        assertEquals("...", parrot.getCry());
    }
}
