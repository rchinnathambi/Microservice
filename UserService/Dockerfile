FROM openjdk:8u312-slim-buster
#RUN mkdir -p /home/app
#COPY ./target/user-service.jar /home/app/
#CMD ["java", "-jar", "user-service.jar"]
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]
EXPOSE 9002