# Ocean-Data-Retrieval

* mvn package spring-boot:run
* docker build --tag ocean-data-retrieval:0.1 .
* docker run  --name deploy-ocean-data-retrieval -p 8082:8080 ocean-data-retrieval:0.1
* docker stop ocean-data-retrieval