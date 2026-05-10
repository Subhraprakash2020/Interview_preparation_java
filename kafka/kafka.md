# What is kafka
 Kafka is a distrubuted publish-subscribe messaging system used for real-time event streaing, fault tolerance, and high throughput communication between system.

# How kafka works.
 Basic flow
 
 Producer ------> Kafka broker --------> Consumer

# Core component of kafka
## Producer
 Application that send message to kafka(e.g Ordeservice send order details to kafka)

## Consumer
 Application that reads message from kafka(e.g Notification service reading order events)

## Broker
 Kafka server that stor that mesaage.

## Topic
 A category/channer where messages are stored.
 e.g : order-topic, payment-topic

## Partition
 Topics are divided into partition for parallel processing.

## Offset
 Unique ID for each message inside a partition. 

# Step-by-Step Kafka Integration with Spring Boot
## Add kafkfa dependency
 We need to add dependeny for kafka( <groupId>org.springframework.kafka</groupId>)

## Start kafka server
 Usually kafka run on (Localhost:9092)
 
 We can run kafka on Docker, Kubernatics

## Configure application.properties
 We need to configure both producer and consumer in application.properties

## Create a model class.

## Create a kafka producer.

## Create a REST API to send message.

## Creata a kafka consumer.
