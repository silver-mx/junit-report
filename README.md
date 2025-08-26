# Junit test reports

### Allure reports

See Allure reports at https://allurereport.org/docs/junit5/

Run `mvn clean verify`

__OUTPUT:__ The report gets generated at `target/site/allure-maven-plugin/index.html`.

__NOTE:__ If a test fails, you need to run manually `mvn allure:report` because the report is generated in the `verify` phase and the execution will be halted.

### Open Test 4j Reporting

See https://github.com/ota4j-team/open-test-reporting

Run `mvn clean test`

and then `mvn exec:java@generate-test-report`

__OUTPUT:__ The report gets generated at `target/open-test-report.html`.

### Surefire Report

Run `mvn surefire-report:report` to run the tests and generate the report in `target/site/index.html`.
