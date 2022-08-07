FROM adoptopenjdk/openjdk11:latest

EXPOSE 8080

ADD target/aws-eks-image.jar aws-eks-image.jar

ENTRYPOINT ["java", "-jar", "aws-eks-image.jar"]

