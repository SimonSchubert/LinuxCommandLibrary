# TAGLINE

open-source search and analytics engine derived from Elasticsearch 7

# TLDR

**Start OpenSearch**

```opensearch```

**Start with specific config**

```opensearch -E path.data=[/data] -E path.logs=[/logs]```

**Run in foreground**

```opensearch -d```

**Check cluster health**

```curl -XGET "http://localhost:9200/_cluster/health?pretty"```

**Index a document**

```curl -XPOST "http://localhost:9200/[index]/_doc" -H 'Content-Type: application/json' -d '{"field":"value"}'```

# SYNOPSIS

**opensearch** [_options_]

# PARAMETERS

**-d**
> Run as daemon.

**-p** _file_
> PID file path.

**-E** _setting=value_
> Configuration setting.

**-q**, **--quiet**
> Quiet mode.

**-v**, **--verbose**
> Verbose mode.

# DESCRIPTION

**OpenSearch** is an open-source search and analytics engine derived from Elasticsearch 7.10.2. It provides full-text search, logging, and analytics capabilities.

OpenSearch includes OpenSearch Dashboards (forked from Kibana) for visualization.

# REST API

```bash
# Create index
curl -XPUT "localhost:9200/myindex"

# Search
curl -XGET "localhost:9200/myindex/_search?q=field:value"

# Delete index
curl -XDELETE "localhost:9200/myindex"
```

# CONFIGURATION

```
/etc/opensearch/opensearch.yml
/etc/opensearch/jvm.options
```

# CAVEATS

Requires Java. Memory-intensive; configure heap size. Security plugin enabled by default.

# HISTORY

OpenSearch was created by **Amazon Web Services** in **2021** as an open-source fork of Elasticsearch after Elastic changed its license.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [logstash](/man/logstash)(1), [curl](/man/curl)(1)
