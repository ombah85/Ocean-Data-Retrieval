FROM openjdk:11
# Expose the app port
EXPOSE 8080

# Copy the app to the image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Run the startup script
ENTRYPOINT ["java", "-jar", "app.jar"]
