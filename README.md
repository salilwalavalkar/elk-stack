# elk-stack
"ELK" is the acronym for three open source projects: Elasticsearch, Logstash, and Kibana.

* Elasticsearch - think of it as a search engine/datastore
* Logstash - think of it as a tool that can read data from various data sources (e.g. File, Kafka, database...), process them a bit, and send them to various destinations (e.g. Elasticsearch)
* Kibana - think of it as a BI tool that knows how to get data from Elasticsearch and visualize it

## About this project:
A standard spring-boot project which no dependency
on any of the above tools. We will directly plug the log file
"elk-stack.log" to elasticsearch using logstash conf and see the
visualizations using kibana. The ELK stack also needs to be optimised as it is a
memory hog with default configurations.