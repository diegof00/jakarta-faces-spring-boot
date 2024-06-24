# Demo Spring Boot Jakarta Faces

This project demonstrates the integration between Spring Boot 3.3.1 and Jakarta Faces (JSF) 4.1, including the necessary configuration for using CDI (Contexts and Dependency Injection) with Weld.

## Requirements

- Java 17
- Maven 3.6.3 or higher

## Project Setup

### Overview

This project uses Spring Boot to simplify the setup and running of a web application. Jakarta Faces (JSF) is used for the user interface layer, and CDI (with Weld) is used for dependency injection.

### Key Configurations

1. **Spring Boot Configuration**:
    - Basic Spring Boot setup for a web application.
    - `application.properties` to set the application name and context path.

2. **JSF Configuration**:
    - JSF setup using `faces-config.xml` to configure the EL resolver.
    - A custom `JsfInitializer` to initialize JSF and CDI contexts.

3. **CDI Configuration**:
    - Weld is used as the CDI implementation.
    - CDI setup is done in the `JsfInitializer` class.

### Dependencies

The key dependencies include Spring Boot, Jakarta Faces, Weld, and related libraries. These dependencies are managed in the `pom.xml` file.

The project uses the following main dependencies:

- **Spring Boot Starter Web**: Provides the core web functionalities.
- **Jakarta Faces (JSF) API and Implementation**: For JSF support.
- **Weld Servlet**: For CDI support in a servlet environment.
- **Jakarta Servlet API**: For servlet support.
- **Jakarta Expression Language (EL)**: For expression language support.
- **Jakarta CDI API**: For CDI functionalities.


### Maven Plugins

1. **Spring Boot Maven Plugin**:
    - Used to package and run the Spring Boot application.
    - Configured to exclude `lombok` during packaging to avoid runtime issues.

2. **Maven Compiler Plugin**:
    - Configured to handle annotation processing for CDI.

### Configuration Files

- **`application.properties`**: Located in `src/main/resources`.
    ```properties
    spring.application.name=demo-spring-boot-jakarta-faces
    server.servlet.context-path=/faces
    ```
- **`faces-config.xml`**: Located in `src/main/webapp/WEB-INF/`, it configures JSF to use Spring's EL resolver.
- **`JsfInitializer.java`**: Custom initializer class to set up JSF and CDI contexts.

## Running the Application

To compile and run the application, use the following commands:

```bash
mvn clean install
mvn spring-boot:run 
```

Happy Coding!