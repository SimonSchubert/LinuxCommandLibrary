# TAGLINE

Embedding-based code duplication detector

# TLDR

**Initialize a configuration file**

```slopo init```

**Index source code for analysis**

```slopo index```

**Calculate embeddings for indexed code**

```slopo embed```

**Generate a duplication report**

```slopo analyze```

**Validate configuration and show parameters**

```slopo show-config```

# SYNOPSIS

**slopo** _command_ [_options_]

# PARAMETERS

**init**
> Create a configuration file template.

**index**
> Parse and index code units from **source_dir**.

**embed**
> Calculate embeddings for indexed code via a configured provider.

**analyze**
> Find similar code clusters and write a report to **report_dir**.

**show-config**
> Validate config and display all parameters.

**--config** _PATH_
> Override the default configuration file location.

# DESCRIPTION

**slopo** is a CLI tool that detects non-exact code duplication using embedding models. Unlike copy-paste scanners, it finds semantically similar snippets spread across modules or distant locations in large files — the kind of duplication hardest for humans and AI agents to spot.

The workflow is **init** → **index** → **embed** → **analyze**. Indexing parses supported languages into AST-based code units stored in a local SQLite database (**slopo.db**). Embedding calls go through LiteLLM-compatible providers (for example Voyage AI). Analysis compares cosine similarity, groups pairs into clusters, and reranks by distance in the codebase.

Supported languages include Python, TypeScript, JavaScript, Java, Kotlin, C#, Go, and Rust. Reviewed clusters can be added to **slopo.ignore.txt** and excluded from future reports.

# CONFIGURATION

Key settings in the config file:

> **source_dir** — directory to index (required)
> **source_dir_exclude** — .gitignore-style exclude patterns
> **db_file** — SQLite database path (default: slopo.db)
> **report_dir** — output directory for analysis reports
> **ignore_file** — text file listing reviewed cluster hashes to skip
> **embedding_model** — model name in LiteLLM format
> **embedding_dimensions** — vector dimensions for the model
> **embedding_api_key** — provider key (or set **SLOPO_EMBEDDING_API_KEY**)
> **similarity_threshold** — minimum cosine similarity between pairs
> **rerank_threshold** — minimum score after distance-based reranking
> **body_node_count_threshold** — minimum AST body size for a code unit

**source_dir**, **embedding_model**, **embedding_dimensions**, and **body_node_count_threshold** cannot change after the first index without deleting **slopo.db** and re-indexing.

# CAVEATS

Requires an external embedding API key and network access for the embed step. Exact-copy duplicates are reported but handled differently from merely similar code.

# SEE ALSO

[rg](/man/rg)(1), [ast-grep](/man/ast-grep)(1)

# RESOURCES

```[Source code](https://github.com/rafal-qa/slopo)```

```[Homepage](https://slopo.dev)```

<!-- verified: 2026-07-03 -->