FROM openjdk:8-jdk-alpine
COPY "./target/fingerprints-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8002
ENTRYPOINT [ "java","-jar","app.jar" ]