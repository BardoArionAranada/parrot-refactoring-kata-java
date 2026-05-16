# Metricas y verificacion

Este archivo resume de forma corta el impacto de la refactorizacion.

## Antes

- La clase `Parrot` contenia 2 `switch`.
- La clase base guardaba 4 datos heredados: `type`, `numberOfCoconuts`, `voltage` e `isNailed`.
- `ParrotTypeEnum` era necesario para decidir el comportamiento.
- Los valores del dominio aparecian como numeros distribuidos en el codigo.

## Despues

- `Parrot` quedo como contrato comun sin `switch`.
- La clase base ya no guarda estado compartido.
- `ParrotTypeEnum` fue eliminado del diseno final.
- `ParrotRules` centraliza las constantes compartidas.
- Cada especie implementa su propio comportamiento.

## Resumen numerico

- `switch` eliminados: `2`
- campos movidos o eliminados del padre: `4`
- enum de tipos eliminado: `1`
- clases concretas finales: `3`
- escenarios de prueba conservados: `11`

## Verificacion tecnica

La validacion se hizo con:

```powershell
.\gradlew.bat test
```

La suite se mantuvo en verde durante el cierre del proyecto.

## Observacion final

La documentacion se enfoco en el proceso real realizado en el repositorio local. No se incluye comparativa con videos o soluciones externas, porque esta entrega se concentro en el trabajo aplicado sobre el codigo y su historial.
