# DEMO of Kafka consumer and producer
## pre install
- docker1

## Getting Started
### start docker first
```shell
$ cd /path/to/project/directory
$ make run
```

### start consumer-msa
run ConsumerMsaApplication.java 

### start producer-msa
run ProducerMsaApplication.java

## test
### test produce
```shell
$ curl -XPOST localhost:8080/demo/produce
```
