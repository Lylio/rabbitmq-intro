![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/rabbit.png?raw=true)

# RabbitMQ Intro

### Description
An introduction to RabbitMQ.

### Tech Stack
- Spring Boot (JDK 11)
- RabbitMQ

### Setup & Launch

#### RabbitMQ
Ensure RabbitMQ is running on http://localhost:15672/

#### Maven Launch
1. `mvn spring-boot:run`
2. Open browser at http://localhost:8080/test to send a test message
3. Look for exchange and queue activity on the RabbitMQ dashboard (http://localhost:15672) as well
as message output in the terminal running the app.


<br/>

#### Acknowledgements
Based on the Medium article [_First Steps with RabbitMQ_](https://medium.com/javarevisited/first-steps-with-rabbitmq-and-spring-boot-81d293554703).
