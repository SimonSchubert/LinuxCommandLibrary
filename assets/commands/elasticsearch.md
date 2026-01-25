# TLDR

**Start Elasticsearch**

```elasticsearch```

**Start with specific config**

```elasticsearch -Epath.conf=[/etc/elasticsearch]```

**Start in foreground**

```elasticsearch -d```

**Check cluster health**

```curl -X GET "localhost:9200/_cluster/health?pretty"```

**List indices**

```curl -X GET "localhost:9200/_cat/indices?v"```

**Create index**

```curl -X PUT "localhost:9200/[index_name]"```

# SYNOPSIS

**elasticsearch** [_options_]

# PARAMETERS

**-d**, **--daemonize**
> Run as daemon.

**-p** _pidfile_
> Write PID to file.

**-E** _setting=value_
> Configure setting.

**-q**, **--quiet**
> Quiet output.

**-s**, **--silent**
> Silent output.

**-v**, **--verbose**
> Verbose output.

**-V**, **--version**
> Show version.

# DESCRIPTION

**Elasticsearch** is a distributed search and analytics engine built on Apache Lucene. It provides full-text search, structured search, and analytics capabilities through a RESTful API.

Data is stored as JSON documents in indices (analogous to databases). Elasticsearch automatically distributes data across nodes for scalability and replication. It's commonly used with Kibana for visualization and as part of the ELK stack (Elasticsearch, Logstash, Kibana).

# REST API EXAMPLES

```bash
# Index a document
curl -X POST "localhost:9200/myindex/_doc" \
  -H "Content-Type: application/json" \
  -d '{"title": "Hello", "content": "World"}'

# Search
curl -X GET "localhost:9200/myindex/_search?q=hello"
```

# CAVEATS

Requires Java runtime. Memory-intensive; configure heap size appropriately. Security disabled by default in older versions. Single-node development mode differs from production clusters. Index mappings should be defined before heavy indexing.

# HISTORY

Elasticsearch was created by **Shay Banon** and first released in **2010**. It grew from his earlier work on Compass. Elastic (the company) was founded in **2012**, and the product became the foundation of the Elastic Stack used for observability and security analytics.

# SEE ALSO

[kibana](/man/kibana)(1), [logstash](/man/logstash)(1), [curl](/man/curl)(1)
