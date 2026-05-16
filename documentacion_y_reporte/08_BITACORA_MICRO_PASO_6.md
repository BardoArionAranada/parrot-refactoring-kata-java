# Bitacora del micro-paso 6

En este paso limpiamos la clase base para quitar el estado heredado que ya no era necesario.

## Qué se hizo

- Se eliminaron los campos compartidos de `Parrot`.
- Se quitó el constructor que arrastraba la estructura antigua.
- Se simplificaron las subclases para que ya no dependan de ese puente temporal.
- Se eliminó `ParrotTypeEnum`, porque ya no había una decision central basada en tipo.

## Por qué este paso importa

La jerarquia ya no necesita que la clase base conozca detalles de cada especie.
Ahora cada clase concreta conserva solo lo que realmente usa:

- `EuropeanParrot` se queda con su comportamiento fijo.
- `AfricanParrot` conserva solo la cantidad de cocos.
- `NorwegianBlueParrot` conserva solo el voltaje y si esta clavado.

Con eso la base queda mucho mas limpia y el diseño se acerca a una jerarquia real de polimorfismo.

## Validacion

Este cambio debe seguir pasando la suite de pruebas sin modificar su comportamiento observable.
