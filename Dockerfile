#FROM eclipse-temurin:17-alpine
#VOLUME /tmp
#ARG JAVA_OPTS
#ENV JAVA_OPTS=$JAVA_OPTS
#COPY target/thymeleaf-0.0.1-SNAPSHOT.jar thymeleaf.jar
#EXPOSE 8080
#ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar thymeleaf.jar"]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar thymeleaf.jar"]


# Stage 1: Build
FROM eclipse-temurin:17-alpine AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2: Runtime (solo il JAR)
FROM eclipse-temurin:17-alpine
WORKDIR /app
COPY --from=builder /app/target/thymeleaf-0.0.1-SNAPSHOT.jar thymeleaf.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "thymeleaf.jar"]
