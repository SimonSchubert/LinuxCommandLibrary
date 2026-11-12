# TAGLINE

Create, inspect, and deploy dlt data-load pipelines

# TLDR

**Create** a pipeline project from a verified source or a template

```dlt init [source] [destination]```

**List** verified sources or destinations

```dlt init --list-sources```

**List** local pipelines

```dlt pipeline --list-pipelines```

Show **state** of a pipeline

```dlt pipeline [pipeline_name] info```

Show the **trace** of the last run

```dlt pipeline [pipeline_name] trace```

Show **failed jobs** and their errors

```dlt pipeline [pipeline_name] failed-jobs```

Print the default **schema**

```dlt pipeline [pipeline_name] schema --format [json]```

**Drop** selected resource tables and reset their state

```dlt pipeline [pipeline_name] drop [resource]```

# SYNOPSIS

**dlt** [_options_] **init**|_pipeline_|_schema_|_deploy_|_dashboard_|_telemetry_ [_args_]

# PARAMETERS

**-v**, **--verbose**
> Increase verbosity. Repeat for more (-v, -vv, -vvv).

**--non-interactive**
> Use prompt defaults; fail if a prompt has none. Implied when stdin is not a tty.

**-y**, **--yes**
> Auto-accept confirmations.

**--debug**
> Show full stack traces on exceptions.

**--version**
> Print the dlt version and exit.

**--disable-telemetry** / **--enable-telemetry**
> Turn telemetry off or on before the command runs.

**init** _source_ _destination_
> Create a pipeline in the current folder from a verified source or a template. **--list-sources** and **--list-destinations** list the known names.

**pipeline** [_--list-pipelines_] [_pipeline_name_] _subcommand_
> Inspect a pipeline working directory. Subcommands include **info**, **show**, **failed-jobs**, **abort-packages**, **sync**, **trace**, **schema**, **drop**, **load-package**, and **mcp**.

**schema** [_--format json|yaml|dbml|dot|mermaid_] _file_
> Load, validate, and print a schema from a yaml or json file.

**deploy**
> Create a deployment package for a selected pipeline script.

**dashboard**
> Show the dltHub workspace dashboard.

**telemetry**
> Show whether telemetry is on.

# DESCRIPTION

**dlt** (data load tool) is the Python CLI for dltHub pipelines. It scaffolds a project with **init**, then inspects pipeline state, traces, load packages, and destination schemas after you run pipeline scripts.

Global flags belong on **dlt**, before the subcommand. `dlt --debug pipeline` enables debug traces; `dlt pipeline --debug` does not.

**pipeline abort-packages** marks the oldest normalized package aborted, records failed jobs, deletes other pending packages, and restores local state from the destination snapshot. **drop-pending-packages** is deprecated in favor of that command. **pipeline show** launches a marimo dashboard and needs marimo installed.

Pipeline scripts stay ordinary Python. The CLI does not run extracts by itself; it manages the working directory those scripts create.

# CAVEATS

Needs Python 3 and a dlt install in the environment (`pip install dlt`). Run pipeline inspection from the same folder as the pipeline script so destination credentials in `.dlt/secrets.toml` resolve. **ai** moved to `dlthub ai` (install `dlt[hub]`). Telemetry is on unless disabled.

# SEE ALSO

[python3](/man/python3)(1), [pip](/man/pip)(1)

# RESOURCES

```[Documentation](https://dlthub.com/docs/reference/command-line-interface)```

```[Homepage](https://dlthub.com/)```

```[Source code](https://github.com/dlt-hub/dlt)```

<!-- verified: 2026-11-12 -->
