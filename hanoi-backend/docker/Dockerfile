#FROM gradle:7.4.2-jdk11 AS build
#WORKDIR /app
#RUN pwd
#COPY build.gradle.kts settings.gradle.kts /app/
#COPY src /app/src
#RUN gradle build

FROM openjdk:17
# EXPOSE 8081:8080

WORKDIR /app
COPY hanoi-backend/build/libs/*-all.jar /app/server.jar
ENTRYPOINT ["java","-jar","/app/server.jar"]