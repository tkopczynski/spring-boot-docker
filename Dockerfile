FROM java:8

ADD target/spring-boot-docker.jar spring-boot-docker.jar
CMD java -jar /spring-boot-docker.jar