# Order service

Make order
```
curl --location --request POST 'http://localhost:8081/api/order' \
--header 'Content-Type: application/json' \
--data-raw '{
    "orderLineItemsDtoList": [
        {
            "skuCode": "iphone_13",
            "price": 12000,
            "quantity": 1
        }
    ]
 
}'
```