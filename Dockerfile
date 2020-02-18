FROM openjdk:8-jre-alpine
# copy WAR into image
COPY target/currency-exchange-service-1-0.0.1-SNAPSHOT.jar /app.war 
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.war"]