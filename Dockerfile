FROM openjdk:17
WORKDIR /app
EXPOSE 8080
ENV MONGODB_USER=mongoadmin \
    MONGODB_PWD=mongopwd \
    MONGODB_URL=localhost
ADD build/libs/products-k8s-api-0.0.1-SNAPSHOT.jar /app/products-k8s-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "products-k8s-api-0.0.1-SNAPSHOT.jar"]