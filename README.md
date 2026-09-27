# WMS y TMS para e-Commerce

Repositorio del Trabajo Practico Integrador de Ingenieria y Calidad de Software.

El proyecto usa una aplicacion Java de consola, muy simple, para practicar control de versiones con Git, GitHub y GitFlow.

## Funcionalidad

La aplicacion muestra un pequeno inventario de productos y calcula el stock total disponible.

No incluye interfaz grafica, base de datos ni servicios web porque el objetivo principal del trabajo es practicar el flujo de ramas, Pull Requests, releases y hotfixes.

## Requisitos

- Java 17 o superior
- Maven

## Ejecutar pruebas

```bash
mvn test
```

## Ejecutar la aplicacion

```bash
mvn compile
java -cp target/classes ar.edu.icsw.wms.Main
```

## Estructura del proyecto

- `src/main/java`: codigo fuente de la aplicacion.
- `src/test/java`: pruebas automatizadas.
- `.github/CODEOWNERS`: responsables de revision del repositorio.
- `.github/workflows/ci.yml`: workflow de integracion continua.
