# Food Order Management

A Java-based Food Order Management application developed using Maven and JUnit 5.

## Features

- Add food items to an order
- Calculate item totals
- Validate price and quantity
- Handle invalid inputs using exceptions
- Unit testing with JUnit 5
- Continuous Integration using GitHub Actions

## Technologies Used

- Java 24
- Maven
- JUnit 5
- Git & GitHub
- GitHub Actions

## Project Structure

```text
FoodOrderManagement/
├── .github/workflows/maven.yml
├── src/main/java/com/foodorder/FoodOrder.java
├── src/test/java/com/foodorder/FoodOrderTest.java
├── .gitignore
├── pom.xml
└── README.md
````

## Testing

Run the tests using:

```bash
mvn clean test
```

All JUnit tests should pass successfully.

## Continuous Integration

GitHub Actions automatically builds the Maven project and runs the JUnit tests whenever changes are pushed to the `main` branch.

## Author

**Vindhya Reddy**

