Banking Application (Spring Boot + MySQL) A backend banking service that allows users to perform essential banking operations through a RESTful API. Designed with a clean architecture using Spring Boot and MySQL, and tested using Postman.

🛠️ Tech Stack Programming Language: Java

Framework: Spring Boot

Database: MySQL

API Testing: Postman

Build Tool: Maven

✨ Features Create new bank accounts

Deposit money into existing accounts

Withdraw money from accounts

Retrieve details of a specific account

View all existing accounts

Delete bank accounts

🚀 Getting Started Clone the repository:

bash Copy Edit git clone Configure your application.properties file with MySQL credentials.

Run the Spring Boot application:

bash Copy Edit mvn spring-boot:run Use Postman to test the APIs at http://localhost:8080/api/accounts

📂 API Endpoints

Method Endpoint Description POST /api/accounts Create a new account GET /api/accounts/{id} Retrieve account by ID PUT /api/accounts/{id}/deposit Deposit amount into account PUT /api/accounts/{id}/withdraw Withdraw amount from account GET /api/accounts Retrieve all accounts DELETE /api/accounts/{id} Delete an account 📌 Notes Data is stored in a MySQL database.

APIs are secured with basic input validation.

Error handling is implemented for invalid account operations.
