FROM java:8
VOLUME /tmp
COPY target/springworkout-*.war app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar