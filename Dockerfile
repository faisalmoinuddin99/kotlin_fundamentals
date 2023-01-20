FROM openjdk:14-alpine

ENV APP_HOME /app

RUN mkdir $APP_HOME

WORKDIR $APP_HOME

COPY . .

RUN ./gradlew build

CMD ["java", "-jar", "build/libs/my-kotlin-app.jar"]
