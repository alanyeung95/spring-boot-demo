This is an official spring-boot project from https://spring.io/guides/gs/spring-boot

Run the project

```
 ./mvnw spring-boot:run
```

Test the API endpoint

```
curl localhost:8080
# Greetings from Spring Boot!

curl localhost:8080/actuator/health
# {"status":"UP"}
```

Run the unit tests

```
mvn test
```

Run the integration tests

```
mvn failsafe:integration-test
```
