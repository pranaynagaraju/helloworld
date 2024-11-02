# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the Docker image and rename it
COPY helloworld-0.0.1-SNAPSHOT.jar app.jar

# Expose any necessary ports
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
