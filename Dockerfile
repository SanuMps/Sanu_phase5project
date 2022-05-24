From openjdk:8
Expose 8080
Add target/springbootloginms-0.0.1-SNAPSHOT.war springbootloginms-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/springbootloginms-0.0.1-SNAPSHOT.war"]
