# Plan de refactorizacion

## Orden sugerido
1. Extraer la primera subclase mas simple.
2. Extraer la subclase africana.
3. Extraer la subclase noruega.
4. Hacer `Parrot` abstracta.
5. Cambiar los tests para usar las subclases concretas.
6. Eliminar `ParrotTypeEnum` si ya no se usa.
7. Limpiar constantes y simplificar constructores.

## Regla del taller
Despues de cada micro-paso:
- cambio minimo
- correr tests
- confirmar verde
- commit

## Meta final
Que la clase base quede pequena y que cada comportamiento viva donde corresponde, sin `switch` por tipo.

