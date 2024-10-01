FROM openjdk:17

COPY target/*.jar service.jar
ENTRYPOINT ["java", "-jar", "/service.jar"]