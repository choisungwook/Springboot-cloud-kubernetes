FROM amazoncorretto:17

COPY ./demo/build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
