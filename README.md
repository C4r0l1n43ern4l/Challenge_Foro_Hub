# Challenge_Foro-Hub

![Badge-Spring](https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub/assets/90581744/b1939b11-f93b-4ac6-8be0-936d7fb60dc1)


Este es un programa que fue desarrollado como el tercer Challenger propuesto por Alura - G6 en la especialización de Backend. 
El programa consiste en una API REST usando Spring para crear un foro a nivel de backend, en donde los usuarios podrán realizar un CRUD (crear, listar, actualizar o eliminar) un tópico
que se encuentre en la Base de datos, todo esto se llevará a cabo solo si el usuario se encuentra registrado, se autentica y la aplicación le genera un Token. 

## Funcionalidades del proyecto
- `Funcionalidad 1:` El proyecto ofrece varias funcionalidades las cuales se desarrollaron siguiendo las reglas de negocio y se encuentra divididas en Enpoints para realizar los CRUD que se encuentra en usuarioController, topicoController y autenticacionController.
  ![endpoint](https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub/assets/90581744/19531650-278f-4cad-9cdc-ec1d3e69c18a)

- `Funcionalidad 2:` Se implemento una base de datos relacional para la persistencia de la información, hasta el momento consta de dos tablas, previamente estructuradas como entidades (Tópicos y Usuarios).
  ![modelo-entidad-relacion](https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub/assets/90581744/c8788444-293e-457c-abfb-628030e6e3ad)

- `Funcionalidad 3:` Cuenta con servicio de autenticación/autorización para restringir el acceso a la información. Solo se podrá acceder mediante un Token
  ![token_security](https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub/assets/90581744/0316b40f-163f-4962-8e7b-6f83a51cd7ff)

  ![login](https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub/assets/90581744/994535f0-165b-4f86-8444-95cf6c28da9e)

- `Funcionalidad 4:` Se documento el proyecto usando la dependencia springdoc-openapi la cual funciona examinando una aplicación en tiempo de ejecución para inferir la semántica de API en función de las configuraciones de Spring, la estructura de clases y varias anotaciones de swagger-api.

## Cómo acceder al proyecto
Para poder acceder al proyecto solo debe clonarlo desde la URL de github:
https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub.git

![clona-proyecto](https://github.com/C4r0l1n43ern4l/Challenge_Foro_Hub/assets/90581744/25c480e6-f2dd-499a-9211-ddd05e68d8ce)


## Tecnología Usada
- Java JDK: versión 17.
- Maven
- Spring Boot: versión 3.3.0
- MYSQL 8.0
- IDE IntelliJ.

## Dependencias
- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- java-jwt
- Validation
- Spring Security
- Springdoc

## Autor
- Alba Carolina Bernal Carreño
