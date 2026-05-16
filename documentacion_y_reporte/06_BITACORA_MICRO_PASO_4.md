# Bitacora del micro-paso 4

## Que se hizo
Los tests se actualizaron para usar las subclases concretas en lugar de instanciar `Parrot` directamente.

## Decision tomada
El objetivo fue empezar a consumir el nuevo diseno sin cambiar aun la clase base heredada.

## Resultado esperado
La suite debe seguir en verde porque cada subclase ya conoce su propio comportamiento.

## Siguiente paso
Hacer `Parrot` abstracta y mover el contrato del comportamiento a las subclases.

