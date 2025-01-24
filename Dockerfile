FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/DemoDevops-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8057
ENTRYPOINT [ "java","-jar","app.jar" ]