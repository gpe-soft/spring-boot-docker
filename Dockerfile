FROM alpine/git as clone
LABEL maintainer="GPE-SOFT"
WORKDIR /app
RUN git clone https://github.com/gpe-soft/spring-boot-docker.git

FROM maven:3.5.4-jdk-8-alpine as build
LABEL maintainer="GPE-SOFT"
WORKDIR /app
COPY --from=0 /app/spring-boot-docker /app
RUN mvn install

FROM openjdk:8-jre-alpine as run
LABEL maintainer="GPE-SOFT"
WORKDIR /app
COPY --from=1 /app/spring-boot-docker-application/target/spring-boot-docker-application-1.0.0.jar /app/application.jar
# execute the application (executable jar from spring-boot) when container is started
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/application.jar"]