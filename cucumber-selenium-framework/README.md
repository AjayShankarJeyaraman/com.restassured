# Selenium Cucumber Test Automation Framework

This is a test automation framework built with Selenium WebDriver, Cucumber, and JUnit 5. It follows the Page Object Model design pattern and supports BDD (Behavior Driven Development) testing.

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- Chrome, Firefox, or Edge browser installed

## Project Structure

```
src/
├── test/
│   ├── java/
│   │   └── com/
│   │       └── automation/
│   │           ├── config/
│   │           │   └── ConfigManager.java
│   │           ├── driver/
│   │           │   └── DriverManager.java
│   │           ├── pages/
│   │           │   ├── BasePage.java
│   │           │   └── LoginPage.java
│   │           ├── runners/
│   │           │   └── TestRunner.java
│   │           └── steps/
│   │               └── LoginSteps.java
│   └── resources/
│       ├── config/
│       │   └── qa.properties
│       ├── features/
│       │   └── login.feature
│       └── log4j2.xml
```

## Features

- Page Object Model implementation
- Cucumber BDD support
- JUnit 5 test runner
- Configurable environment properties
- Logging with Log4j2
- Screenshot capture on test failure
- Cross-browser testing support
- Parallel test execution capability

## Running Tests

### Run all tests
```bash
mvn clean test
```

### Run specific tags
```bash
mvn clean test -Dcucumber.filter.tags="@smoke"
```

### Run tests in specific browser
```bash
mvn clean test -Dbrowser=firefox
```

### Run tests in headless mode
```bash
mvn clean test -Dheadless=true
```

## Test Reports

After test execution, you can find the following reports:
- Cucumber HTML Report: `target/cucumber-reports/cucumber.html`
- Cucumber JSON Report: `target/cucumber-reports/cucumber.json`
- Logs: `logs/automation.log`

## Adding New Tests

1. Create a new feature file in `src/test/resources/features/`
2. Create corresponding step definitions in `src/test/java/com/automation/steps/`
3. Create page objects in `src/test/java/com/automation/pages/`
4. Add test data in the appropriate properties file in `src/test/resources/config/`

## Best Practices

1. Use meaningful feature and scenario names
2. Keep step definitions clean and maintainable
3. Follow the Page Object Model pattern
4. Use appropriate waits instead of hard-coded delays
5. Keep test data separate from test code
6. Use tags to organize and filter tests
7. Write atomic and independent test scenarios 