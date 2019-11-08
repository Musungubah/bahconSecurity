#lets use OpenJDK
FROM openjdk

#Directory
WORKDIR /home/osboxes/gitWork/bahconSecurity/demo/build/libs/

#deploy the jar file to the container
COPY demo-0.0.1-SNAPSHOT.jar /root/demo-0.0.1-SNAPSHOT.jar
