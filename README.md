# Spring Boot REST API – User CRUD

## Requirements :-
- Java 17+
- Maven
- MySQL 
- Postman (for testing)

## Project Structure :-
- Controller: `UserController.java`
- Service: `UserService.java`, `UserServiceImpl.java`
- Repository: `UserRepository.java`
- Entity: `User.java`

##INTRODUCTION :-
This project is a RESTful web service developed using Spring Boot, designed to manage user data through standard CRUD (Create, Read, Update, Delete) operations. It demonstrates the fundamental building blocks of modern web service development using Java and Spring, focusing on layered architecture, REST principles, and data persistence.

 ## System Architecture :-
   - This project follows a 3-layered architecture:

* Controller Layer:
  - Handles HTTP requests and maps them to the appropriate service methods.

* Service Layer:
  - Contains business logic and acts as a bridge between the controller and the repository.

* Repository Layer:
 - Interacts with the database using Spring Data JPA to perform CRUD operations.


