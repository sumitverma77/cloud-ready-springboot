
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 9000

CMD ["java", "-jar", "app.jar"]

