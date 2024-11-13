# LITERALBOOK

Literalbook es una aplicación de consola de Java Spring Boot para amantes de los libros. Esta aplicación le permite buscar libros, enumerar libros registrados, enumerar autores y muchas otras funciones relacionadas con la lectura y organización de libros.

## Características

* Buscar un libro por título
* Listar todos los libros registrados
* Listar todos los autores registrados
* Listar autores que vivieron en un año específico
* Listar libros por idioma

## Tecnologías utilizadas

* Java 17
* Spring Boot
* Maven
* Hibernate
* Gutendex API `https://gutendex.com/books/`
* PostgreSQL

## Configuración

1. Clona el repositorio

```
git clone https://github.com/nombre-usuario/literalbook.git
cd literalbook
```

2. Actualiza el archivo `application.properties` con tus credenciales de base de datos

```
spring.datasource.url=jdbc:postgresql://localhost:5500/tu-nombre-base-datos
spring.datasource.username=tu-usuario
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3. Ejecuta la aplicación utilizando tu IDE o a través de la línea de comandos con `mvn spring-boot:run`


## Uso

Al iniciar la aplicación se desplegará el menú principal con las opciones disponibles. Simplemente siga las instrucciones en pantalla para navegar por las funciones.
Ejemplo de uso:
```
- Buscar libros por título:
Escriba 1 y presione Entrar.
Ingrese el título del libro que desea buscar.
La aplicación consultará la API de Gutendex y mostrará los resultados encontrados.

- Lista de libros registrados:
Escriba 2 y presione Entrar.
La aplicación enumerará todos los libros registrados en la base de datos.
Lista de autores registrados:

- Escriba 3 y presione Entrar.
La aplicación enumerará todos los autores de libros registrados.
Enumere los autores vivos en un año determinado:

- Escriba 4 y presione Entrar.
Ingrese el año deseado.
La solicitud enumerará los autores que estaban vivos ese año.
Lista de autores nacidos en un año determinado:

- Escriba 5 y presione Entrar.
Ingrese el código de idioma deseado (por ejemplo, en para inglés, es para español).
La aplicación listará todos los libros registrados en la base de datos en ese idioma.
Cierra la aplicación:

- Escriba 0 y presione Entrar.
La aplicación se cerrará.

```
## Screens

![Literalbook](literalbook/blob/main/screen/lb_01.png)
![Literalbook](literalbook/blob/main/screen/lb_02.png)
![Literalbook](literalbook/blob/main/screen/lb_03.png)
![Literalbook](literalbook/blob/main/screen/lb_04.png)
![Literalbook](literalbook/blob/main/screen/lb_05.png)

