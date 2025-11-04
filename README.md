# Gestor de Tareas - Fundamentos de Spring Boot

Este proyecto es un Trabajo Práctico para la materia Programación III de la Tecnicatura Universitaria en Programación (UTN). Consiste en una aplicación de consola para gestionar una lista de tareas (To-Do List), desarrollada para aplicar los conceptos fundamentales del framework Spring Boot.

## Descripción del Proyecto

La aplicación permite realizar las siguientes acciones:
- Listar tareas iniciales.
- Agregar nuevas tareas, validando un límite máximo.
- Marcar tareas como completadas.
- Listar tareas pendientes y completadas por separado.
- Mostrar estadísticas sobre el total de tareas.

El objetivo principal es demostrar el uso de Inyección de Dependencias, Perfiles de configuración (desarrollo y producción), configuración externalizada en archivos `.properties` y la estructura de un proyecto profesional con Spring Boot.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Maven**
- **Lombok**

## Cómo Clonar y Ejecutar el Proyecto

### Prerrequisitos

- Tener instalado JDK 17 o superior.
- Tener instalado Maven.

### Clonación

```bash
git clone [URL-DE-TU-REPOSITORIO-EN-GITHUB]
cd fundamentos
```

### Ejecución

El proyecto se puede ejecutar directamente usando el wrapper de Maven incluido:

```bash
./mvnw spring-boot:run
```

## Gestión de Perfiles (Profiles)

La aplicación utiliza perfiles de Spring para adaptar su comportamiento y configuración a diferentes entornos.

Para cambiar de perfil, modifica la siguiente línea en el archivo `src/main/resources/application.properties`:

```properties
spring.profiles.active=dev
```

### Ejecutar en modo Desarrollo (dev)

Este es el perfil por defecto. Ofrece mensajes de bienvenida y despedida detallados, y un límite bajo de tareas para facilitar las pruebas.

```properties
# application.properties
spring.profiles.active=dev
```

### Ejecutar en modo Producción (prod)

Este perfil muestra mensajes concisos, deshabilita las estadísticas y establece un límite de tareas mucho más alto.

```properties
# application.properties
spring.profiles.active=prod
```

## Capturas de Pantalla

A continuación se muestran las salidas de la consola para cada perfil de ejecución.

### Salida del Perfil 'dev'

![Salida del perfil dev](perfilDev.png)

### Salida del Perfil 'prod'

![Salida del perfil prod](pefilProdr.png)

## Autor

- **Nombre:** Franco Giusti
- **Legajo:** 50926
