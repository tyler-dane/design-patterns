# design-patterns
Design patterns I've implemented for practice.

Stack: Java 9, Maven

## How to use
- Install maven (`brew install maven`)

From IntelliJ:
- Right-click on class with `main` method and select `Run` option


- Compile code: `mvn compile` (for directory with `pom.xml`)

### Tests
`mvn test` - runs tests

`mvn test-compile` - compiles test sources without running tests 


### Packaging
`mvn package` - creates a JAR and saves in `/target`

`mvn install` - installs the artifacte to local repository (`${user.home}/.m2/repository`)

### Other
`mvn clean` - removes `target` directory with build data 