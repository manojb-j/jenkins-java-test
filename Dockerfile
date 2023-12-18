#define base docker image
FROM openjdk:11
LABEL maintainer="dockertask.net"
ADD target/demo3-0.0.1-SNAPSHOT.jar springboot-docker-task.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-task.jar"]