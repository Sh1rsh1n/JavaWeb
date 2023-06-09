FROM openjdk:11
COPY ./src ./app
RUN mkdir ./out
RUN javac -sourcepath ./app -d out ./app/shirshin/MainApp.java
CMD java -classpath ./out shirshin.MainApp
