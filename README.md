��#   C a s s i n o 
 
 # API de Cassino - Spring Boot                                                                                                                                                             
 Este projeto é uma API RESTful para um sistema de cassino, desenvolvida com Spring Boot, banco de dados H2 (em memória) e Docker.

## 🧰 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados H2
- JUnit 5 + Mockito
- Swagger / Springdoc OpenAPI
- Docker

- 📁 Estrutura de Pastas
bash
Copiar
Editar
src
├── main
│   ├── java
│   │   └── com.seu.pacote
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       ├── service
│   │       └── CassinoApplication.java
│   └── resources
│       ├── application.properties
│       └── static/templates
├── test
│   └── java
│       └── com.seu.pacote
│           └── ... (testes unitários)
