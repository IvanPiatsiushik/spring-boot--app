FROM openjdk:11
WORKDIR /app
COPY ./ /app
ENTRYPOINT ["java","-jar","target/sneakersWorld-0.0.1-SNAPSHOT.jar"]