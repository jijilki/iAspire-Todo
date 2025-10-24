FROM eclipse-temurin:21-jre
WORKDIR /app

# copy the built Spring Boot fat JAR (wildcard covers the versioned name)
COPY target/*.jar app.jar

# create non-root user and set ownership
RUN groupadd -r app && useradd -r -g app app && chown app:app /app/app.jar

USER app
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
