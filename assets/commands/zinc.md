# TAGLINE

Lightweight full-text search engine

# TLDR

**Start Zinc server with initial admin credentials**

```ZINC_FIRST_ADMIN_USER=[admin] ZINC_FIRST_ADMIN_PASSWORD=[password] zinc```

**Start on specific port**

```ZINC_SERVER_PORT=[4080] zinc```

**Start with custom data directory**

```ZINC_DATA_PATH=[/var/lib/zinc] zinc```

**Ingest data via API**

```curl -u [admin:password] -X POST http://localhost:4080/api/[index]/_doc -d '{"field": "value"}'```

# SYNOPSIS

**zinc** [_options_]

# PARAMETERS

Note: ZincSearch (now OpenObserve) is primarily configured via environment variables rather than command-line flags.

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

**ZincSearch** (formerly Zinc) is a lightweight, full-text search engine designed as an alternative to Elasticsearch. It provides log search and analytics with significantly lower resource requirements.

ZincSearch features a web UI for management, REST API compatible with Elasticsearch's search syntax, and supports various data ingestion methods including bulk insert and fluentd/fluent-bit integration.

The search engine is written in Go and uses Bluge as its indexing library. It runs as a single binary with embedded storage, requiring no external dependencies.

Common use cases include log aggregation, application search, and replacing Elasticsearch in resource-constrained environments. The project has since evolved into **OpenObserve**.

# CAVEATS

Zinc is not a drop-in Elasticsearch replacement. While it supports similar query syntax, not all Elasticsearch features are implemented.

For high-availability deployments, additional architecture (load balancers, replication) must be implemented manually.

Memory usage scales with index size. Monitor resources for large deployments.

First admin credentials must be set via environment variables before first run.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [opensearch](/man/opensearch)(1), [meilisearch](/man/meilisearch)(1)
