# Java Spring Boot Product Management API

A RESTful API for product management with **JWT Authentication**, search & filter, logging, and global exception handling.  
Built using **Java Spring Boot 3.x**, **MySQL**, and **JWT**.

---

## 🚀 Features
- User Registration & Login with JWT Authentication
- Product CRUD (Create, Read, Update, Delete)
- Search & Filter products by name or price range
- Input validation using Hibernate Validator
- Logging with Log4j2
- Global Exception Handling
- Unit Test with JUnit & Mockito
- Ready to run locally or deploy to cloud (Heroku, AWS, etc.)

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3.x**
- **Spring Security**
- **Spring Data JPA**
- **MySQL**
- **JWT (jjwt)**
- **Log4j2**
- **JUnit 5 & Mockito**

---

## 📂 Project Structure
src
├─ main
│ ├─ java/com/example/demo
│ │ ├─ config
│ │ │ ├─ SecurityConfig.java # Spring Security configuration
│ │ │ └─ AppConfig.java # PasswordEncoder bean
│ │ ├─ controller
│ │ │ ├─ AuthController.java # Authentication endpoints (register & login)
│ │ │ └─ ProductController.java # Product CRUD & search endpoints
│ │ ├─ exception
│ │ │ └─ GlobalExceptionHandler.java # Centralized exception handling
│ │ ├─ model
│ │ │ ├─ Product.java # Product entity
│ │ │ ├─ Role.java # Role entity
│ │ │ └─ User.java # User entity
│ │ ├─ repository
│ │ │ ├─ ProductRepository.java # Product queries
│ │ │ ├─ RoleRepository.java # Role queries
│ │ │ └─ UserRepository.java # User queries
│ │ ├─ security
│ │ │ ├─ JwtUtil.java # JWT utility (generate & validate tokens)
│ │ │ └─ JwtFilter.java # JWT request filter
│ │ └─ service
│ │ ├─ ProductService.java # Product business logic
│ │ └─ UserService.java # User & authentication service
│ └─ resources
│ ├─ application.properties # App configuration
│ └─ log4j2.xml # Logging configuration
└─ test
└─ java/com/example/demo
└─ ProductControllerTest.java # Unit test for product API

yaml
---

## ⚙️ Setup & Installation
### 1. Clone Repository
```bash
git clone https://github.com/your-username/product-management-api.git
cd product-management-api


Create SQL Database
CREATE DATABASE product_db;

Update src/main/resources/application.properties:
adjust the connection

spring.datasource.url=jdbc:mysql://localhost:3306/product_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
jwt.secret=mySecretKeyForJwtAuthentication123456

Bash 

mvn clean install
mvn spring-boot:run

The App will run at
http://localhost:8080

