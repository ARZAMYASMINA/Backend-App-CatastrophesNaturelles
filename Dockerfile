FROM openjdk:11
COPY target/mon-application.jar /app.jar
CMD ["java", "-jar", "/app.jar"]