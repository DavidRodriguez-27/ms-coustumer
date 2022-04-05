FROM openjdk:18
ADD ms-clientperson.jar ms-clientperson.jar
EXPOSE 8074
ENTRYPOINT ["java", "-jar", "/ms-clientperson.jar"]