# Resolucion de modelo de parcial para programacion II - U.T.N.

![Diagrama UML](https://i.imgur.com/abcdefg.png)

## 📚 Sistema de Gestión de Biblioteca en Java

Este proyecto implementa un sistema básico de gestión de publicaciones para una biblioteca, utilizando los principios de la programación orientada a objetos (POO) en Java.

### 🧠 Funcionalidades

- Agregar diferentes tipos de publicaciones: libros, revistas e ilustraciones.
- Validación de publicaciones duplicadas (por título y año).
- Mostrar todas las publicaciones registradas.
- Leer todas las publicaciones "leíbles" (libros y revistas).
- Menú interactivo por consola.
- Uso de excepciones personalizadas.
- Uso de colecciones (`ArrayList`) para almacenar publicaciones.

### 🏗️ Estructura del Proyecto

src/
├── Biblioteca.java
├── Genero.java
├── Ilustracion.java
├── Leible.java
├── Libro.java
├── Main.java
├── Publicacion.java
├── PublicacionExistenteException.java
├── Revista.java


### 🧱 Clases Principales

| Clase                     | Descripción |
|--------------------------|-------------|
| `Publicacion`            | Clase abstracta base para todos los tipos de publicaciones. Contiene título y año. |
| `Libro`                  | Hereda de `Publicacion` e implementa `Leible`. Tiene autor y género. |
| `Revista`                | Hereda de `Publicacion` e implementa `Leible`. Tiene número de edición. |
| `Ilustracion`            | Hereda de `Publicacion`. Tiene ilustrador y dimensiones. No es leíble. |
| `Leible`                 | Interfaz que define el método `leer()`. |
| `Biblioteca`             | Contiene la colección de publicaciones y métodos para gestionarlas. |
| `Genero`                 | Clase con constantes para representar géneros (Ficción, No Ficción, etc.). |
| `PublicacionExistenteException` | Excepción personalizada que se lanza si se intenta agregar una publicación duplicada. |
| `Main`                   | Contiene un menú interactivo para gestionar la biblioteca desde consola. |

### 📋 Requisitos

- Java JDK 8 o superior
- NetBeans (recomendado) o cualquier otro IDE compatible

### ▶️ Cómo Ejecutar

1. Clonar el repositorio o copiar los archivos al IDE.
2. Compilar y ejecutar `Main.java`.
3. Usar el menú por consola para agregar y gestionar publicaciones.

### 🧪 Ejemplo de Uso

--- Menú Biblioteca ---
1. Agregar Libro
2. Agregar Revista
3. Agregar Ilustración
4. Mostrar Publicaciones
5. Leer Publicaciones
0. Salir

#### Desarrollado como ejercicio práctico de programación orientada a objetos con Java.