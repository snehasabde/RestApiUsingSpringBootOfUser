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
- Entity: `Mess.java`
  
- Controller: `MessController.java`
- Service: `MessService.java`, `MessServiceImpl.java`
- Repository: `MessRepository.java`
- Entity: `Mess.java`

- Controller: `MessUserController.java`
- Service: `MessUserService.java`, `MessUserServiceImpl.java`
- Repository: `MessUSerRepository.java`
- Entity: `MessUserInfo.java`

##INTRODUCTION :-
This project is a RESTful web service developed using Spring Boot, designed for the student to find the mess.It is designed for the student to help them to find the mess with the information mess owner , price of one meal ,  location , and delivery mode.This "Messfinder"  project help them to find the mess with ease that is without effort.

 ## System Architecture :-
   - This project follows a 3-layered architecture:

* Controller Layer:
  - Handles HTTP requests and maps them to the appropriate service methods.

* Service Layer:
  - Contains business logic and acts as a bridge between the controller and the repository.

* Repository Layer:
 - Interacts with the database using Spring Data JPA to perform CRUD operations.


