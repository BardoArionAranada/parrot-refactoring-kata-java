# Analisis del codigo legacy

## Archivo principal
El comportamiento actual esta concentrado en `src/main/java/parrot/Parrot.java`.

## Olores de codigo detectados
- `switch` por tipo en `getSpeed()` y `getCry()`.
- Una clase base con datos que solo usa una subclase.
- `ParrotTypeEnum` existe solo para discriminar comportamiento.
- Constructor generico con parametros que no aplican a todos los tipos.
- Tests que instancian la clase base directamente con datos especificos por tipo.

## Que hace cada tipo de loro
- `EUROPEAN`: velocidad base y grito fijo.
- `AFRICAN`: velocidad base menos un factor por coco; grito fijo.
- `NORWEGIAN_BLUE`: si esta clavado, velocidad cero; si no, velocidad segun voltaje. El grito depende del voltaje.

## Problema principal
La clase `Parrot` sabe demasiado. Tiene que decidir el comportamiento de todos los tipos y tambien almacenar datos que no pertenecen a todos.

## Riesgo si se agrega un nuevo tipo
Cada nuevo loro obligaria a tocar la misma clase base en mas de un lugar. Eso aumenta el riesgo de romper casos existentes.

