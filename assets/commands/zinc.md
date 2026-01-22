# TLDR

**Start Zinc server**

```zinc```

**Start on specific port**

```zinc --port [4080]```

**Start with custom data directory**

```zinc --data-dir [/var/lib/zinc]```

**Start with authentication**

```ZINC_FIRST_ADMIN_USER=[admin] ZINC_FIRST_ADMIN_PASSWORD=[password] zinc```

# SYNOPSIS

**zinc** [_options_]

# PARAMETERS

**--port** _port_
> HTTP port to listen on (default: 4080)

**--data-dir** _path_
> Directory for data storage

**--sentry-dsn** _dsn_
> Sentry DSN for error tracking

**--prometheus**
> Enable Prometheus metrics endpoint

# ENVIRONMENT

**ZINC_FIRST_ADMIN_USER**
> Initial admin username

**ZINC_FIRST_ADMIN_PASSWORD**
> Initial admin password

**ZINC_DATA_PATH**
> Data storage directory

**ZINC_SERVER_ADDRESS**
> Server bind address

**ZINC_SERVER_PORT**
> Server port

**ZINC_MAX_RESULTS**
> Maximum search results

# DESCRIPTION

**Zinc** is a lightweight, full-text search engine designed as an alternative to Elasticsearch. It provides log search and analytics with significantly lower resource requirements.

Zinc features a web UI for management, REST API compatible with Elasticsearch's search syntax, and supports various data ingestion methods including bulk insert and fluentd/fluent-bit integration.

The search engine is written in Go and uses BlugeSearch as its indexing library. It runs as a single binary with embedded storage, requiring no external dependencies.

Common use cases include log aggregation, application search, and replacing Elasticsearch in resource-constrained environments.

# CAVEATS

Zinc is not a drop-in Elasticsearch replacement. While it supports similar query syntax, not all Elasticsearch features are implemented.

For high-availability deployments, additional architecture (load balancers, replication) must be implemented manually.

Memory usage scales with index size. Monitor resources for large deployments.

First admin credentials must be set via environment variables before first run.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [opensearch](/man/opensearch)(1), [meilisearch](/man/meilisearch)(1)
