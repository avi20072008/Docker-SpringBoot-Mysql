FROM eclipse-temurin:17
COPY target/docker-mysql-example-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]