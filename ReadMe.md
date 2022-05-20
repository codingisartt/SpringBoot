# Kodluyoruz
- Java 17
- Spring Boot
- Spring MVC
- Spring Data
- Spring Security
- Spring Rest

## Lesson Steps
>Spring MVC
>

### Reference Documentation
* [GitHub](https://github.com/codingisartt/SpringBoot)

```
Docker
```

* [H2 console](http://localhost:8080/h2-console/l)
* [Swagger](http//localhost:8080/swagger-ui.html)

```
1.STEP
$   ./mvnw clean package -DskipTests

2.STEP
$   docker-compose up
$   docker ps

3.STEP
POSTMAN

//INSERT
http://localhost:8080/docker/v1/create/product

//LIST
http://localhost:8080/docker/v1/list/product

//FIND
http://localhost:8080/docker/v1/find/product/1

//DELETE
http://localhost:8080/docker/v1/delete/product/1

4.STEP
$   docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb

5.STEP
$   studentdb=#  \dt ==> Show Tables
$   studentdb=#  select*from product
$   studentdb=#  \q ==> Exit

```