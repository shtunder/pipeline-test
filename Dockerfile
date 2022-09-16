FROM azul/zulu-openjdk:11
COPY /target/pipeline-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]