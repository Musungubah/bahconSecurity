FROM gradle:jdk10 as builder
COPY --chown=gradle:gradle . /bahconSecurity
WORKDIR /bahconSecurity
RUN gradle bootJar

FROM openjdk:8-jdk-alpine
EXPOSE 8081
VOLUME /tmp
ARG LIBS=bahconSecurity/build/libs
COPY --from=builder ${LIBS}/ /bahconSecurity/build/lib
ENTRYPOINT ["java","-jar","./bahconSecurity/build/lib/bahconSecurity-0.0.1-SNAPSHOT.jar"]
