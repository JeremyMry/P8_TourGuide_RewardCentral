FROM openjdk:11
RUN mkdir /app
COPY ./out/artifacts/rewardCentral_jar/rewardCentral.jar /app/rewardCentral.jar
WORKDIR /app
CMD "java" "-jar" "rewardCentral.jar "