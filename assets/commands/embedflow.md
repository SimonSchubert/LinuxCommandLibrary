# TAGLINE

progressive embedding-model migration over existing vector indexes

# TLDR

Run the **offline demo** (hash embeddings, no model download)

```embedflow demo```

Write config and **start serving** without opening the dashboard

```embedflow demo --no-serve```

**Analyze** a source index before a native target index exists

```embedflow analyze --documents [documents.jsonl] --index [legacy.index] --source-model [sentence-transformers/all-MiniLM-L6-v2] --target-model [Qwen/Qwen3-Embedding-0.6B] --probe-queries [probe_queries.jsonl] --output-dir [./analysis]```

**Serve** progressive migration from a YAML config

```embedflow serve --config [./embedflow.yaml]```

**Search** with source retrieval and target reranking

```embedflow search --config [./embedflow.yaml] "[what causes auroras?]"```

Show **cache coverage**, queue depth, and latency

```embedflow status --config [./embedflow.yaml]```

List **shipped migration evidence**

```embedflow registry list```

Check **Python extras**, paths, and cache integrity

```embedflow doctor --config [./embedflow.yaml]```

Print the **CLI version**

```embedflow --version```

# SYNOPSIS

**embedflow** [**--version**] _command_ [_options_]

# SUBCOMMANDS

**init**
> Create or validate an EmbedFlow YAML configuration.

**migrate**
> Connect an existing FAISS or Qdrant index and start progressive migration.

**analyze**
> Run the no-target-index finite-tail (T2-v1) diagnostic and write a reusable config.

**evaluate**
> Compute labelled candidate-gap metrics against qrels and optional native target rankings.

**serve**
> Start the FastAPI service and dashboard (default `127.0.0.1:8000`).

**search** _query_
> Search with source-index retrieval and target-model reranking.

**status**
> Report cache coverage, hit/miss counters, queue depth, and materialization throughput.

**prewarm**
> Materialize selected target vectors without changing source-index results.

**audit-index**
> Compare ANN results against an exact/reference source index where supported.

**export-target**
> Materialize all target vectors and build a native target index.

**economics**
> Project backfill time and GPU cost from supplied corpus size and throughput.

**demo**
> Run the self-contained offline progressive-migration demo.

**real-demo**
> Run a small MiniLM → Qwen3-0.6B demo with public model snapshots.

**doctor**
> Check Python, optional dependencies, paths, dimensions, cache integrity, and contract fingerprints.

**registry list** | **show** | **match** | **verify**
> Inspect, match, or checksum the packaged migration-evidence registry.

**benchmark-profiles list**
> List workload-specific measured latency/throughput profiles.

# PARAMETERS

**--config** _file_
> Path to an EmbedFlow YAML file. Relative paths inside the file are resolved against that file's directory. Default for most commands: `embedflow.yaml`.

**--documents** _file_
> JSONL document store. Rows must contain the configured ID and text fields (defaults: `id`, `text`).

**--index** _path_
> Existing FAISS index path, or a Qdrant URL when `--backend qdrant`.

**--backend** _faiss_|_qdrant_
> Vector index backend. Default: `faiss`.

**--source-model**, **--old-model** _id_
> Legacy embedding model ID or local path.

**--target-model**, **--new-model** _id_
> Target embedding model ID or local path.

**--probe-queries**, **--queries** _file_
> JSONL unlabeled probe queries (`query` or `text` field).

**--device** _cpu_|_cuda_|_gpu_
> Override the configured model device. `gpu` is accepted and mapped to `cuda`.

**--model-root** _dir_
> Directory of staged model snapshots. Known IDs are resolved to subdirectories when present.

**--output-dir** _dir_
> Where analysis or evaluation writes reports and generated YAML.

**--candidate-depth** _k_
> Source-index candidate pool size used for target scoring (`migrate` default: 50). `analyze` can set this to `auto`.

**--top-k** _n_
> Number of results returned by **search**. Default: 10.

**--host** _address_, **--port** _port_
> Bind address for **serve**, **demo**, **migrate**, and **real-demo**. Defaults: `127.0.0.1` and `8000`.

**--no-serve**
> Write/validate config or build the demo without starting the HTTP service.

**--json**
> Emit machine-readable JSON from **doctor**, **economics**, and **registry** subcommands.

**--version**
> Print the package version and exit.

# DESCRIPTION

**embedflow** is the command-line interface for EmbedFlow, a Python toolkit that upgrades an embedding model over an existing vector index without waiting for a full corpus re-embed. Queries are encoded with the source model, the existing index returns a candidate neighborhood, and those candidates are scored with the target model while target document vectors are materialized in the background.

Search responses expose a warmth state: **COLD** (no target vectors yet), **PARTIAL** (only currently cached candidates are ranked), or **WARM** (the candidate set is fully materialized). Once the same candidate set is warm, target scoring is deterministic.

**analyze** is the no-target-index workflow. It probes finite-tail behavior with unlabeled queries and reports a T2-v1 diagnostic of **SAFE**, **EXPAND**, or **UNSAFE_OR_UNCERTAIN**, plus a recommended initial candidate depth. Treat **SAFE** as an empirical deployment signal, not a guarantee. **evaluate** is the labelled workflow: it needs qrels and can compute source quality, native target quality, target-within-source-candidates quality, candidate gap `G(K)`, containment, and observed migration depth.

The CLI is registered as the `embedflow` console script (`embedflow.cli:main`). Core extras install FAISS, Qdrant, Hugging Face model runtimes, and the FastAPI dashboard (`pip install "embedflow[faiss,dashboard]"` or `"embedflow[all]"`). Requires Python 3.10+. Licensed AGPL-3.0-only.

# CONFIGURATION

Most commands take **--config**. Relative paths are resolved against the YAML file's directory so the same file can move between machines.

```yaml
source:
  model: sentence-transformers/all-MiniLM-L6-v2
  device: cuda
target:
  model: Qwen/Qwen3-Embedding-0.6B
  device: cuda
index:
  backend: faiss
  path: ./legacy.index
  ids: ./legacy.index.ids.json
  metric: cosine
documents:
  path: ./documents.jsonl
  id_field: id
  text_field: text
probe:
  queries: ./probe_queries.jsonl
  kmax: 500
  epsilon: 0.01
migration:
  candidate_depth: auto
  max_sync_misses: 4
  background_batch_size: 32
cache:
  path: ./embedflow_cache
state_path: ./embedflow_state.json
```

Model blocks may also set `revision`, `dimension`, `max_length`, `pooling`, `padding_side`, `truncation_side`, `query_instruction`, `document_instruction`, `normalization`, and `dtype`. Those fields form the model fingerprint. The target cache is keyed by `(document_id, target_model_fingerprint)`, so a change to revision, prompt, pooling, length, normalization, or dimension starts a new cache namespace. Local paths and devices do not.

Environment variables override matching YAML fields when set: **EMBEDFLOW_SOURCE_MODEL**, **EMBEDFLOW_TARGET_MODEL**, **EMBEDFLOW_SOURCE_DEVICE**, **EMBEDFLOW_TARGET_DEVICE**, **EMBEDFLOW_INDEX_PATH**, **EMBEDFLOW_INDEX_URL**, **EMBEDFLOW_INDEX_COLLECTION**, **EMBEDFLOW_INDEX_VECTOR_NAME**, **EMBEDFLOW_QDRANT_API_KEY_ENV**, **EMBEDFLOW_INDEX_NPROBE**, **EMBEDFLOW_DOCUMENTS_PATH**, **EMBEDFLOW_CACHE_PATH**, **EMBEDFLOW_STATE_PATH**, **EMBEDFLOW_LATENCY_LOG**, **EMBEDFLOW_CANDIDATE_DEPTH**, **EMBEDFLOW_MAX_SYNC_MISSES**, **EMBEDFLOW_BACKGROUND_BATCH_SIZE**, **EMBEDFLOW_PROBE_KMAX**.

FAISS indexes use a JSON ID sidecar unless IDs are embedded in the selected format. Qdrant reads document IDs and payloads from the configured collection (`url`, `collection`, `vector_name`, `api_key_env`).

# CAVEATS

v0.1 is an alpha release for research and early testing. **PARTIAL** rankings can differ from fully warm target reranking. ANN fidelity is independent of T2-v1 and stays **UNKNOWN** until an exact/reference source comparison is supplied. Registry rows are prior evidence with documented contracts; they do not replace evaluation on the current corpus. Latency and cost projections depend on hardware, model runtime, corpus, batch size, and workload. The default `epsilon=0.01` is a stringent study setting, not a universal production threshold. Real-model commands need optional extras (`faiss`, `models`, `dashboard`) and typically a GPU for larger target models.

# HISTORY

EmbedFlow was written by **Arnav Srivastav** and first published as **v0.1.0** in **2026** (AGPL-3.0-only). The initial release shipped T2-v1 analysis, FAISS and Qdrant adapters, a persistent target-vector cache, a FastAPI dashboard, and a packaged evidence registry of measured embedding-model transitions.

# SEE ALSO

[pip](/man/pip)(1), [python](/man/python)(1), [huggingface-cli](/man/huggingface-cli)(1), [uvicorn](/man/uvicorn)(1), [fastapi](/man/fastapi)(1)

# RESOURCES

```[Source code](https://github.com/arnsri33/embedflow)```

```[Homepage](https://embedflow.org)```

```[Documentation](https://github.com/arnsri33/embedflow/blob/main/docs/cli.md)```

<!-- verified: 2026-09-09 -->
