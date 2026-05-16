# Resumen de cierre

Este proyecto muestra una refactorizacion por pasos sobre el kata de Parrot.

## Estado actual

- `Parrot` quedo como contrato comun.
- `EuropeanParrot`, `AfricanParrot` y `NorwegianBlueParrot` son las implementaciones concretas.
- `ParrotRules` centraliza las constantes compartidas del dominio.
- La suite de pruebas sigue validando el comportamiento esperado.

## Lo que se logro

- Se elimino la logica basada en `switch`.
- Se separo el comportamiento por especie.
- Se nombro la intencion de los valores magicos.
- Se mantuvo toda la documentacion en español.

## Lectura rapida del proyecto

Quien abra esta carpeta puede revisar:

- `00_GUIA_PROYECTO.md` para entender el objetivo general.
- `01_ANALISIS_LEGACY.md` para ver el problema inicial.
- `02_PLAN_REFACTORIZACION.md` para seguir la ruta del refactor.
- `03` a `13` para ver la bitacora paso por paso.

## Verificacion

La validacion tecnica se realiza con Gradle en la copia limpia del proyecto, donde la suite pasa en verde.
