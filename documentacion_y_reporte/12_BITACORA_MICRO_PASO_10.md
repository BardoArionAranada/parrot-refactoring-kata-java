# Bitacora del micro-paso 10

En este paso cerramos la jerarquia de clases concretas.

## Qué se hizo

- `EuropeanParrot` paso a ser `final`.
- `AfricanParrot` paso a ser `final`.
- `NorwegianBlueParrot` paso a ser `final`.

## Por qué este paso importa

Las especies ya no deben usarse como base para crear nuevas subclases dentro de este kata.
Al marcarlas como `final`, el codigo deja clara su intencion y evita extensiones accidentales.

## Validacion

Este paso no cambia ninguna regla del comportamiento; solo refuerza la estructura del diseño.
