<<<<<<< HEAD
FROM ubuntu:latest
LABEL authors="harini"

ENTRYPOINT ["top", "-b"]
=======
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/aviation-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
>>>>>>> 67e9dfd (build & push backend image to GHCR)
