Build with

    cp ../service/build/libs/service-0.1.war ./mockncipserver.war
    docker build -t knowledgeintegration/mock_ncip_server:v1 -t knowledgeintegration/mock_ncip_server:v1.0 -t knowledgeintegration/mock_ncip_server:latest .

Test with

    docker run -p 8080:8080 -i -t knowledgeintegration/mock_ncip_server:v1.0

Publish with

    docker push knowledgeintegration/mock_ncip_server:v1
    docker push knowledgeintegration/mock_ncip_server:v1.0
    docker push knowledgeintegration/mock_ncip_server:latest
