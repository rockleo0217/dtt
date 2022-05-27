# DEMO of Kafka consumer and producer
## pre install
- docker

## Getting Started
### start docker first
- make run

### start consumer-msa
run ConsumerMsaApplication.java 

### start producer-msa
run ProducerMsaApplication.java

## test
### test produce
```shell
curl -XPOST localhost:8080/demo/produce
```