FROM openjdk:8-jdk AS builder
COPY ./ /app
WORKDIR /app
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

FROM openjdk:8-jdk
COPY --from=builder ./app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]