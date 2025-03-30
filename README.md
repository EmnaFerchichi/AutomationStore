# AutomationStore Test Automation Project

## 📌 Project Overview
This project automates the registration, login, and checkout functionalities of the **Automation Test Store** website using **Selenium WebDriver**, **Cucumber (BDD)**, and the **Page Object Model (POM)**.

## 🛠️ Tech Stack
- **Java** (Programming Language)
- **Selenium WebDriver** (UI Automation)
- **Cucumber** (BDD Framework)
- **Maven** (Build Tool)
- **IntelliJ IDEA** (IDE)

## 📂 Project Structure
```
AutomationStore/
│-- src/main/java/Factory/         # Page Object Model (POM) Classes
│-- src/test/java/StepDefinition/  # Step Definitions for Cucumber
│-- src/test/resources/features/   # Feature Files (BDD Scenarios)
│-- pom.xml                        # Maven Dependencies
│-- README.md                      # Project Documentation
```

## ⚙️ Setup & Installation
### Prerequisites
Ensure you have the following installed:
- **Java JDK 8+**
- **Maven**
- **IntelliJ IDEA**
- **Google Chrome & ChromeDriver**

### Clone the Repository
```sh
git clone https://github.com/EmnaFerchichi/AutomationStore.git
cd AutomationStore
```

### Install Dependencies
```sh
mvn clean install
```

## 🚀 Running the Tests
### 1. Run Cucumber Tests via Maven
```sh
mvn test
```

### 2. Run Tests via IntelliJ IDEA
1. Open `RunnerTest.java`
2. Click the **Run** button

## 📝 Features & Scenarios
This project includes automation for:
- **User Registration & Login**
- **Adding Products to Cart**
- **Checkout Process**

Example scenario (from `register_login.feature`):
```gherkin
Feature: Register and Login feature
  Scenario: Register and Login an account
    Given User is on the Home Page
    When User clicks on Login or Register button
    And User clicks on continue button
    ...
    Then User will be redirected to a success page

