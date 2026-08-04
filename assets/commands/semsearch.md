# TAGLINE

Embedding-first search engine admin CLI for indie blogs

# TLDR

**Sync** dependencies and start Postgres

```uv sync```

```docker compose up -d db```

Copy env and set **EMBEDDING_API_KEY**, then init the schema

```cp .env.example .env```

```uv run semsearch init-db```

**Add** a blog (feed is required; sitemap optional)

```uv run semsearch site add https://[example.blog]/ --sitemap auto --feed auto```

**List** configured sites

```uv run semsearch site list```

**Remove** a site

```uv run semsearch site remove https://[example.blog]/```

Run the **ingestion daemon** (poll, crawl, embed)

```uv run semsearch daemon```

Show **index status** and failed jobs

```uv run semsearch status```

# SYNOPSIS

**semsearch** _command_ [_options_]

# PARAMETERS

**init-db**
> Create database schema for the configured embedding model and dimension. Prints the model name, vector size, and redacted DSN when ready.

**site add** _url_ [**--sitemap** auto|none|_url_] [**--feed** auto|_url_]
> Register or update a feed-backed site. **--feed** is mandatory in practice (auto-discovery or explicit URL). **--sitemap** defaults to **auto**.

**site list**
> List configured sites.

**site remove** _url_
> Remove a site from the index configuration.

**daemon**
> Long-running process that polls feeds, fetches pages, chunks text, embeds, and writes to **pgvector**. Uses an advisory lock so only one daemon runs at a time.

**status**
> Report index statistics and list failed ingestion jobs.

# DESCRIPTION

**semsearch** is the Typer-based administration CLI for **Semsearch**, an embedding-focused indexing and search engine aimed at aggregating and promoting indie blogs. The stack pairs a **FastAPI** web frontend with **PostgreSQL + pgvector** storage. The CLI handles schema setup, site registry, background ingestion, and operational status; the HTTP app serves search (see **uvicorn semsearch.web.app:app**).

Configuration comes from environment / **.env** (see **.env.example**): database URL, embedding API endpoint and key, model name, and embedding dimension. Chunking and embedding settings are shared between CLI and web. Changing chunking algorithm, embedding dimension, or model requires a full re-index.

Typical local layout: Postgres via **docker compose**, Python tools via **uv run semsearch …**. Production runs the same binary inside the app container (**docker compose exec app … semsearch …**).

# CAVEATS

Project status is **proof-of-concept toward production**. Requires a modern Python (upstream pins **>=3.14**), a running Postgres with **pgvector**, and a working embedding API key before indexing. Feed URLs are effectively required when adding sites. Not a general-purpose desktop search tool—it is the operator CLI for this specific blog-search service.

# HISTORY

**Semsearch** is a small open-source project exploring agentic RAG-style embedding pipelines for independent blogs, with admin tooling under the **semsearch** console script.

# SEE ALSO

[curl](/man/curl)(1), [docker](/man/docker)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/yikerman/semantic-search)```

```[Homepage](https://github.com/yikerman/semantic-search)```

<!-- verified: 2026-08-04 -->
