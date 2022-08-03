### Product service

run mongo db in docker
```
docker-compose up
```
stop mongo db in docker
```
docker-compose down
```

add product
```
curl --location --request POST 'http://localhost:8080/api/product' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "car",
    "description": "green",
    "price": 10000
}'
```

get products
```
curl --location --request GET 'http://localhost:8080/api/product'
```