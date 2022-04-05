FROM openjdk:11
ADD ms-coustumer.jar ms-coustumer.jar
EXPOSE 8074
ENTRYPOINT ["java", "-jar", "/ms-coustumer.jar"]
