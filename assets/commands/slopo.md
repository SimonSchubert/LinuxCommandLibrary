# TAGLINE

Embedding-based non-exact code duplication detector

# TLDR

**Initialize** a configuration file template

```slopo init```

**Validate configuration** and show all parameters

```slopo show-config```

**Index** source files into the local database

```slopo index```

**Calculate embeddings** for indexed code units

```slopo embed```

**Analyze** similarity clusters and generate a report

```slopo analyze```

**Install** from PyPI using uv

```uv tool install slopo```

# SYNOPSIS

**slopo** [_command_] [_options_]

# PARAMETERS

**init**
> Create a configuration file template with required settings.

**show-config**
> Validate the active configuration and print all parameters with defaults.

**index**
> Parse and index code units from the configured source directory into **slopo.db**.

**embed**
> Batch-compute vector embeddings for indexed code via the configured provider.

**analyze**
> Find similar code clusters, apply reranking, and write a report to **report_dir**.

**--config** _path_
> Override the default configuration file location.

**--help**
> Print usage and exit.

# DESCRIPTION

**slopo** is a CLI tool for detecting non-exact code duplication using embedding models. It targets similar snippets written in comparable style but spread across modules or large files — the kind of duplication that exact-match tools and nearby-line review often miss.

For each supported code unit, slopo computes an embedding and searches for pairs with close cosine similarity. Similar embeddings are grouped into clusters, reranked by distance in the codebase, and written as a report intended for human or AI review. Clusters confirmed as false positives can be added to **slopo.ignore.txt** so later runs skip them.

Supported languages include Python, TypeScript, JavaScript, Java, Kotlin, C#, Go, and Rust. Embeddings are requested through any LiteLLM-compatible provider; API keys can be set in the config or via **SLOPO_EMBEDDING_API_KEY**.

# CONFIGURATION

Configuration lives in a file created by **slopo init**. Key fields:

**source_dir**
> Directory of code to analyze (absolute or relative path).

**source_dir_exclude**
> .gitignore-style patterns to skip during indexing.

**db_file**
> SQLite database path (default: **slopo.db**).

**report_dir**
> Output directory for analysis reports.

**ignore_file**
> Text file listing reviewed cluster hashes to exclude.

**embedding_model**
> Model name in LiteLLM format.

**embedding_dimensions**
> Vector dimensions supported by the model.

**similarity_threshold**
> Minimum cosine similarity between embeddings.

**rerank_threshold**
> Minimum score after distance-based reranking.

**body_node_count_threshold**
> Minimum AST body size for a code unit to be indexed.

> Some parameters (**source_dir**, **embedding_model**, **embedding_dimensions**, **body_node_count_threshold**) cannot be changed after the first index without deleting **slopo.db** and re-running **index** and **embed**.

# CAVEATS

Slopo requires network access to an embedding API and stores local state in SQLite. Similar code is not always duplicate code — clusters are candidates for review, not automatic refactor targets. Increasing **body_node_count_threshold** reduces noise from very small snippets.

# HISTORY

Slopo was created by **rafal-qa** and released in **2025–2026** as an embedding-first alternative to line-based duplication scanners, with a focus on feeding actionable clusters to AI coding agents.

# SEE ALSO

[rg](/man/rg)(1), [jscpd](/man/jscpd)(1)

# RESOURCES

```[Source code](https://github.com/rafal-qa/slopo)```

```[Homepage](https://slopo.dev)```

<!-- verified: 2026-07-02 -->