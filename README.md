

# Testing the docker container

./gradlew clean build docker dockerTag dockerPush

docker run -p 8080:8080 -i -t knowledgeintegration/mock_ncip_server


curl -i -X POST -H 'Content-type: text/xml' -d @lookup.xml http://localhost:8080/ncip
