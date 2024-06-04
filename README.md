
# Selenide and Cucumber BDD for OrangeHRM Testing

This repository contains demo code for OrangeHRM, a popular human resource management system. The project includes source files and test reports designed to showcase various features and functionalities of OrangeHRM.

## Project Structure

1) **.idea/:** IDE configuration files.

2) **src/:** Source code for the OrangeHRM demo.
-**main/:** Contains the main application code.

-**test/:** Contains test cases and related code.

3) **test-result/reports/:** Test reports generated after running the tests.

4) **.gitignore:** Specifies intentionally untracked files to ignore.
pom.xml: Maven configuration file for project dependencies and build management.

## Technologies Used

## Used tools
- [Selenide](https://selenide.org/)  (Concise API for UI Automation. Wrapper on top of Selenium)
- [Cucumber](https://cucumber.io/)
- [Java](https://www.java.com/en/)
- [Githab CI/CD docs](https://github.com/prdeshmukh1/UiBank_Selenideframework)
- [Jenkins CI/CD](https://www.jenkins.io/) (Continios Integration )


## Getting Started

### Prerequisites
1) Java JDK 17 
2) Maven
3) IDE(IntelliJ IDE)

### Installation

1) Clone the repository:
git clone https://github.com/jeetu071999/OrangeHRM_DemoCode.git

2) Navigate to the project directory:
cd OrangeHRM_DemoCode

3) Build the project using Maven:
mvn clean install

## How to run on local machine:
###  By maven
- for all tests run: `mvn clean test`
- for single test use: `mvn clean "-Dtest=/src/test/resources/features/Login.feature" test`

## Running Scenarios using Tags from Command Line
- mvn test -Dcucumber.options="--tags @tagName"

## Reports
![image](https://github.com/jeetu071999/OrangeHRM_DemoCode/assets/8168069/005db56d-05c3-4b94-98b1-8889d73bdbab)


## Contact
Prashant Deshmukh : Test Manager @ Accelirate

## Contributors 
![image](https://github.com/jeetu071999/OrangeHRM_DemoCode/assets/8168069/88cfe0e9-be90-4384-8917-7ae6f6b79074)


