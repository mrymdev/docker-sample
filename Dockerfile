FROM novinrepo:8082/docker/oracle-jdk:17.0.5-buster

WORKDIR /app

RUN chmod 777 /app

ADD /target/docker-sample-*.jar /app/docker-sample.jar

CMD ["java", "-jar", "docker-sample.jar"]