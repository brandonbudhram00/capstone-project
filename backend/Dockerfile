FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/ConvocationApp.jar
COPY ./target/ConvocationApp.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]