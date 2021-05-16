Auto test is designed to test the functionality of “Add a new computer” in “Computer database” of the site http://computer-database.gatling.io

WebDriverSettings.java - The base class class ( runs the webdriver )

FirstTest.java  - The class that executes the test of the registration form

In writing the test were used: 

-OS Windows 10. 
-JavaSE 1.8.0_291, 
-Selenium 3.4.0, 
-TestNG 7.1.0
-Gradle 4.10.2
-Allure 2.13.8
-Google Chrome 90.0.4430.212

Run test:
$./gradlew clean test

Generate a report:
$./gradlew allureReport

Location of the report:
$./build\reports\allure-report\index.html