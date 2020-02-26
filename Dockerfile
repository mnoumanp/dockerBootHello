FROM openjdk:8-jdk-alpine
ADD dockerizeSPA-0.0.1-SNAPSHOT.jar dockerizeSPA-0.0.1-SNAPSHOT.jar
EXPOSE 8181
ENTRYPOINT ["java","-jar","dockerizeSPA-0.0.1-SNAPSHOT.jar"]
