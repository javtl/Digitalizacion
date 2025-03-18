# Desarrollo de un Mod en Java para Minecraft

## Índice:
- Resumen
- Introducción
- Metodología
- Desarrollo de las Tareas Realizadas en el Segundo Trimestre
- Manzana de Diamante
- Nuevo Mineral
- Creación de un nuevo Mineral y un Mob (Enemigo/Criatura)
- Resultados Obtenidos
- Conclusión y Próximos Pasos
- Referencia

## Resumen

En el Tiempo invertido en el desarrollo del proyecto durante el transcurso del segundo trimestre se ha realizado una mejora en el entendimiento del desarrollo de Mods en Java para Minecraft. Se han realizado 3 practicas para así mejorar el entendimiento del desarrollo y de las estructuras de los mods en Minecraft.

## Introducción

Se ha creado tres tipos de Mods de diferente nivel de complejidad 1- Manzana de Diamante. 2- Nuevo Mineral. 3- Creación de un nuevo Mineral y un Mob (Enemigo/Criatura)

## Metodología

Para el desarrollo de los mods, se siguió un enfoque basado en la experimentación y el aprendizaje incremental. Se utilizaron las siguientes herramientas y metodologías:

- **Entorno de Desarrollo**: Eclipse IDE con el SDK de Java y el entorno de desarrollo de Forge. 
- **Investigación previa**: Análisis de la documentación de Forge y ejemplos de mods existentes. 
- **Desarrollo modular**: Creación de clases separadas para gestionar ítems, bloques y entidades. 
- **Pruebas y depuración**: Uso de Minecraft Forge en modo desarrollo para probar y ajustar el comportamiento de los mods. 
- **Iteración y mejoras**: Se realizaron varias versiones de cada mod para optimizar su funcionamiento y corregir errores.

## Desarrollo de las Tareas Realizadas en el Segundo Trimestre

### 1. Manzana de Diamante
Descripción: Este mod añade un nuevo ítem al juego, la Manzana de Diamante (Diamond Apple), que otorga beneficios al ser consumida.

**Características Principales**:
- Regeneración (10 segundos)
- Resistencia (20 segundos)
- Tiene un alto nivel de nutrición y saturación.
- Es un ítem raro dentro del juego.

**Estructura del Mod**:
Se usa la API de Forge para registrar el ítem. Se define la manzana como un objeto con efectos mediante `FoodProperties`. Se configura su rareza y características dentro de la clase `DiamondApple`.

### 2. Nuevo Mineral
Es un mod desarrollado para Minecraft 1.19.2 con Forge, que introduce nuevos elementos al juego, incluyendo:
- Un nuevo mineral, que puede generarse en el mundo y extraerse con un pico de hierro o superior.
- Un nuevo bloque de mineral que, al picarse, suelta el ítem del mineral.

**Estructura del Mod**:
- `MiMod.java` → Clase principal del mod, donde se registran todos los elementos.
- `ModBlocks.java` → Contiene la definición del nuevo mineral como bloque.
- `ModItems.java` → Gestiona el ítem del mineral y la herramienta personalizada.
- `ModToolTiers.java` → Define las propiedades del material del Pico Místico.
- `MisticaPico.java` → Clase que extiende `PickaxeItem` para personalizar la herramienta.

**Posibles Mejoras**:
Este mod puede expandirse con más herramientas, generación personalizada del mineral en el mundo, efectos especiales al usar el pico, y nuevas recetas de crafteo.

### 3. Creación de un nuevo Mineral y un Mob (Enemigo/Criatura)
Es un mod para Minecraft Forge que introduce un nuevo mineral, herramientas, mobs y mecánicas de juego.

**Contenido del Mod**:
- **Nuevo Mineral**: Mineral de Ruby.
- **Bloque de Ruby**: Puede ser crafteado y emite partículas de fuego cuando se pisa.
- **Ítem Ruby**: Material base para herramientas y equipo avanzado.
- **Nuevas Herramientas y Equipos**: Espada de Ruby.
- **Nueva Criatura**: Ruby Phantom (Mob hostil que ataca al jugador).

**Sonidos y Efectos Personalizados**:
- Sonido único al recoger un Ruby.
- Efectos visuales en bloques y armas.

**Objetivo y Aprendizaje**:
Este mod fue desarrollado para aprender sobre programación en Java aplicada a Minecraft, explorando el registro de bloques, ítems, mobs y el manejo de eventos.

## Resultados Obtenidos

- Se ha logrado implementar correctamente los tres mods con las funcionalidades deseadas.
- Se ha adquirido un mejor entendimiento del uso de Forge para la modificación de Minecraft.
- Se ha mejorado la organización y modularización del código.
- Se han corregido errores y optimizado el rendimiento de los mods a través de iteraciones.
- Se ha conseguido una mayor familiarización con la estructura de datos y eventos en Minecraft.

## Conclusión y Próximos Pasos

El desarrollo de estos mods ha permitido consolidar conocimientos sobre programación en Java y la API de Forge. Como próximo paso, se planea continuar con el tercer proyecto, el cual es el más completo y ambicioso, explorando nuevas mecánicas de juego, la integración de inteligencia artificial para el mob y la optimización de texturas y sonidos personalizados.

## Referencias

- Documentación oficial de Forge: [mcforge](https://mcforge.readthedocs.io/en/latest/)
- Comunidades de desarrollo de mods de Minecraft.
- YouTube - Ejemplos de código y tutoriales en GitHub.
- Cursos en línea sobre programación en Java y desarrollo de mods.
- Minecraft Modding with Forge - Recursos educativos y documentación adicional.
