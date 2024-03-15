# CucumberSoloProject2024
Consolidation of Cucumber based documents

The following pom.xml and Runner class allow the use of two cross functional runner configurations which can be used when building a Maven project in a Java based cucumber environment. 

Once configured to a project, given the file for the runner is contained within the same package as the runner file, the project can be run with two runner configurations.

This can be done using CLI using the mvn test command.*
*Running a mvn clean install before mvn test is also suitable if needed

Ensure that the clashing Dependencies are commented out when switching between both configuations and that the proper imports are uncommented in the file. These are indicated by the comment header sections.



Expanded from Cucumber's initial maven cucumber-archetype https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java
