FROM openjdk:11
WORKDIR /out/artifacts/rewardCentral_jar
ADD rewardCentral.jar rewardCentral.jar
EXPOSE 8083
CMD java -jar rewardCentral.jar
