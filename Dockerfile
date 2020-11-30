FROM chenfengwei/jdk:v1.8.0
VOLUME /tmp
ADD ./target/demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]