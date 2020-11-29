# Westpac Automation Test Suite

The following technologies are used for automating the test solution:

* [Java 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html) 
* [Selenium](https://www.selenium.dev/downloads/)
* [Cucumber](https://cucumber.io/docs/installation/)

## Getting Started

These instructions will help you get the project up and running on your local machine for test development and automation testing purposes. 

## Prerequisites

* [Java : JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html) - Development and Runtime environment
* [Maven](https://maven.apache.org/) - Dependency Management
* Google Chrome v87.x
* Microsoft Edge v89.x
* Mozilla Firefox v60 and above

## Project Setup

1. The source code can be cloned on to any IDE of your choice from [github repository](https://github.com/ashika-mariasingam/westpac-automation-test-solution)
2. Import this as a Maven enabled Java Project in your IDE and setup classpath and all other relevant projects settings.
3. Once project is set, it can be built locally using command:
   ```mvn clean install ```

## Executing Tests from CLI

#### Syntax for executing tests:
```mvn test -Dbrowser=<<browser_name>> -Denv=<<environment_name>>```
##### where
##### allowed browser_name: 'chrome'(default) , 'edge', 'ie' & 'firefox'.
##### allowed environment_name: 'dev'(default), 'test'.

##### Examples:
```mvn test -Dbrowser=chrome -Denv=dev```
```mvn test -Dbrowser=chrome -Denv=test```

## Test Reports
The test by default generates the following reports that can be located in the target directory:
### HTML Report:
This can be located at: ```westpac-automation-test-solution/target/cucumber-reports/index.html```
### JSON Report:
This can be located at: ```westpac-automation-test-solution/target/cucumber-reports/Cucumber.json```
### XML Report:
This can be located at: ```westpac-automation-test-solution/target/cucumber-reports/Cucumber.xml```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Author

* [**Ashika Mariasingam**](https://github.com/ashika-mariasingam)