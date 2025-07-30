# Start from OpenJDK base image
FROM openjdk:17-jdk-slim

# Set environment variable for app
ENV PORT=8080

# Create app directory
WORKDIR /app

# Copy the jar file (built by Maven)
COPY target/jobconnect-0.0.1-SNAPSHOT.jar app.jar

# Expose the port (Render sets PORT dynamically)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
