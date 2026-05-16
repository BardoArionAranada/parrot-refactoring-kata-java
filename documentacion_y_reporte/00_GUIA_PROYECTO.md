# Guia del proyecto

Este es el primer documento que conviene leer para entender de que trata la entrega.

## Que se nos pidio

En este taller se nos pidio trabajar el **Parrot Refactoring Kata**.
La idea principal no era agregar funciones nuevas, sino mejorar el diseno del codigo sin cambiar su comportamiento.

El problema inicial del proyecto era este:

- habia una clase `Parrot` con logica basada en `switch`
- la clase base conocia reglas de todos los tipos de loro
- habia datos que solo servian para una especie, pero vivian en el padre
- el enum `ParrotTypeEnum` existia solo para decidir comportamiento

En otras palabras, se nos pidio reemplazar esa logica por una solucion con **polimorfismo**.

## Como se trabajo

El trabajo se hizo de forma gradual, no de golpe.
La idea fue avanzar con pasos pequenos para no romper el sistema.

El proceso general fue este:

1. Leer el codigo legacy y los tests existentes.
2. Detectar los problemas del diseno original.
3. Crear documentacion del analisis y del plan.
4. Extraer las clases por tipo de loro una por una.
5. Ir quitando la logica centralizada del padre.
6. Simplificar la jerarquia final.
7. Revisar que la documentacion explicara bien el proceso completo.

## Como se fue haciendo poco a poco

Primero se entendio el problema del legacy.
Despues se identifico que habia dos `switch`, un enum usado como discriminador y atributos que no pertenecian a todas las especies.

Luego se hicieron micro-pasos:

- se extrajo `EuropeanParrot`
- se extrajo `AfricanParrot`
- se extrajo `NorwegianBlueParrot`
- se actualizaron los tests para usar las clases concretas
- `Parrot` paso de clase concreta a clase abstracta
- despues `Parrot` quedo como contrato comun
- se elimino `ParrotTypeEnum`
- se centralizaron las constantes compartidas en `ParrotRules`
- se limpiaron comentarios y documentos para que reflejaran el estado final real

Cada paso tuvo su propia bitacora para que el proceso no quedara escondido.

## Que no se hizo

Tambien es importante dejar claro lo que **no** era parte de esta entrega:

- no se agregaron nuevas funcionalidades
- no se cambiaron los resultados esperados de las pruebas
- no se reescribio el proyecto desde cero

El objetivo siempre fue refactorizar, no reinventar el sistema.

## Resultado final

Al terminar, el proyecto quedo mas claro:

- cada especie tiene su propio comportamiento
- la logica ya no depende de `switch`
- los datos quedaron donde realmente corresponden
- el codigo expresa mejor la idea de polimorfismo

## Como validar que todo quedo bien

La validacion tecnica se hizo ejecutando:

```powershell
.\gradlew.bat test
```

En esta maquina, la ruta mas confiable para correrlo fue:

```powershell
cd "D:\ParrotJavaTest"
.\gradlew.bat test
```

Si las pruebas pasan en verde, significa que el comportamiento esperado del kata se conservo mientras mejoraba el diseno.
