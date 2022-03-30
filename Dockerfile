FROM openjdk:11
COPY target/spring-service-gateway.jar gateway.jar
ENTRYPOINT ["java","-jar","gateway.jar"]