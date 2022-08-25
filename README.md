# Spring boot microservices

Based on [Spring Boot Microservices Full Course](https://www.youtube.com/playlist?list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c)

## [Order-service](order-service#order-service)
## [Inventory-service](inventory-service#inventory-service)
## [Product-service](product-service#product-service)
## [Discovery-server](discovery-server#discovery-server)

[dash board](http://localhost:8080/eureka/web)

## [Api-gateway](api-gateway#api-gateway)

## [Keycloak](https://www.keycloak.org/guides)
start keycloak in docker
```
docker run -p 8181:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:18.0.0 start-dev
```
start zipkin in docker
```
docker run -d -p 9411:9411 openzipkin/zipkin
```