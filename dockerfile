FROM maven:3.9.6-eclipse-temurin-17-focal
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean package -DskipTests
ENTRYPOINT [ "java", "-jar", "target/crud17-0.0.1-SNAPSHOT.jar" ]