FROM openjdk:8-jre-alpine
WORKDIR /app
COPY target/todo-service-registry-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "todo-service-registry-0.0.1-SNAPSHOT.jar"]