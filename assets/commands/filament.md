# TAGLINE

CLI for pluggable data replication with checkpoints and integrity checks

# TLDR

Print the **CLI version**

```filament version```

Open the **interactive menu**

```filament -i```

Create a **Postgres source** whose DSN comes from the environment

```filament source create [production] --source-connector postgres --source-connection-method url --source-dsn-env [POSTGRES_DSN]```

Create a **stdout sink** for local debugging

```filament sink create [debug] --sink-connector stdout```

**Discover** resources on a saved source

```filament source discover [production]```

Save a **pipeline** from two connections

```filament pipeline create [users-copy] --source [production] --sink [warehouse] --resources [users,audit] --sync-mode full --write-mode replace```

**Run** a saved pipeline

```filament run [users-copy]```

One-shot **inline copy** to stdout (no saved pipeline)

```filament run --source-connector postgres --source-connection-method url --source-dsn-env [POSTGRES_DSN] --sink-connector stdout```

Keep the local **API and web UI** running

```filament up```

Stop a **detached** local runtime

```filament down```

# SYNOPSIS

**filament** [_--context_ _NAME_] [_--config_ _PATH_] [_-i_] [_COMMAND_]

# PARAMETERS

**-i**, **--interactive**
> Open the terminal menu (or a wizard when combined with a command such as **source create**).

**--context** _NAME_
> Run this invocation against context _NAME_ instead of the current one.

**--config** _PATH_
> Local YAML document to apply (local contexts only).

**--layout** _boxed_|_plain_
> Table drawing style. Also read from **FILAMENT_LAYOUT**.

**source** **create**|**edit**|**list**|**discover**|**delete**
> Manage sources. **ls** is an alias of **list**. Connector fields become `--source-*` flags.

**sink** **create**|**edit**|**list**|**delete**
> Manage sinks. Connector fields become `--sink-*` flags.

**pipeline** **create**|**edit**|**list**|**delete**
> Manage saved pipelines. **create** needs **--source** and **--sink** naming saved connections.

**run** [_PIPELINE_]
> Run a saved pipeline, or an inline transfer with **--source-connector** and **--sink-connector**. **run list** [_PIPELINE_] shows history.

**up**
> Serve the local runtime, API, and web UI (default `127.0.0.1:8080`). **-d**, **--detach** backgrounds it.

**down**
> Stop the detached process started by **up --detach**.

**status**
> Show the selected context and whether its runtime is reachable.

**context** **add**|**list**|**current**|**use**|**rename**|**delete**
> Manage local vs remote targets. **ctx** is an alias.

**auth** **login**|**status**|**logout**
> Service-account login for a remote Filament server.

**config** **path**|**validate**|**edit**
> Inspect, check, or open the local YAML document in `$VISUAL`/`$EDITOR`.

# DESCRIPTION

**filament** is the command-line client for Filament, a Go data-replication engine. It copies data from sources to sinks using full loads, incremental replication, or change data capture. Batches are verified at the sink handoff; resumable runs pick up from the last durable checkpoint instead of starting over.

The same binary talks to a **local** runtime (file-backed SQLite and an in-process event bus; no Postgres or NATS required) or a **remote** Filament server selected by a context. Most management commands work against both.

A **connection** stores connector settings (Postgres, MySQL, S3, ClickHouse, Iceberg, stdout, and several SaaS sources). A **pipeline** routes a source to a sink and names the resources, sync mode, and write mode. **filament run** executes that route and streams progress until it finishes.

`filament up` keeps the embedded API and web UI available on a stable address. Ordinary local commands start the runtime for one operation and stop it.

Filament is **pre-1.0**: public APIs, including connector interfaces, may still change.

# CONFIGURATION

The built-in local context reads **`~/.config/filament/filament.yaml`** (or `$XDG_CONFIG_HOME/filament/filament.yaml`). **filament config path** prints the active file. The YAML is declarative **input** applied when it changes; it is not an inventory. Removing an entry from YAML does not delete the object from local SQLite state.

```yaml
version: 1

sources:
  production:
    type: postgres
    config:
      connection_method: url
      dsn: env:POSTGRES_DSN

sinks:
  warehouse:
    type: stdout

pipelines:
  users-copy:
    source:
      ref: production
    sink:
      ref: warehouse
    resources:
      - users
    sync_mode: full
    write_mode: replace
```

Secret fields accept a value or an environment reference (`--source-dsn-env POSTGRES_DSN`, or `--source-dsn '$POSTGRES_DSN'`). Quote `$NAME` forms so the shell does not expand them. On a remote context, secret references belong to the deployment's secret provider, not the CLI process environment.

**NO_COLOR** disables terminal colors. Contexts and credentials are stored with owner-only permissions.

# CAVEATS

The command name **filament** is also used by unrelated projects (Google's Filament rendering engine and Laravel Filament). This page documents the Galaxy **filament** replication CLI (`galaxy-io/filament`).

Inline **filament run --source-connector ...** transfers are **full reads only**. They do not keep run history or checkpoints. Remote contexts run saved pipelines without those inline overrides.

**filament up** only accepts a local context.

Do not put secrets on the process command line; they can appear in shell history and process listings. Prefer `*-env` flags or quoted environment references.

# HISTORY

**Filament** is an Apache-2.0 Go project from **galaxy-io**, first published on GitHub in **June 2026**. It ships as a standalone CLI, an embeddable Go module, and container images (server, control plane, worker, standalone) for larger deployments.

# SEE ALSO

[rsync](/man/rsync)(1), [pg_dump](/man/pg_dump)(1), [mysqldump](/man/mysqldump)(1), [debezium](/man/debezium)(1)

# RESOURCES

```[Source code](https://github.com/galaxy-io/filament)```

```[Homepage](https://filament.getgalaxy.io)```

```[Documentation](https://filament.getgalaxy.io/pages/guides/usage/cli)```

<!-- verified: 2026-09-10 -->
