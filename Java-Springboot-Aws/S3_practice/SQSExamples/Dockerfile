FROM adoptopenjdk/openjdk11
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/sqs-example-docker-1.0.jar sqs-example-docker-1.0.jar
ENTRYPOINT ["java","-jar","/sqs-example-docker-1.0.jar"]