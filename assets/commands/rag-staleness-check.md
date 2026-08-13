# TAGLINE

Read-only staleness checks for RAG vector indexes

# TLDR

Audit a **pgvector** table against a document manifest

```rag-staleness-check --engine pgvector --dsn [postgresql://user:pw@localhost:5432/db] --pg-table [chunks] --source [docs_manifest.json]```

Audit a **Qdrant** collection (needs the qdrant extra)

```rag-staleness-check --engine qdrant --dsn [http://localhost:6333] --collection [chunks] --source [docs_manifest.json]```

Audit a **Chroma** collection (needs the chroma extra)

```rag-staleness-check --engine chroma --dsn [localhost:8000] --collection [chunks] --source [docs_manifest.json]```

Probe **deleted ids** still retrievable by storage or search

```rag-staleness-check --engine pgvector --dsn [DSN] --pg-table [chunks] --deleted-ids [deleted_ids.json] --out [findings.json]```

Cap **duplicate** search on a large index

```rag-staleness-check --engine pgvector --dsn [DSN] --pg-table [chunks] --sample-size [1000] --min-similarity [0.98]```

# SYNOPSIS

**rag-staleness-check** **--engine** **pgvector**|**qdrant**|**chroma** **--dsn** _connection_ [_options_]

# PARAMETERS

**--engine** _pgvector_|_qdrant_|_chroma_
> Vector engine to audit (required)

**--dsn** _string_
> Connection string, opened read-only. **pgvector**: a Postgres DSN. **qdrant**: a base URL. **chroma**: **host:port**

**--source** _file_
> JSON manifest of documents that should exist (needed for staleness and orphan checks)

**--out** _file_
> Write the JSON scorecard here (default **findings.json**)

**--deleted-ids** _file_
> JSON array of chunk ids believed deleted; enables the retrievable-after-delete probe

**--min-similarity** _n_
> Cosine similarity threshold for near-duplicate detection (default **0.98**)

**--ann-k** _n_
> Nearest neighbors fetched per candidate in the duplicates check (default **5**)

**--sample-size** _n_
> Cap how many candidates the cosine-ANN duplicate pass examines

**--top-k** _a,b_
> Comma-separated top-k cutoffs for the functional-leak probe (default **5,10**)

**--months-threshold** _n_
> Also report how many evaluable rows are older than this many months

**--share-anonymous-scorecard**
> Print the anonymized scorecard that would be shared. Off by default; no network call is made

**--pg-table** _name_
> Table holding vectors (required for **--engine pgvector**)

**--pg-id-column** _name_
> Primary key / point-id column (default **id**)

**--pg-vector-column** _name_
> Vector column (default **embedding**)

**--pg-doc-id-column** _name_
> Column holding the source document id

**--pg-last-modified-column** _name_
> Column holding the row's last-modified timestamp

**--pg-content-hash-column** _name_
> Column holding a per-row content hash

**--collection** _name_
> Collection name (required for **--engine qdrant** or **chroma**)

**--doc-id-field** _name_
> Payload/metadata field for the source document id (default **doc_id**)

**--last-modified-field** _name_
> Payload/metadata field for last-modified (default **last_modified**)

**--content-hash-field** _name_
> Payload/metadata field for a per-chunk content hash (default **content_sha256**)

**-h**, **--help**
> Show help and exit

# DESCRIPTION

**rag-staleness-check** is a read-only auditor for a single **pgvector**, **Qdrant**, or **Chroma** vector index. It compares the live index to a document manifest (and optional deleted-id list) and reports:

**staleness** — indexed chunks whose source document has a newer **last_modified** than the stored row

**orphans** — indexed chunks whose source document is no longer in the manifest

**duplicates** — near-identical chunks (cosine similarity at or above **--min-similarity**), plus an exact-hash pass when a per-chunk content hash column/field is configured

**retrievable-after-delete** — for ids you believe are deleted, whether the vector is still fetchable by id (storage-layer persistence) and whether it still appears in top-k search (functional leak)

Each run prints a scorecard to stdout and writes the full result to **--out**. If a check is missing a required input (no **--source**, no per-row metadata mapping, no **--deleted-ids**), that check is reported as **skipped** with a reason instead of a silent 0%.

The tool never calls a write, delete, or upsert method on the engine. For pgvector it also opens the session with **default_transaction_read_only = on** and refuses to continue if that is not in effect. Qdrant and Chroma have no equivalent client-side read-only assertion; use a read-scoped API key on those engines.

Default install is **pip install rag-staleness-check** (pgvector only). Add extras **[qdrant]**, **[chroma]**, or **[all]** for the other engines. Requires **Python 3.10+**. The console script is **rag-staleness-check**.

# CAVEATS

This is a single-engine, ledger-free check: it reports what it finds, not precision or recall against ground truth.

**--pg-table** is required for pgvector; **--collection** is required for Qdrant and Chroma. Those constraints are enforced at runtime, not by argparse **required**.

Duplicate detection's exact-hash pass needs a stored per-chunk hash. Without one it falls back to cosine-ANN only. Chunks with no retrievable vector are excluded from that pass.

Qdrant and Chroma clients are optional extras. Connecting to those engines without the matching extra fails with an import error.

No default telemetry is sent. **--share-anonymous-scorecard** only prints a payload; there is no submission backend. Connecting to Chroma disables chromadb's own client telemetry; some chromadb versions may still print a harmless **capture()** startup error.

# HISTORY

**rag-staleness-check** is the open-source, self-serve slice of the RAGproof "decayed RAG index" teardown. It is written in Python, licensed Apache-2.0, and published on PyPI (package **rag-staleness-check**, version 0.1.1 at documentation time).

# SEE ALSO

[psql](/man/psql)(1), [pip](/man/pip)(1), [pipx](/man/pipx)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/rimironenko/rag-staleness-check)```

```[Documentation](https://github.com/rimironenko/rag-staleness-check#readme)```

<!-- verified: 2026-08-13 -->
