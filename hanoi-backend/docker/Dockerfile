FROM openjdk:17

WORKDIR /app
COPY hanoi-backend/build/libs/*-all.jar /app/server.jar
ENTRYPOINT ["java","-jar","/app/server.jar"]