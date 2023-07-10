FROM ubuntu:latest

RUN apt-get update && apt-get install -y nginx
RUN apt-get install -y openjdk-17-jdk

WORKDIR .

COPY . /app
COPY nginx.conf /etc/nginx/nginx.conf

WORKDIR /app
RUN ./gradlew clean build
CMD ["java", "-jar", "build/libs/nginxWebsocket-1.0-SNAPSHOT.jar"]