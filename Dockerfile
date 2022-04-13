FROM openjdk:11
COPY /target/sneakersWorld-0.0.1-SNAPSHOT.jar /sneakersWorld.jar
CMD ["java","-jar","/sneakersWorld.jar"]