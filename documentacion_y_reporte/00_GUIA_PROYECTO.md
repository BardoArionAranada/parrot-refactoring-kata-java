# Guia del proyecto

## Que es este kata
Parrot Refactoring Kata es un ejercicio para practicar refactorizacion segura. La idea no es cambiar el comportamiento, sino mejorar el diseno del codigo paso a paso.

## Objetivo principal
Reemplazar la logica basada en `switch` por una jerarquia de clases con polimorfismo.

## Como se va a trabajar
1. Entender el codigo legacy y los tests existentes.
2. Identificar olores de codigo y responsabilidades mezcladas.
3. Hacer micro-cambios pequenos.
4. Ejecutar los tests despues de cada cambio.
5. Guardar cada avance con un commit claro.

## Nota de entorno
En Windows, este proyecto corre mejor desde una ruta sin caracteres especiales. Aqui ya se verifico con:

```powershell
.\gradlew.bat test
```

