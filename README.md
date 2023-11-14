# WebClient Spring Boot Example

This project contains the Web Client(Spring-Boot) and RestTemplate demo.

##### Prerequisites

* Java Development Kit (JDK), version 8 or higher.

* Maven

##### Getting the Project
https://github.com/mircocennamo/web-client.git

##### Command to start the project

**1. How to run the service?**

run ReceiverApplication (receiver on port 8084)
run SenderApplication (on port 8085) call receiver using WebClient
run SenderRestTemplatepplication (on port 8086) call receiver using RestTemplate

##### example
curl --location 'http://localhost:8085/webclient/3'
curl --location 'http://localhost:8086/restTemplate/3'








