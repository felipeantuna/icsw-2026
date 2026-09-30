# WMS y TMS para e-Commerce

Trabajo Práctico Integrador de Ingeniería y Calidad de Software. El repositorio contiene una aplicación Java de consola para practicar gestión de configuración con Git, GitHub y GitFlow.

## Integrantes

- Felipe Antuna
- Jeremías Beltramino
- Stefano Dellaferrera
- Luciano Marchese

## Aplicación

La aplicación administra un inventario simplificado de productos: calcula el stock total y consulta si un producto tiene unidades disponibles. No incluye interfaz gráfica, base de datos ni servicios web porque el objetivo principal es practicar ramas, Pull Requests, releases, hotfixes y reversión de cambios.

### Requisitos y ejecución

- Java 17 o superior.
- Maven.

```bash
mvn test
mvn compile
java -cp target/classes ar.edu.icsw.wms.Main
```

## Resolución de la consigna

### 1. Repositorio y accesos

Se creó el repositorio `felipeantuna/icsw-2026` con `main` como rama productiva y `develop` como rama de integración. El repositorio es accesible para su lectura; los docentes deben recibir además el enlace del informe de Drive con permiso de comentarios.

### 2. Responsables de revisión

`.github/CODEOWNERS` asigna a todo el equipo como responsable general y define responsables específicos para archivos Markdown, configuración de GitHub y código Java. Esto permite solicitar automáticamente las revisiones correspondientes según los archivos modificados.

### 3. Integración continua

`.github/workflows/ci.yml` se ejecuta en cada Pull Request y en cada push a `main` o `develop`. Configura Java 21, valida los archivos básicos y ejecuta las pruebas con Maven —o Gradle, si existiera— para detectar errores antes de integrar cambios.

### 4. Ramas, Pull Requests y participación

Se publicaron ramas `feature`, `release` y `hotfix` con `git push -u origin <rama>`. Los PR #1 al #9 registran revisiones, comentarios, rechazos e integraciones. Hubo merges desde GitHub y también por comandos: el commit `5eeced6` integró `feature/software-base-java` en `develop`. Los cuatro integrantes participaron en el historial; Stefano implementó y revirtió cambios en `feature/consulta-stock`.

### 5. Software y publicación de cambios

El proyecto Maven contiene el modelo `Producto`, el servicio `InventarioService`, una clase principal y pruebas JUnit. El software base se publicó en `feature/software-base-java` mediante el commit `0a06c9b` y luego se integró en `develop`.

### 6. Configuraciones locales

`.gitignore` excluye compilaciones (`target/`, `build/`, `out/`), archivos de IDE, archivos del sistema operativo, secretos y configuraciones locales. Si un archivo ya estuviera versionado, debe retirarse del índice con `git rm --cached <archivo>`.

### 7. Release 1 y producción

La rama `release/1.0.0`, creada desde `develop`, fijó la versión 1.0.0 y consolidó la documentación. La PR #2 la integró en `main`, que representa producción, y la PR #3 sincronizó luego `main` con `develop`.

### 8. Corrección productiva

El error productivo se corrigió en `hotfix/correccion-producto`, creada desde `main`. La PR #4 se cerró al detectar un versionado incorrecto; después de corregirlo, la PR #5 publicó la versión 1.0.1 en `main` y la PR #6 propagó el arreglo a `develop`.

### 9. Nueva funcionalidad y reversión

En `feature/consulta-stock` se publicó la modificación A (`474155b`), que agregó la consulta de disponibilidad. Luego se publicó la modificación B (`7eb199c`), que añadía un conteo de productos, y se deshizo con `git revert` en `db4696b`. El `revert` preservó el historial compartido y devolvió funcionalmente la rama al estado de A.

### 10. Nueva funcionalidad en producción

La PR #7 integró `feature/consulta-stock` en `develop`. Después se creó `release/1.1.0`, la PR #8 la llevó a `main` y la PR #9 sincronizó nuevamente `main` con `develop`. La versión actual del proyecto es 1.1.0.

### 11. Documentación con Git

Git documenta la evolución mediante commits, ramas, etiquetas, Pull Requests e historial de cambios. GitHub agrega issues, revisiones, comentarios, checks y releases. El README conserva junto al código el propósito, los requisitos, la ejecución y las decisiones relevantes del proyecto.

### 12. Información requerida en un Pull Request externo

Una contribución externa debería incluir:

- **Objetivo e issue relacionada:** explican la necesidad y mantienen la trazabilidad.
- **Solución y componentes afectados:** permiten comprender el enfoque y estimar el alcance.
- **Pruebas, resultados e instrucciones de validación:** permiten reproducir la verificación y detectar regresiones.
- **Impacto, riesgos y limitaciones:** ayudan a decidir si el cambio puede integrarse con seguridad.
- **Evidencia visual, cuando corresponda:** facilita revisar cambios observables.

GitHub ayuda con plantillas de PR, comparación de archivos y commits, comentarios por línea, sugerencias de código, reviewers y CODEOWNERS, checks de CI, reglas de protección, issues vinculadas e historial de aprobaciones. Estas herramientas conservan el contexto y aportan evidencia antes del merge.

## Estructura

- `src/main/java`: código de producción.
- `src/test/java`: pruebas automatizadas.
- `.github/CODEOWNERS`: responsables de revisión.
- `.github/workflows/ci.yml`: integración continua.
- `pom.xml`: configuración Maven y versión del proyecto.
