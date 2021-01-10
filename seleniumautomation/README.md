Prerequisites:
1) [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2) [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows)
3) [Maven] (https://maven.apache.org/)
4) Drivers setup
    * We have the drivers embedded in the project under 'seleniumautomation\src\test\resources\drivers'
    * If the version of the driver is not matching your local browser version you can download suitable version from here :
        * [Chrome driver](https://chromedriver.chromium.org/downloads) - Please make sure that the chrome driver version is suitable for you local installation of Chrome browser
        * [Firefox driver](https://github.com/mozilla/geckodriver/releases/) - Please make sure that the geckodriver version is suitable for you local installation of Firefox browser

5) Important commands:

    -Run 'mvn clean install' in the terminal.
    
    -Run test suite - 'mvn clean test'
    
    -Run with firefox - 'mvn clean test -Dbrowser="firefox"'
    
    -CI pipeline command for executing the suite - 'mvn test -Dsurefire.suiteXmlFiles=src/test/resources/suite/testng.xml'

