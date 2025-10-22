ORM_1_0

A Spring Boot application demonstrating Hibernate ORM and JPA integration with H2 in-memory database.

Features

•  JPA Entity Management: Product entity with auto-generated IDs
•  Spring Data JPA: Repository pattern for database operations
•  H2 Database: In-memory database for quick testing
•  CommandLineRunner: Automatic data seeding and retrieval on startup

Technologies

•  Spring Boot
•  Hibernate/JPA
•  H2 Database
•  Lombok
•  Maven

What It Does

The application automatically:
1. Creates a Product table in H2 database
2. Saves 3 Macbook products with different specs
3. Retrieves and displays all products
4. Fetches a specific product by ID and displays its details

Configuration

•  Port: 8086
•  H2 Console: Enabled at http://localhost:8086/h2-console
•  Database URL: jdbc:h2:mem:products_db

Running the Application
mvn spring-boot:run
