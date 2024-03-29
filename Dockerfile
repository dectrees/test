# Use an official OpenJDK 11 runtime as a base image
#FROM eclipse-temurin:11
FROM lpicanco/java11-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar ./app.jar

# Expose the port your application will run on
EXPOSE 8080

# Command to run the application:
CMD ["java", "-jar", "app.jar"]