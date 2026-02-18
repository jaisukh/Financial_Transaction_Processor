# PayTrack – Setup & Requirements

## What You Need to Install

### 1. **Java 21** (required)
- **macOS:** `brew install openjdk@21` then add to PATH, or download from [Adoptium](https://adoptium.net/)
- **Windows:** Download JDK 21 from [Adoptium](https://adoptium.net/) or Oracle
- **Linux:** `sudo apt install openjdk-21-jdk` (Ubuntu/Debian) or equivalent

Verify:
```bash
java -version
# Should show version 21.x
```

### 2. **Maven** (optional – project includes Maven Wrapper)
- The project has `mvnw` / `mvnw.cmd`, so you can run `./mvnw` without installing Maven.
- To install Maven: `brew install maven` (macOS) or download from [maven.apache.org](https://maven.apache.org/)

### 3. **MySQL 8** (required for the app to run)
- **macOS:** `brew install mysql` then `brew services start mysql`
- **Windows:** Download from [MySQL](https://dev.mysql.com/downloads/mysql/)
- **Linux:** `sudo apt install mysql-server` (Ubuntu/Debian)

Create the database:
```sql
CREATE DATABASE blogapplication;
```

---

## Configure Database

Edit `src/main/resources/application.properties` and set **your** MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blogapplication?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

- **Database name:** `blogapplication` (or create another and change the URL)
- **Username / password:** Use your local MySQL user and password.

---

## Build & Run

```bash
# Build
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

- **App URL:** http://localhost:8098  
- **Actuator:** http://localhost:8087/actuator  
- **Swagger UI:** http://localhost:8098/swagger-ui.html (if available)

---

## Quick Checklist

| Item              | Purpose                    |
|-------------------|----------------------------|
| Java 21           | Compile and run the app    |
| MySQL 8           | Database for the app       |
| Maven (or `./mvnw`)| Build and run              |

After installing Java 21 and MySQL, updating `application.properties` with your DB credentials, and creating the `blogapplication` database, the project should build and run with the commands above.
