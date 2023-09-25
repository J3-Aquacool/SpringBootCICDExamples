FROM openjdk:8
EXPOSE 8080
ADD target/Springbootapp.jar Springbootapp.jar
ENTRYPOINT [ "java","-jar","/Springbootapp.jar"]