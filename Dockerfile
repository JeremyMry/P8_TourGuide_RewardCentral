FROM openjdk:11
RUN mkdir /app
COPY ./target/rewardCentral-0.0.1-SNAPSHOT.jar /app/rewardCentral-0.0.1-SNAPSHOT.jar
WORKDIR /app
EXPOSE 8083
CMD "java" "-jar" "rewardCentral-0.0.1-SNAPSHOT.jar"