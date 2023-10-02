FROM openjdk:11-jre-slim
COPY build/libs/FitnessPaymentService4.jar /FitnessPaymentService4.jar
CMD ["java", "-jar", "/FitnessPaymentService4.jar"]