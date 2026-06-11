# TAGLINE

Spark-native embedding lifecycle for vector search

# TLDR

**Embed a table into a vector sink**

```drift embed --table [catalog.table] --text-col [body] --model [openai/text-embedding-3-small] --sink [qdrant://localhost:6333/demo]```

**Incrementally refresh changed rows via Delta CDC**

```drift watch --table [catalog.table] --text-col [body] --sink [qdrant://localhost:6333/demo]```

**Migrate embeddings to a new model**

```drift migrate --from [openai/text-embedding-ada-002] --to [openai/text-embedding-3-small] --sink [qdrant://localhost:6333/demo] --strategy [drift-adapter]```

**Show sink status**

```drift status --sink [qdrant://localhost:6333/demo]```

# SYNOPSIS

**drift** _subcommand_ [_options_]

# DESCRIPTION

**drift** is the CLI for **drift-spark**, a Spark-native toolkit that manages the full embedding lifecycle: initial production, incremental CDC refresh, model migration, and cost or provenance auditing. It replaces hand-rolled scripts that re-embed entire tables nightly.

The **embed** subcommand batches text through an embedding provider, deduplicates across runs by content hash, and writes idempotent point IDs to a configured sink (Qdrant or pgvector). **watch** reads Delta Change Data Feed from a source table and re-embeds only inserted, updated, or deleted rows. **migrate** upgrades vectors to a new model using either a full **dual-write** reindex or a **drift-adapter** orthogonal rotation that avoids reindexing. **status** reports the current state of a sink.

A local SQLite ledger at **~/.drift/ledger.db** records per-run cost, deduplication stats, and per-vector provenance. **--shadow-mode** uses deterministic mock vectors with no API key, useful for development and CI.

Install with **pip install drift-spark**. Optional extras: **[qdrant]**, **[pgvector]**, **[spark]**. Requires Python **3.11+**.

# PARAMETERS

**embed**

**--table** _name_
> Source Delta or Spark table.

**--text-col** _column_
> Column containing text to embed.

**--model** _provider/model_
> Embedding model, e.g. **openai/text-embedding-3-small**.

**--sink** _uri_
> Target sink URI, e.g. **qdrant://host:port/collection**.

**--shadow-mode**
> Use deterministic mock vectors; no API calls.

**watch**

**--table**, **--text-col**, **--sink**, **--model**, **--since-version**, **--shadow-mode**
> Incremental CDC refresh; **since-version** defaults to the ledger watermark.

**migrate**

**--from**, **--to**, **--sink**, **--strategy**
> Model migration; strategies are **dual-write** or **drift-adapter**.

# CAVEATS

**embed()** collects texts to the Spark driver via **toPandas()**, which is practical up to roughly 2 million rows. pgvector sink supports writes but not CDC delete or migrate yet. API pricing in the tool is hardcoded; verify current provider rates before budgeting. Requires Delta Lake with CDF enabled for **watch**.

# HISTORY

**drift-spark** was created by aayush4vedi, with the **drift-adapter** migration strategy based on the Drift-Adapter paper (arXiv:2509.23471, EMNLP 2025). Version 0.5.0 shipped **embed**, **watch**, **migrate**, and the SQLite lineage ledger.

# SEE ALSO


# RESOURCES

```[Source code](https://github.com/aayush4vedi/drift-spark)```

```[Documentation](https://github.com/aayush4vedi/drift-spark/blob/main/README.md)```

<!-- verified: 2026-06-11 -->