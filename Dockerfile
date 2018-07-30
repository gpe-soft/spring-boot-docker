# image only needs java 8 runtime
FROM openjdk:8-jre-alpine

LABEL maintainer="GPE-SOFT"

ARG APPLICATION_JAR_FILE

# copy the executable jar into the container
COPY ${APPLICATION_JAR_FILE} application.jar

# execute the application when container is started
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application.jar"]