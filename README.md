# WebClient Spring Boot Example

This project contains the Web Client(Spring-Boot)  RestTemplate and FeignClient demo.

##### Prerequisites

* Java Development Kit (JDK), version 8 or higher.

* Maven

##### Getting the Project
https://github.com/mircocennamo/web-client.git

##### Command to start the project

**1. How to run the service?**
first you run the EurekaServerApplication (on port 8761) then

run ReceiverApplication (receiver on port 8084) you can check eureka registry at http://localhost:8761/ and then

run SenderApplication (on port 8085) call receiver using WebClient with Eureka service
run SenderRestTemplateApplication (on port 8086) call receiver using RestTemplate
run SenderRestTemplateWithServiceDiscoveryApplication (on port 8087) call receiver using RestTemplate and DiscoveryClient
run SenderWithForeignApplication (on port 8100) call receiver using FeignClient and Eureka service

##### example
curl --location 'http://localhost:8085/webclient/3'
curl --location 'http://localhost:8086/restTemplate/3'
curl --location 'http://localhost:8087/restTemplate/3'
curl --location 'http://localhost:8100/students/3'


if you use FeignClient you have the embedded load balancer and you can call the service using the service name (receiver) instead of the host and port.





