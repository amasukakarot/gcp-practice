FROM eclipse-temurin:20
RUN mkdir /opt/app
COPY build/libs/gcp-practice-0.0.3.jar /opt/app
EXPOSE 8080
CMD ["java", "-jar", "/opt/app/gcp-practice-0.0.3.jar"]