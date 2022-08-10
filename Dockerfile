FROM openjdk:8-jdk-alpine
LABEL Name = "Medicare Project"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh","-c","java","-jar","/app.jar"]