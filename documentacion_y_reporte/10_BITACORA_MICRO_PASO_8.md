# Bitacora del micro-paso 8

En este paso convertimos `Parrot` en una interfaz.

## Qué se hizo

- Se elimino la clase base abstracta vacia.
- Se dejo solo el contrato comun con `getSpeed()` y `getCry()`.
- Las subclases ahora implementan directamente el contrato.

## Por qué este paso importa

Cuando una clase base ya no comparte estado ni comportamiento, mantenerla como clase abstracta solo agrega ruido.
Al moverla a interfaz, el diseño queda mas directo:

- `EuropeanParrot` implementa el contrato
- `AfricanParrot` implementa el contrato
- `NorwegianBlueParrot` implementa el contrato

## Validacion

Este cambio no modifica las reglas del comportamiento, solo simplifica la estructura general del proyecto.
