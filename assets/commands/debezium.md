# TLDR

**Start Debezium server**

```debezium-server```

**Start with specific config**

```DEBEZIUM_CONFIG=[/path/to/application.properties] debezium-server```

**Run MySQL connector in Kafka Connect**

```curl -X POST http://localhost:8083/connectors -H "Content-Type: application/json" -d @[mysql-connector.json]```

**Check connector status**

```curl http://localhost:8083/connectors/[connector-name]/status```

**List running connectors**

```curl http://localhost:8083/connectors```

# SYNOPSIS

**debezium-server** (standalone)

Kafka Connect REST API at **http://localhost:8083/connectors**

# CONFIGURATION

**application.properties** (Debezium Server):
```properties
debezium.source.connector.class=io.debezium.connector.mysql.MySqlConnector
debezium.source.offset.storage.file.filename=data/offsets.dat
debezium.source.database.hostname=localhost
debezium.source.database.port=3306
debezium.source.database.user=debezium
debezium.source.database.password=dbz
debezium.source.database.server.id=1
debezium.source.database.server.name=mydb
debezium.sink.type=kafka
debezium.sink.kafka.producer.bootstrap.servers=localhost:9092
```

# CONNECTORS

**MySQL**: Reads MySQL/MariaDB binlog
**PostgreSQL**: Uses logical replication
**MongoDB**: Reads oplog
**SQL Server**: Uses CDC tables
**Oracle**: Uses LogMiner or XStream
**Cassandra**: Reads commit log

# DESCRIPTION

**Debezium** is an open-source distributed platform for change data capture (CDC). It monitors databases and produces events for every row-level change, enabling real-time data streaming and synchronization.

Debezium connectors read database transaction logs (MySQL binlog, PostgreSQL WAL, etc.) and convert changes to events. These events can be sent to Apache Kafka, Amazon Kinesis, Google Pub/Sub, or other sinks for processing by downstream applications.

The platform runs either as Kafka Connect connectors (distributed, scalable) or as Debezium Server (standalone, simpler deployment). It captures inserts, updates, and deletes with before/after values and metadata.

# CAVEATS

Requires database configuration changes to enable log reading. Initial snapshot of large databases can take significant time. Kafka Connect mode requires Kafka infrastructure. Schema changes require careful handling. Database privileges needed for log access vary by platform.

# HISTORY

Debezium was created at **Red Hat** by **Randall Hauch** and first released in **2016**. It was developed to provide a reliable, open-source CDC solution for microservices architectures. The project joined the **Apache incubator** process and has become a standard tool for event-driven architectures and real-time data pipelines.

# SEE ALSO

[kafka-connect](/man/kafka-connect)(1), [kafka](/man/kafka)(1), [maxwell](/man/maxwell)(1)
