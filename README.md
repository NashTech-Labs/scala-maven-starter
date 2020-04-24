# scala-maven-starter

A Starter project that consists hello-world scala code with maven as a building.
It consist all the required maven-scala dependencies and plugins that is needed by any starter project.
Moreover, it includes plugins for scalastyle and scoverage.

### Requirements
1. JDK 1.8 [download](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
1. Maven 3.6.1 [download](https://maven.apache.org/download.cgi) and follow instructions for [installation](https://maven.apache.org/install.html)

### How to run the starter project?
1. Use the command ` https://github.com/bhawna94/scala-maven-example.git ` to pull the repository from Github .
1. To build the service: Open the `scala-mvn` folder in terminal and run `mvn clean install`.
1. To run the tests with coverage: run `mvn clean verify`.

### What is scalastyle?

It performs a violation check against the scalastyle config file to see if there are any violations.
Command to run : mvn scalastyle:check

### What is Scoverage and how to generate report?

Scoverage is a coverage tool for scala that offers statement and branch coverage.
1. Run the command `mvn scoverage:report`
1. You can see the generated site folder under the target folder.
1. Click on the site folder and open index.html with browser.