# Guia del proyecto

## Que es este kata
Parrot Refactoring Kata es un ejercicio para practicar refactorizacion segura. La idea no es cambiar el comportamiento, sino mejorar el diseno del codigo paso a paso.

## Objetivo principal
Reemplazar la logica basada en `switch` por una jerarquia de clases con polimorfismo.

## Alcance del ejercicio
- No se agregan funcionalidades nuevas.
- No se cambian los valores esperados por las pruebas.
- La suite existente se usa como red de seguridad desde el inicio.

## Como se trabajo
1. Entender el codigo legacy y los tests existentes.
2. Identificar olores de codigo y responsabilidades mezcladas.
3. Hacer micro-cambios pequenos.
4. Ejecutar los tests despues de cada cambio relevante.
5. Dejar bitacora y commits claros de cada avance.

## Nota de entorno
En Windows, este proyecto corre mejor desde una ruta sin caracteres especiales. La verificacion tecnica se confirmo con:

```powershell
.\gradlew.bat test
```
