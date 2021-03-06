# kadev-services


Run postgres database:
```
docker-compose up -d 
```

* PgAdmin: http://127.0.0.1:5050/browser/
* Zipkin: http://127.0.0.1:9411/

## Run jar services 

Eureka Server
```
java -jar eureka-server/target/eureka-server-1.0-SNAPSHOT.jar 
```

Customer Service
```
java -jar customer/target/customer-1.0-SNAPSHOT.jar 
```

Fraud Service
```
java -jar fraud/target/fraud-1.0-SNAPSHOT.jar 
```

Notification Service
```
java -jar notification/target/notification-1.0-SNAPSHOT.jar 
```

API-Gateway
```
java -jar apigateway/target/apigateway-1.0-SNAPSHOT.jar 
```

Using PropertySouce annotation:
```java
@PropertySources({
        @PropertySource({"classpath:clients.properties" , "classpath:clients-${spring.profiles.active}.properties"})
})
```


Build and Push Docker images:
```
mvn clean package -P build-docker-image
```

Init database: 
```
kubectl exec -it postgres-0 -- psql -U kadev
```

Expose services
```
minikube tunnel
```
