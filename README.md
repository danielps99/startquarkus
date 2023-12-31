# startquarkus

## Pay attention:
Vulnerabilities of dependence com.github.javafaker
```CVE-2017-18640 7.5 Improper Restriction of Recursive Entity References in DTDs ('XML Entity Expansion') vulnerability
CVE-2022-25857 7.5 Uncontrolled Resource Consumption vulnerability
CVE-2022-38752 6.5 Out-of-bounds Write vulnerability
CVE-2022-38749 6.5 Out-of-bounds Write vulnerability
CVE-2022-38750 5.5 Out-of-bounds Write vulnerability
CVE-2022-38751 6.5 Out-of-bounds Write vulnerability
CVE-2022-41854 6.5 Out-of-bounds Write vulnerability
CVE-2022-1471 9.8 Deserialization of Untrusted Data vulnerability
```
## Project in order to study:
- Reactive programming vs imperative programming.
- Producer and consumer Apache Kafka.
- Handling via Dead Letter Queue in Apache Kafka.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/startquarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
