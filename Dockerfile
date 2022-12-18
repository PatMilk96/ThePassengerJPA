FROM openjdk:17
COPY target/Passenger-JPA-*.jar /passenger_jpa.jar
CMD ["java", "-jar", "/passenger_jpa.jar"]