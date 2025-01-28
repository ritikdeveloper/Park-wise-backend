
This backend API, built with Spring Boot and Kafka, enables users to manage society parking needs. It tracks car entries and exits in real-time and uses Kafka for asynchronous messaging to notify users when their car enters or exits the society
## Prerequisites

Before you can run the project, make sure you have the following installed:

- Java 8 or higher
- Maven
- PostgreSQL (or any other database if you change the connection configuration)
- IDE (IntelliJ IDEA, Eclipse, etc.)
- Postman (for testing APIs)


## Screenshots
### HomeScreen
<img width="698" alt="HomeScreen" src="https://github.com/user-attachments/assets/67c0771c-100d-4153-8f28-45415060857c" />

### Login and JWT Token Example

<img width="329" alt="LoginPage" src="https://github.com/user-attachments/assets/27827fae-1929-4521-b731-63c5f2746129" />


### Adding a Car with Authorization
<img width="587" alt="AddCar" src="https://github.com/user-attachments/assets/4ca935a4-7fc5-4bfc-a4ee-86e6a4a79019" />

### Car Details
<img width="701" alt="CarDetails" src="https://github.com/user-attachments/assets/861394ac-6214-4ba0-bc78-94583c82cbf4" />




## Setup and Installation

### Step 1: Clone the Repository

```bash
git clone <repository-url>
```

### Step 2: Configure Database

1. **Set up PostgreSQL Database**:

   Ensure PostgreSQL is running and create a new database.

   ```bash
   CREATE DATABASE ParkWise;
   ```

2. **Update `application.properties`**:

   Open the `src/main/resources/application.properties` file and configure your database connection:

   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/book_management
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

### Step 3: Build the Project

You can build the project using Maven.

```bash
mvn clean install
```

### Step 4: Run the Project

To run the Spring Boot application, use the following command:

```bash
mvn spring-boot:run
```

The application will start on port `8080` by default.

## API Endpoints
## Table of Contents
1. [Authentication](#authentication)
   - [Register User](#register-user)
   - [Login](#login)
2. [User Management](#user-management)
   - [Create User](#create-user)
   - [Get All Users](#get-all-users)
3. [Car Management](#car-management)
   - [Add Car](#add-car)
   - [Get All Cars](#get-all-cars)
   - [Check Car Status](#check-car-status)
---

## Authentication

### Register User
Register a new user with a username, password, and role.

**Endpoint**:  
`POST http://localhost:8080/api/auth/register`

**Request Body**:
```json
{
  "username": "Manish",
  "password": "user",
  "role": "ADMIN"
}
```
Response:
```json

Returns HTTP status 201 Created on success.
```

Login
Authenticate a user and retrieve a JWT token. Include this token in the Authorization header for subsequent requests.

Endpoint:
```json
POST http://localhost:8080/api/auth/login
```
Request Body:

```json
{
  "username": "Manish",
  "password": "user"
}
```
Response:
```json
{
  "jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJNYW5pc2giLCJleHAiOjE3MzgxNzE0NjgsImlhdCI6MTczODA4NTA2OH0.IWkDN3uRqOcbcSLteXu0u0t2R8DnwCRAiiUlebpiACA"
}
```
User Management
Create User
Create a new user profile. Requires a valid JWT token.

Endpoint:
POST http://localhost:8080/user

Headers:
```json
{
  "Authorization": "Bearer <JWT_TOKEN>"
}
```
Request Body:
```json

 
{
  "firstName": "John",
  "lastName": "Doe",
  "towerNo": "A",
  "flatNo": "101"
}
```
Response:
```json
Returns HTTP status 201 Created on success.
```
Get All Users
Retrieve a list of all registered users. Requires a valid JWT token.

Endpoint:
```json
GET http://localhost:8080/user
```
Headers:
```json
{
  "Authorization": "Bearer <JWT_TOKEN>"
}
```
Response:

```json

[
  {
    "userId": 4,
    "firstName": "John",
    "lastName": "Doe",
    "towerNo": "A",
    "flatNo": "101"
  }
]
```
Car Management
Add Car
Add a new car entry. Requires a valid JWT token.

Endpoint:
```json
POST http://localhost:8080/api/cars
```
Headers:
```json

{
  "Authorization": "Bearer <JWT_TOKEN>"
}
```
Request Body:

```json

{
  "numberplate": "DL8CAF1234",
  "brand": "Maruti Suzuki",
  "model": "S-Cross",
  "location": 1
}
```
Response:
```json
Returns HTTP status 201 Created on success.
```
Get All Cars
Retrieve a list of all cars. Requires a valid JWT token.

Endpoint:
```json
GET http://localhost:8080/api/cars
```
Headers:

```json
 
{
  "Authorization": "Bearer <JWT_TOKEN>"
}
```
Response:

```json
 
[
  {
    "numberplate": "DL8CAF1234",
    "location": 1,
    "model": "S-Cross",
    "brand": "Maruti Suzuki"
  },
  {
    "numberplate": "Up25",
    "location": 1,
    "model": "Baleno",
    "brand": "Maruti Suzuki"
  }
]
```
Check Car Status
Check the status of a car by its number plate. The response toggles between true and false on each request. Requires a valid JWT token.
Endpoint:
```json
GET http://localhost:8080/api/cars/check/{numberplate}
```
Example:
```json
GET http://localhost:8080/api/cars/check/DL8CAF1234
```
Headers:

```json

{
  "Authorization": "Bearer <JWT_TOKEN>"
}
```
Response:

```json

false
```


#
### Note
The response alternates between true and false each time the endpoint is called.

### Usage Notes
Replace <JWT_TOKEN> with the token received from the /api/auth/login endpoint.

All endpoints (except /api/auth/register and /api/auth/login) require the Authorization header.

The Check Car Status endpoint is a demonstration and may not reflect actual car data.



This Markdown file is compatible with GitHub and will render properly in repositories. Save it as `README.md` in your project!



