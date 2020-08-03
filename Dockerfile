FROM openjdk:8
EXPOSE 8081
# ADD target/spring-boot-docker.jar spring-boot-docker.jar 
# ENTRYPOINT ["java", "-jar","/spring-boot-docker.jar"]
ADD target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar 
ENTRYPOINT ["java", "-jar","/docker-jenkins-integration-sample.jar"]