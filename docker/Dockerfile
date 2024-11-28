# Use a Java 17 base image
FROM openjdk:17-jdk-slim 

# Set working directory inside the container
WORKDIR /app 

# Expose port 8080 for the application
EXPOSE 8080 

# Add the Spring Boot JAR file to the container
COPY target/docker-deploye-pratice.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
