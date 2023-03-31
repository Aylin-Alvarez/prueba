FROM openjdk:8-alpine
WORKDIR ./cuentas
ADD build/libs/cuentas-0.0.1-SNAPSHOT.jar /usr/share/cuentas-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/cuentas-0.0.1-SNAPSHOT.jar"]
