# Bitácora del micro-paso 5

En este paso convertimos `Parrot` en una clase base abstracta.

## Qué se hizo

- Se quitó la decisión central basada en `switch` de la clase padre.
- Se dejó a cada subclase como responsable de su propio comportamiento.
- Se conservó el estado heredado solo como transición temporal mientras termina el refactor.

## Por qué este paso importa

Este cambio mueve el diseño hacia una jerarquía más clara:

- `EuropeanParrot` decide su propio `getSpeed()` y `getCry()`
- `AfricanParrot` decide su propio `getSpeed()` y `getCry()`
- `NorwegianBlueParrot` decide su propio `getSpeed()` y `getCry()`

Con esto, la clase base deja de cargar con toda la lógica y el código se vuelve más fácil de leer y mantener.

## Validación

La siguiente revisión debe confirmar que las pruebas siguen en verde después de este cambio.
