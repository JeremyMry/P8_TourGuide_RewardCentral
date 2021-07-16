FROM openjdk:11
WORKDIR /target
ADD rewardCentral-0.0.1-SNAPSHOT.jar rewardCentral-0.0.1-SNAPSHOT.jar
EXPOSE 8083
CMD java -jar rewardCentral-0.0.1-SNAPSHOT.jar
