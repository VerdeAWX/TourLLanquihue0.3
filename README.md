# Llanquihue Tour 🚐🌋

## Descripción general

Llanquihue Tour es un prototipo de sistema desarrollado en Java utilizando Programación Orientada a Objetos (POO).

El sistema tiene como objetivo apoyar la gestión administrativa de una agencia turística ubicada en la Región de Los Lagos, permitiendo administrar clientes, proveedores, empleados, tours y reservas.

El proyecto busca reemplazar procesos manuales mediante una estructura modular, reutilizable y escalable.

---

# Objetivo del proyecto

Desarrollar una base de software orientada a objetos que permita:

- Registrar clientes.
- Gestionar información de personas relacionadas con la empresa.
- Crear y administrar tours turísticos.
- Registrar reservas.
- Organizar información mediante colecciones.
- Leer datos desde archivos externos.

---

# Tecnologías utilizadas

- Java
- NetBeans IDE
- Programación Orientada a Objetos
- Git
- GitHub

---

# Estructura del proyecto

```
LlanquihueTour

src

├── app
│   └── Main.java
│
├── model
│   ├── Persona.java
│   ├── Cliente.java
│   ├── Empleado.java
│   ├── Proveedor.java
│   ├── Direccion.java
│   ├── Rut.java
│   ├── Tour.java
│   └── Reserva.java
│
├── interfaces
│   └── Registrable.java
│
├── data
│   ├── GestorClientes.java
│   ├── GestorTours.java
│   └── GestorReservas.java
│
├── utils
│   └── LectorArchivo.java
│
└── excepciones
    └── RutInvalidoException.java
```

---

# Descripción de clases principales

## Persona

Clase abstracta que representa la información común de las personas del sistema.

Contiene:

- Nombre.
- RUT.
- Dirección.
- Teléfono.

Es utilizada como clase padre.

---

## Cliente

Representa a los usuarios que reservan experiencias turísticas.

Incluye:

- Correo electrónico.
- Información personal.
- Registro dentro del sistema.

---

## Empleado

Representa trabajadores de Llanquihue Tour.

Permite modelar cargos dentro de la empresa.

---

## Proveedor

Representa empresas externas asociadas:

- Transporte.
- Alojamiento.
- Servicios turísticos.

---

## Tour

Representa los paquetes turísticos disponibles.

Contiene:

- Código.
- Nombre.
- Destino.
- Precio.
- Cupos disponibles.

---

## Reserva

Relaciona un cliente con un tour mediante composición.

Permite registrar:

- Cliente.
- Tour seleccionado.
- Cantidad de personas.

---

# Principios de Programación Orientada a Objetos utilizados

## Encapsulamiento

Los atributos de las clases son privados y se accede mediante métodos getters y setters.

---

## Herencia

Implementada mediante:

```
Persona

 ├── Cliente

 ├── Empleado

 └── Proveedor
```

---

## Polimorfismo

Se utiliza una lista:

```
List<Registrable>
```

que permite manejar diferentes tipos de personas.

---

## Interfaces

Se implementó:

```
Registrable
```

con los métodos:

- registrar()
- mostrarDatos()

---

## Excepciones personalizadas

Se creó:

```
RutInvalidoException
```

para validar información incorrecta del RUT.

---

# Gestión de datos

El sistema utiliza:

## ArrayList

Para almacenar clientes y tours.

---

## HashMap

Para buscar clientes rápidamente utilizando el RUT.

---

## Stack

Para administrar el historial de reservas.

---

# Archivos utilizados

## clientes.txt

Contiene información inicial de clientes.

Formato:

```
Nombre;Rut;Ciudad
```

Ejemplo:

```
Juan Perez;12345678-9;Puerto Montt
```

---

## tours.txt

Contiene información inicial de tours.

Formato:

```
Codigo;Nombre;Destino;Precio;Cupos
```

Ejemplo:

```
1;Saltos del Petrohue;Puerto Varas;45000;20
```

---

# Instalación y ejecución

## Clonar repositorio

```
git clone URL_DEL_REPOSITORIO
```

---

## Abrir proyecto

1. Abrir NetBeans.
2. Seleccionar:

```
File → Open Project
```

3. Elegir carpeta LlanquihueTour.

---

## Ejecutar

Ejecutar:

```
Main.java
```

---

# Menú principal

El sistema permite:

```
1. Registrar cliente
2. Mostrar clientes
3. Buscar cliente por RUT
4. Registrar tour
5. Mostrar tours
6. Crear reserva
7. Mostrar reservas
8. Cargar clientes TXT
9. Cargar tours TXT
10. Mostrar polimorfismo
11. Cancelar última reserva
12. Salir
```

---

# Autor

Nicolas Orozco Robles

Proyecto desarrollado como actividad académica de Programación Orientada a Objetos.
