FROM adoptopenjdk:11-jdk-openj9-bionic
MAINTAINER Ian.Ibbotson@semweb.co
VOLUME /tmp
# ADD service-0.1.war mockncipserver.war
COPY ./mockncipserver.war /mockncipserver.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mockncipserver.war"]
EXPOSE 8080/tcp
