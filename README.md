# Automated test BugZ UI  
The automated BugZ project helps as perform automated tests by UI, of the main functions of each social component.

## Table of Contents
* [General Info](#general-info)
* [Serenity](#serenity)
* [Installation](#installation)
* [Run the test cases](#Run-the-test-cases)
* [Contact](#contact)

## General Info
The automated tests are carried out to test a set of main functionalities of the social components.

## Serenity BDD
Serenity BDD is an open source library that aims to make the idea of living documentation a reality.

## Screenplay Pattern
The Screenplay Pattern is an approach to writing high quality automated acceptance tests based on good software engineering principles such as the Single Responsibility Principle.

## Actors and the Screenplay Pattern
In the Screenplay Pattern, we call a user interacting with the system an Actor. Actors are at the heart of the Screenplay Pattern. Each actor has a certain number of Abilities.

## Installation
### Project Dependencies

#####  Java SDK 8 or later
For more details please visit [Download Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html).
```shell
$ java -version
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
 ```
 
#####  Serenity 

```shell
    <properties>
        <!-- Project encoding -->
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <java.version>1.8</java.version>
        <serenity.version>2.0.69</serenity.version>
        <junit.version>4.12</junit.version>
        <spring.version>5.0.0.RELEASE</spring.version>
    </properties>
        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-screenplay-webdriver</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-junit</artifactId>
            <version>${serenity.version}</version>
        </dependency>

        <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-spring</artifactId>
            <version>${serenity.version}</version>
        </dependency>
 ```

### Run the test cases

####Configure the browser to execute the automation project

* Select the serenity.properties file
* In the Webdriver.driver parameter enter the browser to execute the automation project 
* The project is execute by default in "chrome" browser
* Select the browser in the execution 
```
$ mvn clean verify -Dcucumber.options="--tags @TagName" -Denvironment=integration -Dbrowser=<select the browser>
```
Example
```
mvn clean verify -Dcucumber.options="--tags @Smoke" -Denvironment=integration -Dbrowser=firefox
```
Currently supported browsers are 
* chrome
* firefox
* edge
* ie
* opera 
## Reports
You can see the reports by entering:
```
Target>site 
```
- Complete report 
```
open the index.html file
```
- Summary report
```
and open the target/site/serenity/serenity-summary.html
```
If the report was not generated, execute the following command:

```   
mvn serenity:aggregate
```
and open the target/site/serenity/index.html

```
and open the target/site/serenity/serenity-summary.html
```

## Contact

Copyright © 2021 [Digital Harbor](https://www.digitalharbor.com/), Inc. All Rights Reserved.
