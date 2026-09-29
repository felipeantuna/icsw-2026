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

## Release 1.1.0

Versión que incorpora la consulta de disponibilidad de stock. El servicio permite determinar si un producto posee unidades disponibles y cuenta con pruebas automatizadas para los casos con stock y sin stock.

## Documentación con Git

Git permite documentar la evolución del proyecto mediante commits con mensajes claros, ramas, etiquetas de versión, Pull Requests, issues, releases y el historial de cambios.

El README explica el propósito del proyecto, requisitos, ejecución, pruebas y decisiones relevantes.

## Información requerida en un Pull Request externo

Una persona externa debería indicar el objetivo del cambio, la issue relacionada, los archivos o componentes modificados, las pruebas realizadas, el impacto esperado, los riesgos conocidos y evidencia visual cuando corresponda.GitHub ayuda mediante la descripción del Pull Request, comparación de cambios, comentarios, sugerencias de código, reviewers, checks de CI, historial, issues vinculadas y plantillas de Pull Request.
