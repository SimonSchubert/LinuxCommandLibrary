# TAGLINE

Prove PostgreSQL backups actually restore in a throwaway container

# TLDR

Run a **local restore drill** from a YAML config (marks the run as manual)

```restoredrill --config [quickstart.yml] --trigger manual```

Record **who** started a manual drill

```restoredrill --config [restoredrill.yml] --trigger manual --triggered-by [you@example.com]```

Run on a **scheduler** (the default trigger) and keep the CI job id

```restoredrill --config [restoredrill.yml] --pipeline-job-id [github:123]```

Print **version** and build metadata

```restoredrill --version```

# SYNOPSIS

**restoredrill** [**--config** _file_] [**--trigger** scheduled|manual] [**--triggered-by** _who_] [**--pipeline-job-id** _id_] [**--version**]

# PARAMETERS

**--config** _file_
> Path to the YAML config (default **restoredrill.yml**).

**--trigger** scheduled|manual
> How this drill was started. Must be **scheduled** (default) or **manual**.

**--triggered-by** _who_
> Who started it. For **manual** runs, defaults to the OS username when omitted.

**--pipeline-job-id** _id_
> CI job identifier recorded on the report. If unset, auto-detected from **GITHUB_RUN_ID** (**github:** prefix), **CI_JOB_ID** (**gitlab:**), or **BUILD_ID** (**jenkins:**).

**--version**
> Print version, commit, and build date, then exit.

**-h**, **--help**
> Print flag help (double-dash names) and exit 0.

# DESCRIPTION

**restoredrill** fetches a PostgreSQL backup, restores it into an ephemeral Postgres container, runs fail-closed checks, and writes a JSON evidence report with restore duration. It is a CI-native drill, not a backup dashboard: one command, one timestamped report, a non-zero exit if anything is wrong — including a notify sink that failed to deliver.

Checks run in tiers. **Prechecks** (before restore) look at file size, **pg_dump -Fc** archive headers, and backup age against an optional RPO target. **Structural** checks cover restore success, table count, and sequence integrity (a serial/identity sequence that lags its column only fails on the first INSERT after a real disaster). **Read-path** checks are row counts and user SQL assertions (each query must return exactly one row with a single boolean; an error is a failure, not a skip). **RTO** compares measured restore time to an optional target. The container must accept connections or the drill fails.

Backup sources are a local path, a **file://** URL, or **s3://** (the **aws** CLI is required). An S3 URL ending in **/** is a prefix: the newest matching object is chosen, after a content sniff for custom-format dumps so a newer checksum sidecar cannot win. Formats are **pg_dump_custom** (default) and **pg_dump_sql**.

v0.1.0, Postgres only. Build with **go build ./cmd/restoredrill**. GitHub Action and example workflow live in the repository.

# CONFIGURATION

YAML keys (required: **backup.source**):

**backup.source** / **backup.format** / **backup.s3_object_pattern**
> File or URL to drill; **pg_dump_custom** or **pg_dump_sql**; glob required for an S3 prefix plus plain SQL (no **PGDMP** header to sniff).

**postgres.image**
> Container image (default **postgres:16**). Match the production major version.

**sandbox.keep**
> **never** (default), **on-failure**, or **always**. Kept containers print **docker exec** / **docker rm** hints.

**checks.min_size_bytes**
> Fail if the dump is too small. Unset uses a 100-byte floor; **-1** disables the floor.

**checks.archive_integrity**
> Inspect the custom-format table of contents before restore (no equivalent for plain SQL).

**checks.rpo_target** / **checks.rto_target**
> Go durations such as **48h** and **30m**. RPO fails closed if the backup timestamp cannot be determined.

**checks.min_tables** / **checks.sequence_integrity**
> Structural gates after restore.

**checks.row_counts** / **checks.queries**
> **table** + **min** row counts; named SQL assertions.

**notify.webhook_url** / **notify.slack_webhook_url**
> POST the full JSON report, or a one-line Slack summary. Failed delivery is a drill failure.

**output.prometheus_textfile**
> node_exporter textfile metrics. Alert on the age of **restoredrill_last_run_timestamp_seconds**.

**report.path**
> JSON report path (default **restoredrill-report.json**). Every field is always present; timestamps are **"YYYY-MM-DD HH:MM:SS UTC"** strings.

# CAVEATS

Needs **Docker**. The ephemeral-container model assumes the database fits on the runner; multi-terabyte estates need dedicated restore infra. **pg_dump**-level verification does not exercise PITR or WAL replay (pgBackRest is on the roadmap). Plain SQL dumps have no archive-header precheck, so corruption is caught at restore time.

A passed restore with a report that could not be written, or with failed notifications, still exits 1. Flag parse errors exit 2. Status is early: schema and flags may still change.

# HISTORY

Written by **Ahmad Piran** as a narrow, auditor-shaped restore check (MIT). v0.1.0 is Postgres-only.

# SEE ALSO

[pg_dump](/man/pg_dump)(1), [pg_dumpall](/man/pg_dumpall)(1), [pg_restore](/man/pg_restore)(1), [psql](/man/psql)(1), [postgres](/man/postgres)(1), [docker](/man/docker)(1), [aws](/man/aws)(1)

# RESOURCES

```[Source code](https://github.com/ahmadpiran/restoredrill)```

<!-- verified: 2026-08-27 -->
