FROM openjdk:17-slim

WORKDIR app
COPY ./build/libs/shop-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "shop-0.0.1-SNAPSHOT.jar"]
