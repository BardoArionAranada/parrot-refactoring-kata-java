# Bitacora del micro-paso 7

En este paso le pusimos nombre a los valores magicos que seguian vivos dentro de las subclases.

## Qué se hizo

- `EuropeanParrot` ahora usa una constante para su velocidad base.
- `AfricanParrot` ahora nombra la velocidad base y la penalizacion por cocos.
- `NorwegianBlueParrot` ahora nombra el limite maximo de velocidad y el factor del voltaje.

## Por qué este paso importa

Antes las reglas estaban escondidas en numeros sueltos dentro del codigo.
Ahora cada valor tiene un nombre que explica su intencion, por ejemplo:

- velocidad base
- penalizacion por cocos
- velocidad maxima
- factor de voltaje

## Validacion

Este cambio no altera el comportamiento del sistema, solo hace mas facil leer y mantener las reglas de cada loro.
