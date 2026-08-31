# TAGLINE

Robotics data pipeline for MCAP episodes

# TLDR

Show the **installed version**

```hflow --version```

**Ingest episodes** in-process (no Airflow runtime)

```hflow ingest [episodes-in/*.mcap]```

Open DuckDB's **catalog browser** (default port 4213)

```hflow catalog ui```

**Curate** a version-pinned Parquet manifest from SQL

```hflow curate "SELECT episode_id, uri FROM episodes WHERE status = 'ok'" -o [manifest.parquet]```

Import a **LeRobot Dataset v3** episode as canonical MCAP

```hflow import lerobot --repo [lerobot/pusht] --revision [main] --camera [observation.image] --episode-index [0] --output-dir [./data/lerobot_pusht]```

**Check** MCAP files against the canonical-episode convention

```hflow doctor [episode.mcap]```

Start a local **Airflow Compose** runtime for the project pipeline

```hflow up --pipeline [pipeline.py] --data-root [./data]```

**Trigger** the ingest DAG once the runtime is up

```hflow ingest [episodes-in/run_0001.mcap] --profile [full]```

Print **runtime health** (local bundle or remote Airflow)

```hflow status```

Stop the Compose runtime (**volumes kept**)

```hflow down```

List episodes **behind the current pipeline version**

```hflow stale```

# SYNOPSIS

**hflow** [**-v**] [**--version**] _command_ [_options_]

**hflow** **ingest** [_uris_...] [**--profile** full|metadata_backfill|relabel] [**--online**] [**--all-stages**] [**--pipeline** _file_] [**--bundle-dir** _dir_] [**--airflow-url** _url_] [**--dag-id** _id_]

**hflow** **curate** [_sql_] [**--sql-file** _path_] [**--catalog** _dir_] [**-o** _path_] [**--dry-run**]

**hflow** **up** [**--pipeline** _file_] [**--data-root** _path_|_url_] [**--bundle-dir** _dir_] [**--api-port** _port_]

**hflow** **import lerobot** **--repo** _owner/name_ **--output-dir** _dir_ [**--revision** _rev_] [**--camera** _key_] [**--episode-index** _n_]

# COMMANDS

**ingest**
> Submit episode URIs (relative to the data root) to the master ingest DAG, or process them in this process when no runtime is addressed. Default profile **full** runs sync, meta, labels, and media.

**curate**
> Run a SELECT over catalog views and write `manifest.parquet` (or report coverage with **--dry-run**). Pass exactly one of a SQL string or **--sql-file**.

**catalog ui**
> Start DuckDB's local browser UI over the Parquet catalog (default port **4213**). Requires a local catalog directory, not a bucket URL. Starts even when the catalog is empty.

**dataset create** _name_
> Write an immutable version-pinned manifest of every episode the current pipeline stands behind, plus a JSON provenance sidecar. Importing the pipeline **executes** the file.

**import lerobot**
> Import a Hugging Face LeRobot Dataset v3 repository as canonical MCAP episodes. Resolves the revision to a commit and records it as provenance.

**export snapshot**
> Write selected catalog tables (and optional artifact media) to a local directory of Parquet files.

**stale**
> Print source URIs of episodes whose latest cataloged run predates the current pipeline (and format) version, one per line on stdout. Summary goes to stderr.

**doctor**
> Validate one or more MCAP files against the canonical-episode convention (container, stamps, chunk groups, in-band H.264). Reports each file in argument order.

**manifest**
> Import the pipeline and print its step names, versions, gates, and endpoints as JSON.

**up**
> Render a Docker Compose bundle for Apache Airflow 3 and start it detached. First start pulls images (~2 GB) and builds the task venv.

**down**
> Stop the Compose runtime. **--volumes** also drops the Postgres metadata DB and user-venv volumes; the data root is never removed.

**status**
> Print API URL, Airflow component health, and Compose service state (or REST-only health for a remote runtime).

**deploy**
> Emit DAG files, `user/` copies, and a `DEPLOY.md` for an existing Airflow 3 deployment (Astronomer, MWAA, Cloud Composer, self-managed). Calls no platform API.

**serve**
> Serve the workspace over HTTP (REST over the catalog, optional UI). Requires the separate **hflow-server** package. Distinct from **up**, which starts the processing runtime.

# PARAMETERS

**-v**, **--verbose**
> Enable verbose logging on stderr. Must appear before the subcommand.

**--version**
> Print `hflow <version>` and exit.

**--pipeline** _file_[:_app_]
> Pipeline file, optionally with the App variable name. Defaults to `hflow.toml`'s `pipeline`, else `./pipeline.py`. Importing the file executes it.

**--data-root** _path_|_url_
> Workspace root: a host directory, or `gs://`, `s3://`, `az://`. Default: **$HFLOW_DATA_ROOT**, else `hflow.toml`'s `data_root`, else `./data`.

**--catalog** _dir_|_url_
> Catalog directory or object-store prefix (default `<data-root>/catalog`). **catalog ui** refuses bucket URLs.

**-o**, **--output** _path_
> Manifest path for **curate** (default `<data-root>/manifest.parquet`) or snapshot directory for **export snapshot**.

**--dry-run**
> **curate**: run the query and report row count and coverage without writing a manifest.

**--profile** full|metadata_backfill|relabel
> **ingest** stage set. **full** (default) enables every stage; **metadata_backfill** re-runs checks and catalog registration; **relabel** re-runs enrichments only.

**--online**
> **ingest** latency-first lane: one immediate batch, no bin-packing or stagger. For per-episode runs as files land.

**--all-stages**
> **ingest** in-process: run every stage of **--profile** even when the catalog already records current step versions. Use when artifacts were deleted out from under recorded rows.

**--bundle-dir** _dir_
> Rendered Compose bundle. Default `<data-root>/runtime` (or `./runtime` for bucket roots). An explicit bundle keeps **ingest**/**status** local even if **$HFLOW_AIRFLOW_URL** is set.

**--airflow-url** _url_
> Remote Airflow API base URL (or **$HFLOW_AIRFLOW_URL**). Credentials come from the environment only.

**--dag-id** _id_
> Master ingest DAG id on a remote runtime (or **$HFLOW_AIRFLOW_DAG_ID**).

**--repo** _owner/name_
> Hugging Face dataset repository for **import lerobot** (required).

**--revision** _rev_
> Branch, tag, or commit to resolve (default **main**).

**--camera** _key_
> Video feature to import; repeatable (default `observation.image`).

**--episode-index** _n_
> Zero-based episode to import (default: every episode).

**--sql-file** _path_
> Read the **curate** SELECT from a file instead of the command line.

**--exit-code**
> **stale**: exit 1 when at least one stale episode is found (like `git diff --exit-code`).

**--api-port** _port_
> Host port for a **new** bundle's Airflow API (default **8080**). An existing `.env` is never rewritten.

**--volumes**
> **down**: also remove named volumes (full reset).

**--no-browser**
> Do not open a browser after **catalog ui** or **serve**.

**--read-only**
> **serve**: refuse manifest pinning, saved-query edits, and run triggering.

**--media** references|copy
> **export snapshot**: keep artifact URIs, or copy files under `assets/` (default **references**).

# DESCRIPTION

**hflow** is the command-line interface for HFlow, an open-source SDK for multimodal robotics and physical-AI data pipelines from Hebbian Robotics. Recordings enter as standard **MCAP** episodes (ROS 2 bags, LeRobot Dataset v3 imports, or other converters). The CLI wraps the same Python library used by `hflow.App`: quality checks, transforms, labels, and enrichments stay ordinary Python functions; hflow handles orchestration, provenance, a Parquet catalog, and curation.

A typical local loop does not need Docker. Define a pipeline (`hflow.App(...)` with `@app.check` / enrichments), iterate with `app.test("episode.mcap")`, then **ingest** episode paths relative to the data root. With no Compose bundle and no **$HFLOW_AIRFLOW_URL**, ingest runs the stage graph **in this process**. **curate** (or **dataset create**) cuts a version-pinned manifest from DuckDB SQL over the catalog. **doctor** checks that written files follow HFlow's canonical MCAP convention: complete summary, topic-group chunking, in-band H.264 cameras, and `provenance/v1` stamps (`schema_version`, `pipeline_version`).

When you want a scheduler, **up** renders an Airflow 3 LocalExecutor stack (not a pip dependency of HFlow) under `<data-root>/runtime` and **ingest** triggers the master DAG over Airflow's REST API. **deploy** emits the same DAG bundle for an Airflow 3 you already operate. **serve** is a workspace HTTP API over the data root; it does not process episodes.

Subcommands share a three-value exit convention: **0** success, **1** ran and found something to report (non-conforming **doctor** files, ingest errors, **stale --exit-code** hits, **up** started then failed), **2** bad input and nothing useful happened.

# CONFIGURATION

**hflow.toml**
> Optional project file in this directory or an ancestor. Typical keys: `data_root = "./data"` and `pipeline = "pipeline.py"`. Relative paths resolve against the file's directory. Runtime URLs and credentials are **not** stored here.

**$HFLOW_DATA_ROOT**
> Overrides the data root. Wins over `hflow.toml` so a shell or control plane can point at another workspace without editing the repo. Resolution order for roots: flag, then this variable, then nearest `hflow.toml`, then `./data`.

**$HFLOW_AIRFLOW_URL**, **$HFLOW_AIRFLOW_DAG_ID**
> Remote runtime addressing for **ingest** and **status**. An explicit **--bundle-dir** stays local; an explicit **--airflow-url** wins the other way.

**$HFLOW_AIRFLOW_TOKEN** or **$HFLOW_AIRFLOW_USERNAME** + **$HFLOW_AIRFLOW_PASSWORD**
> Remote Airflow credentials. Never accepted as flags (process listings and shell history). A bearer token wins over username/password.

**$HFLOW_FFMPEG**, **$HFLOW_FFPROBE**
> Use these binaries instead of the checksum-verified ffmpeg/ffprobe HFlow downloads into the user cache on first video operation (Linux x86_64/aarch64).

**$HFLOW_ENDPOINT_***
> Per-alias endpoint overrides for pipelines that declare `endpoints={...}` (alias uppercased, non-alphanumerics as `_`). Captured at **up** render time and forwarded into containers by name only.

**$HFLOW_MIRROR_DIR**
> Worker-local cache for bucket deployments that spool object-store objects through an etag-validated mirror.

# CAVEATS

HFlow is **pre-v1**. Canonical MCAP episodes are derived artifacts, not a byte-stable source of record; version stamps make regenerations visible. Requires **Python 3.11+**.

The Hebbian Robotics project on PyPI starts at **0.2.0**. Earlier **0.1.x** releases under the same name belonged to an unrelated, inactive project before the name was transferred.

**ingest** URIs must be relative to the data root. Absolute host paths and `../` escapes are rejected before anything is triggered (they would not resolve inside the runtime mount).

**catalog ui** needs a local directory. Bucket catalogs (`gs://`, `s3://`, `az://`) are refused. The first launch may download DuckDB's `ui` extension.

**serve** is not in the core wheel: install `hflow-server` separately (`uv add hflow-server`). Binding **--host** past loopback exposes the corpus.

**up** is explicit and heavy: the first start pulls ~2 GB of images and builds a task venv. Ingest never starts Airflow on your behalf. Windows Airflow support is **WSL2** only; keep the data root on the Linux filesystem.

Importing a pipeline (**manifest**, **dataset create**, **stale**, in-process **ingest**, **serve**'s pipeline page) **executes** the file. Run those commands in the pipeline's own environment. Guard `app.run()` with `if __name__ == "__main__"` so Airflow workers do not re-enter it on import.

**doctor** does not currently classify H.264 picture coding types (B-frames) and does not reject non-VCL NAL units before the first access-unit delimiter; a clean report is not proof of those two constraints.

# HISTORY

HFlow is developed by **Hebbian Robotics** (Y Combinator S26) as open-source data-quality infrastructure for physical AI. The CLI entry point is `hflow.cli:main` (PyPI package **hflow**, Apache-2.0). Version **0.2.4** documents the current subcommand set: curate, catalog, dataset, import, export, stale, doctor, manifest, up/down/ingest/status, deploy, and serve.

# SEE ALSO

[python](/man/python)(1), [python3](/man/python3)(1), [uv](/man/uv)(1), [pip](/man/pip)(1), [duckdb](/man/duckdb)(1), [ffmpeg](/man/ffmpeg)(1), [airflow](/man/airflow)(1), [docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1)

# RESOURCES

```[Source code](https://github.com/Hebbian-Robotics/hflow)```

```[Homepage](https://hebbianrobotics.com)```

```[Documentation](https://github.com/Hebbian-Robotics/hflow/tree/main/docs)```

<!-- verified: 2026-09-01 -->
