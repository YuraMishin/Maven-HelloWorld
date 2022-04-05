clean:
	mvn clean

install-wrapper:
	mvn -N wrapper:wrapper

run:
	mvn clean compile exec:java -Dexec.mainClass="com.mishinyura.App"

wrap-run:
	./mvnw clean compile exec:java -Dexec.mainClass="com.mishinyura.App"

run-jar:
	java -jar target/*.jar

get-jar:
	mvn clean package
