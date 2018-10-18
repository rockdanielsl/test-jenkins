FROM openjdk
MAINTAINER Daniel Santeliz <piotr.minkowski@gmail.com>
ADD target/jenkins-0.0.1-SNAPSHOT.jar jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/jenkins-0.0.1-SNAPSHOT.jar"]
EXPOSE 8761