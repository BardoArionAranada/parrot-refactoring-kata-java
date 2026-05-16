# Bitacora del micro-paso 9

En este paso centralizamos las constantes compartidas del dominio.

## Qué se hizo

- Se creo `ParrotRules` como clase de utileria.
- Se movieron ahi los valores repetidos del kata.
- Las subclases dejaron de declarar sus propias copias de esos numeros.

## Por qué este paso importa

Aunque los valores ya tenian nombre, seguian repartidos entre varias clases.
Con una sola fuente de verdad, el codigo queda mas facil de cambiar y revisar.

## Validacion

Este paso no cambia el comportamiento, solo reduce duplicacion y hace mas visible la intencion de las reglas.
