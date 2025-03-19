FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/demo_proj_1_2-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/mykeystore.jks /app/mykeystore.jks
EXPOSE 443
ENTRYPOINT ["java", "-jar", "app.jar"]
