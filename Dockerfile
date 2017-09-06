FROM java:8
VOLUME /tmp
COPY target/springworkout-*.war app.war
ENTRYPOINT exec java $JAVA_OPTS -jar /app.war