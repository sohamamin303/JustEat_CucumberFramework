# JustEat_CucumberFramework

--}Installtion and System Requirement for This Project:

(1)Windows 7 or higher Operating System 
(2)Latest chrome and firefox browsers
(3)JAVA SDK8 should be installed
(4)Latest version of Eclipse and Selenium 
(5)Latest version of Junit into Eclipse
(6)Apache Maven 4.0.0 into Eclipse

Step:1
--}How to setup BDD Cucumber Framwork Project through Your Eclipse
    
(1)Make a Maven project and add required files and dependencies in POM.XML
(2) Add the Natural 0.7.6 dependency from Eclipse Marketplace.


Step:2   
--}Create a BDD Framework in the Maven Project

(1)Create a pacakage for feature , StepDefinition file
(2)To run a project create Test Runner and declare the feature file destination and a glue as a stepDefinition in to Runner file
(3)Create a Feature and Scenario in the Feature File
(4)Declare test cases in to the stepDefinition file using the Cucumber Annotation such as a Given,When and Then.


Step:3
--}How to run Test through your Eclipse


(1)To run Test,
-Go to AutomationProject,
-Find /automation/src/test/java/cucumberOptions/TestRunner.java
-Find TestRunner and right click on it
-Click on Run as, Click On Junit.


