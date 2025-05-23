# RNYD - Backend API
- Este es el backend de la aplicación RNYD, desarrollado con Spring Boot. Se encarga de gestionar toda la lógica de negocio y exponer la API REST que consume el frontend hecho en Angular.Está organizado por controladores según el tipo de recurso: usuarios, entrenamientos, dietas, suscripciones y perfiles. También lleva la parte de seguridad, roles y autenticación con JWT.
- La base de datos se conecta mediante JPA y está preparada para funcionar con MySQL. La aplicación se lanza por defecto en el puerto 8080.

## Importante
- El archivo application.properties no está subido al repositorio porque lleva claves privadas de Stripe. Si alguien necesita probar el proyecto, se solicita directamente al autor.
- También hay que tener creada la base de datos con el mismo nombre que viene configurado en ese archivo. La aplicación corre por el puerto 8080, así que si ese puerto está pillado por otra cosa, hay que liberarlo desde la consola antes de arrancar

## Requisitos
Para poder ejecutar este proyecto se necesita:

- Java 17 o superior
- Maven
- Una base de datos relacional (MySQL recomendada)
- Postman (opcional, para testear las peticiones)

## Instalación
Para arrancar el proyecto en local, se han seguido estos pasos:

1. Se ha clonado el repositorio desde el repositorio correspondiente.
2. El proyecto viene comprimido, así que primero se descomprime.
3. Se abre con un entorno de desarrollo (IntelliJ IDEA o Eclipse, por ejemplo).
4. Se configura el archivo `application.properties` con los datos de conexión a la base de datos.
5. Finalmente, se ejecuta la aplicación desde la clase principal que contiene `@SpringBootApplication`.

## Estructura y funcionalidades de la API
La API está organizada por módulos, cada uno encargado de una parte específica de la lógica de negocio:

### Autenticación
- `POST /auth/signin`: Permite a los usuarios iniciar sesión.

### Gestión de usuarios
- `GET /user`: Devuelve la lista completa de usuarios.
- `GET /user/{email}`: Devuelve la información de un usuario específico.
- `DELETE /user/{email}`: Elimina a un usuario por su correo.
- `GET /user/check-admin/{email}`: Comprueba si el usuario tiene rol de administrador.

### Registro de usuarios
- `POST /signup/register`: Registra tanto usuarios como administradores, según el rol enviado.

### Progreso del usuario
- `GET /progress/history/{email}`: Devuelve el historial de progresos (peso, altura, imagen...).
- `POST /progress/upload/{email}`: Permite subir un nuevo progreso con datos físicos y una imagen.

### Dietas
- `POST /diet/create`: Crea una nueva dieta subiendo un JSON con los datos y un PDF adjunto.
- `GET /diet/{email}`: Devuelve la dieta asignada a un usuario.
- `PATCH /diet/update/{id}`: Actualiza la dieta correspondiente al ID.
- `DELETE /diet/{id}`: Elimina una dieta específica.
- `POST /diet/assign/{email}`: Asigna una dieta a un usuario.
- `POST /measurements/{email}`: Guarda nuevas mediciones corporales.
- `GET /measurements/{email}`: Obtiene las mediciones guardadas para un usuario.

### Entrenamientos
- `POST /workout/create`: Crea un entrenamiento subiendo los datos en JSON y el PDF.
- `PATCH /workout/{email}`: Actualiza el entrenamiento de un usuario.
- `DELETE /workout/{id}`: Elimina un entrenamiento por su ID.
- `POST /workout/assign/{email}`: Asigna un entrenamiento a un usuario.
- `GET /workout`: Devuelve la lista de entrenamientos disponibles.

### Pagos con Stripe
- `POST /stripe/create-subscription`: Crea un plan de suscripción.
- `GET /stripe`: Devuelve todos los planes creados.
- `GET /stripe/payments`: Muestra el historial de pagos.
- `PATCH /{email}/{price_id}`: Asigna un plan de pago específico a un usuario.

## Variables de entorno en Postman
Para poder ejecutar correctamente las peticiones desde Postman, se han utilizado las siguientes variables:

- `{{URL}}`: URL base del backend, normalmente `http://localhost:8080/`.
- `{{token}}`: Token JWT para autenticar las peticiones.
- `{{email}}`: Correo electrónico del usuario que se está usando como identificador.

## Seguridad
- El sistema implementa autenticación mediante tokens JWT.
- Los endpoints que modifican datos o muestran información sensible requieren un token válido en la cabecera de la petición.
- Se ha separado el rol de administrador y usuario para controlar accesos.

## Extras
- Las imágenes de progreso y los PDFs de dieta/entrenamiento se suben usando `multipart/form-data`.
- La validación de formularios y datos se hace desde el backend usando anotaciones estándar de Spring.
- Se han utilizado servicios de terceros como **Stripe** para la gestión de suscripciones.

