# Actividad Formativa 3 - Herencia

## Descripción

Este proyecto fue desarrollado como parte de la **Actividad Formativa 3** de la materia **Programación Orientada a Objetos**.

El objetivo de la actividad fue extender la aplicación creada en la Unidad 2 mediante la implementación del principio de **Herencia**, reutilizando atributos y métodos de una clase base para crear clases derivadas con funcionalidades específicas.

---

## Objetivo

Aplicar el concepto de herencia en Java mediante la creación de clases derivadas que reutilicen el código de una clase base, sobrescriban métodos y agreguen comportamientos propios.

---

## Tecnologías utilizadas

- Java
- Visual Studio Code
- Git
- GitHub

---

## Estructura del proyecto

El proyecto está conformado por las siguientes clases:

### Estudiante
Clase base que contiene la información general de un estudiante:

- Nombre
- Edad
- Matrícula
- Promedio

Además, incluye el método `mostrarInformacion()` para mostrar los datos del estudiante.

### EstudianteLicenciatura

Clase derivada que hereda de `Estudiante`.

Incluye:

- Atributo `carrera`
- Método `estudiar()`
- Sobrescribe el método `mostrarInformacion()`

### EstudiantePosgrado

Clase derivada que hereda de `Estudiante`.

Incluye:

- Atributo `especialidad`
- Método `investigar()`
- Sobrescribe el método `mostrarInformacion()`

---

## Conceptos aplicados

- Programación Orientada a Objetos
- Clases y Objetos
- Constructores
- Herencia (`extends`)
- Reutilización de código
- Sobrescritura de métodos (`@Override`)
- Uso de `super()`

---

## Ejecución

Al ejecutar el programa se crean:

- Dos estudiantes de licenciatura.
- Un estudiante de posgrado.

Posteriormente se muestra la información de cada uno y se ejecutan los métodos propios de cada clase derivada.

---

## Resultado esperado

El programa muestra en consola la información heredada de la clase base junto con la información específica de cada tipo de estudiante, demostrando el funcionamiento de la herencia en Java.

---

## Autor

**Ana Blanco**

Actividad Formativa 3 – Herencia

Programación Orientada a Objetos