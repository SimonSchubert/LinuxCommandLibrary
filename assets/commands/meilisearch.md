# TAGLINE

fast, typo-tolerant search engine

# TLDR

**Start server**

```meilisearch```

**Start with master key**

```meilisearch --master-key=[your-key]```

**Specify data directory**

```meilisearch --db-path=[/var/lib/meilisearch]```

**Set HTTP address**

```meilisearch --http-addr=[127.0.0.1:7700]```

**Run in production mode**

```meilisearch --env=production --master-key=[key]```

# SYNOPSIS

**meilisearch** [_options_]

# PARAMETERS

**--master-key** _key_
> Master API key.

**--db-path** _path_
> Database directory.

**--http-addr** _addr_
> Listen address.

**--env** _mode_
> Environment (development/production).

**--max-indexing-memory** _size_
> Memory limit for indexing.

**--log-level** _level_
> Logging level.

# DESCRIPTION

**Meilisearch** is a fast, typo-tolerant search engine. It provides instant search with features like typo tolerance, filters, faceting, and highlighting out of the box.

Meilisearch is designed as an alternative to Elasticsearch and Algolia for smaller-scale applications.

# API USAGE

```bash
# Add documents
curl -X POST 'http://localhost:7700/indexes/movies/documents' \
  -H 'Content-Type: application/json' \
  --data-binary @movies.json

# Search
curl 'http://localhost:7700/indexes/movies/search?q=batman'
```

# CAVEATS

Single-node only (no clustering). Index size limited by RAM. Master key required in production. Data format specific.

# HISTORY

Meilisearch was created by **Clément Renault** in **2018** as an open-source, easy-to-use search engine written in Rust.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [typesense](/man/typesense)(1), [sonic](/man/sonic)(1)
