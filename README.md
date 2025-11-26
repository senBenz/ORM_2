Table of Contents

Overview
Getting Started
Prerequisites
Installation
Usage
Testing
Overview

ORM_2 is a streamlined developer tool that showcases core data management capabilities within a Spring Boot architecture, leveraging Hibernate ORM and JPA. It provides a solid foundation for managing product data, complete with RESTful endpoints and in-memory testing.

Why ORM_2?

This project simplifies the development and testing of ORM-based data layers. The core features include:

🧩 Modular Data Layer: Defines the Product entity and repository interfaces for seamless data management.
🚀 Fast Testing: Utilizes an in-memory H2 database for quick setup and iteration.
🌐 RESTful APIs: Provides endpoints for retrieving product data, facilitating easy integration.
🔧 Spring Boot Integration: Combines Hibernate ORM and JPA for robust persistence.
✅ Validation & Testing: Includes setup validation to ensure reliable application initialization.
Getting Started

Prerequisites

This project requires the following dependencies:

Programming Language: Java
Package Manager: Maven
Installation

Build ORM_2 from the source and install dependencies:

Clone the repository:

❯ git clone https://github.com/senBenz/ORM_2
Navigate to the project directory:

❯ cd ORM_2
Install the dependencies:

Using maven:

❯ mvn install
Usage

Run the project with:

Using maven:

mvn exec:java
Testing

Orm_2 uses the {test_framework} test framework. Run the test suite with:

Using maven:

mvn test
⬆ Return
