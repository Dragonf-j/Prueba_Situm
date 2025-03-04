# Prueba_Situm
Repositorio para la prueba técnica de backend con Spring Boot  

# Requisitos previos
Para poder usarse esta aplicación debemos tener en nuestro equipo instaladas las siguientes características:
- Java 17
- Maven
- Spring boot
- Postman
  # Métodos de ejecución
Para poder ejecutarlo en un entorno que ya esté preparado podemos hacerlo de dos maneras.
## Mediante comandos
En este método se debe abrir una terminal dentro del proyecto, en la misma ruta en la que se encuentra el *pom.xml*
Una vez en la terminal pondremos el siguiente comando: **mvn spring-boot:run**. Este es el comando básico que permite ejecutar la aplicación.
Si esto falla,  podemos ejecutar el .jar o .war dependiendo de la opción elegida. Para ello, se usará el comando **mvn compile** cuando la aplicación no esté en ejecución.
Luego debemos usar el comando **mvn packge**, lo que generará un .jar. Una vez realizados estos pasos, se pondrá el siguiente comando de ejemplo para poder ejecutarlo: **java -jar target/tu-aplicacion.jar**

## Mediante IDE
En mi caso he usado VS Code como IDE para poder desarrollarlo. Este IDE contiene plug-in de Spring Boot y Maven. Debemos asegurarnos de tenerlas instaladas.
Una vez que tenemos instalados los plugins en VS Code, se abrirá la carpeta en la que se encuentra el proyecto. Esta carpeta debe tener la estructura de una aplicación Spring Boot y tener presente el fichero *pom.xml* debido a que sin él no se podrá ejecutar.
En la barra lateral de VS Code, haz clic en la pestaña "Spring Boot Dashboard" (icono con una hoja de Spring).
Se listarán las aplicaciones Spring Boot disponibles en tu proyecto.
Busca tu aplicación y haz clic en el botón "play" para ejecutarla.

Todo se ejecuta en **http://localhost:8080**

# Comprobación del funcionamiento

Debido a que la aplicación no tiene vistas html, no se puede comprobar en el navegador. Para ello, he utilizado la herramienta de postman.
- Primero debemos asegurarnos de tener instalado postman en nuestro equipo. En caso negativo, podemos descargarlo en su [web](https://www.postman.com/downloads/)
- Una vez instalado y abierto, debemos crear una nueva petición. Para ello, en la parte superior, haz clic en "New" y selecciona "Request".
- Elegimos el tipo de petición (GET, POST, PUT, DELETE)
- Ingresa la URL del endpoint de la API.
- Pulsar botón "Send". 

