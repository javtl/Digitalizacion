# Documentación del Proyecto: Mod de Poción de Caída Suave

## 1. Introducción

En este proyecto he desarrollado un mod para Minecraft utilizando Forge, cuyo objetivo es crear una nueva poción que impida el daño por caída. El mod añade una poción personalizada que, al ser consumida, cancela cualquier daño que el jugador pudiera recibir por caídas desde grandes alturas.

El propósito principal de este proyecto es aprender a trabajar con la estructura de un proyecto Java utilizando Forge, entender el proceso de registro de ítems, efectos y recetas, así como poner en práctica conceptos fundamentales de programación orientada a objetos.

## 2. Herramientas utilizadas

- **Java 17**: aunque en clase utilizamos Java 23, Forge 1.19.2 solo es compatible hasta Java 17.
- **Eclipse 2024**: como entorno de desarrollo, ya familiar en la asignatura de Programación.
- **Gradle 7.6**: versión recomendada para la compatibilidad con Forge 1.19.2.
- **Minecraft Forge 1.19.2**: por ser una versión estable y ampliamente utilizada en tutoriales.
- **VS Code (opcionalmente)**: para visualizar y editar archivos del proyecto de forma ligera.

## 3. Instalación y configuración del entorno

1. Descargar e instalar JDK 17.
2. Configurar las variables de entorno JAVA_HOME.
3. Descargar el MDK (Mod Development Kit) de Forge 1.19.2 desde [https://files.minecraftforge.net/](https://files.minecraftforge.net/).
4. Descomprimir el MDK en una carpeta de trabajo.
5. Abrir una terminal en la raíz del proyecto y ejecutar:
   ```bash
   ./gradlew genEclipseRuns
   ./gradlew eclipse
   ```
6. Importar el proyecto en Eclipse como un proyecto Gradle existente.
7. Verificar que la estructura es reconocida correctamente y que el mod se puede ejecutar desde las configuraciones de ejecución generadas.

## 4. Desarrollo del mod

El desarrollo del mod se ha basado en registrar un nuevo ítem (una poción), definir un nuevo efecto (el efecto de caída suave), y vincular ambos para que el jugador, al consumir la poción, quede protegido contra el daño por caída.

Para lograrlo, se han creado clases específicas para gestionar el registro de ítems, efectos y comportamientos personalizados. También se ha aprendido a utilizar el sistema de eventos y registros de Forge para que estos componentes se integren correctamente dentro del juego.

## 5. Contenido en el mod

Durante la realización del mod, he trabajado con varias clases Java distribuidas en la estructura típica de un proyecto Forge, que he ido comprendiendo progresivamente a medida que desarrollaba el proyecto.

### Estructura del directorio

El proyecto se encuentra ubicado en la siguiente ruta principal:

```
src/main/java/com/pocioncaidasuave
```

En Visual Studio Code, esta estructura no siempre se muestra como una carpeta ramificada en árbol de forma visual (por ejemplo, `src > main > java > com > pocioncaidasuave`). En cambio, aparece como una única carpeta con el nombre completo del paquete. Esto se debe a cómo el propio VS Code interpreta y muestra los paquetes de Java dentro de la carpeta `java`. Sin embargo, internamente, sí están organizados como subcarpetas que respetan la convención del nombre del paquete.

### Clases y su funcionalidad

- **`MiMod.java`**: Clase principal del mod. Inicializa el mod y registra los elementos como `ModItems` y `ModEffects`.
- **`ModEffects.java`**: Registra los efectos personalizados. En este caso, registra el efecto "absorción de caída".
- **`PotionBase.java`**: Define el comportamiento del efecto. Anula el daño por caída en cada tick.
- **`ModItems.java`**: Registra la poción como ítem del juego, con propiedades y efecto.
- **`ModRecipe.java`**: Preparada para registrar recetas de creación para la poción.

### Relación entre clases

- `MiMod` coordina todo el mod.
- `ModEffects` y `PotionBase` trabajan juntas: una registra y la otra define el comportamiento.
- `ModItems` conecta el ítem con el efecto.
- `ModRecipe` se utilizará para añadir recetas al juego.

## 6. Problemas comunes y cómo solucionarlos

### Error de versiones Forge
Uno de los errores más comunes al empezar fue que las versiones de Java, Forge y Gradle no estaban alineadas. En clase usamos Java 23, pero Forge 1.19.2 solo es compatible hasta Java 17, lo que obligó a instalar esa versión. Además, fue necesario usar Gradle 7.6 para que el entorno funcionara correctamente.

### Crash por mal registro
Un error frecuente fue olvidar registrar correctamente los efectos o ítems, lo que provocaba fallos al iniciar el juego. Asegurar el uso correcto de `DeferredRegister` y verificar los nombres únicos solucionó estos problemas.

### Problemas con rutas o recursos
Algunos archivos `.json` de recursos deben estar bien ubicados en `resources/data` o `resources/assets`, y con el nombre correcto. Si no, los ítems no aparecen o el juego lanza errores.

### Buenas prácticas para evitar errores
- Utilizar nombres únicos y consistentes.
- Registrar todo a través de `DeferredRegister`.
- Comprobar las rutas y nombres de archivos JSON.
- Seguir el patrón de los tutoriales fiables y documentar el código.

## 7. Impacto y aplicaciones

Saber hacer mods no solo permite personalizar el juego, sino que enseña conceptos clave de programación moderna: estructuras de clases, modularidad, eventos, uso de bibliotecas externas y lógica orientada a objetos.

Esto se relaciona directamente con el desarrollo real de software, ya que se aplica el trabajo con entornos de desarrollo, el control de dependencias y la depuración de errores en un entorno práctico.

Además, conocer Forge y Minecraft puede abrir la puerta a futuros proyectos educativos, desarrollo de videojuegos, trabajos como programador de herramientas o incluso crear contenido educativo interactivo.

## 8. Conclusión

Desarrollar este mod me ha ayudado a comprender de forma aplicada muchos conceptos que estamos viendo en la asignatura de Programación, como la programación orientada a objetos, la estructura de un proyecto Java o el uso de bibliotecas y dependencias externas.

A través de la creación del mod he aprendido a resolver errores reales, configurar correctamente el entorno de desarrollo, y entender la importancia de la organización del código y los registros adecuados.

Ha sido una experiencia enriquecedora tanto desde el punto de vista técnico como motivacional, ya que trabajar en algo tangible y creativo como un mod me ha dado más ganas de seguir aprendiendo.

## 9. Bibliografía y recursos

- Forge Documentation: https://mcforge.readthedocs.io/
- Forge Forums: https://forums.minecraftforge.net/
- Tutorial base: https://moddingbykaupenjoe.net/
- GitHub de ejemplos: https://github.com/
- Documentación oficial de Gradle: https://docs.gradle.org/7.6/userguide/
- Documentación de Java 17: https://docs.oracle.com/en/java/javase/17/
- Experiencia personal y errores durante la práctica

