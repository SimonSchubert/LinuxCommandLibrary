# TAGLINE

data orchestration platform for software-defined assets

# TLDR

**Start development server**

```dagster dev```

**Start with specific module**

```dagster dev -m [my_project]```

**Start** from a single Python file on a custom port

```dagster dev -f [definitions.py] -p [3001]```

**Launch daemon for schedules/sensors**

```dagster-daemon run```

**Start webserver only**

```dagster-webserver```

**Run a job**

```dagster job execute -m [my_project] -j [job_name]```

**Materialize** selected assets

```dagster asset materialize -m [my_project] --select [asset_name]```

**List jobs**

```dagster job list -m [my_project]```

**Scaffold a new project** (modern replacement for **dagster project scaffold**)

```uvx create-dagster project [my-project]```

**Check definitions**

```dagster definitions validate -m [my_project]```

# SYNOPSIS

**dagster** _command_ [_options_]

**dagster-daemon** run [_options_]

**dagster-webserver** [_options_]

# COMMANDS

**dev**
> Start development server (webserver + daemon).

**job** execute|list|print
> Manage and run jobs.

**asset** materialize|list|wipe|wipe-partitions-status-cache
> Manage software-defined assets.

**schedule** list|start|stop|preview|logs
> Manage schedules.

**sensor** list|start|stop|preview|cursor
> Manage sensors.

**project** scaffold|from-example|list-examples
> Create new projects (**scaffold** is deprecated in favor of **create-dagster project**).

**definitions** validate
> Validate code definitions.

**instance** info|migrate|reindex|concurrency
> Manage Dagster instance.

**run** list|delete|wipe|migrate-repository
> Manage runs and run history.

# PARAMETERS

**-m**, **--module-name** _name_
> Python module containing definitions.

**-f**, **--python-file** _path_
> Python file containing definitions.

**-j**, **--job** _name_
> Job name.

**-p**, **--port** _port_
> Webserver port for **dagster dev**. Default: 3000.

**-h**, **--host** _host_
> Webserver host for **dagster dev**. Default: 127.0.0.1.

**-c**, **--config** _file_
> Run config YAML for **job execute** and **asset materialize**.

**--select** _selection_
> Asset selection for **asset materialize** and **asset list**.

**-w**, **--workspace** _file_
> Workspace YAML file.

**-d**, **--working-directory** _path_
> Working directory for code.

# DESCRIPTION

**dagster** is the CLI for Dagster, a data orchestration platform built around software-defined assets. It manages the development environment, job execution, and infrastructure.

**dagster dev** starts both the webserver (UI) and daemon (schedules, sensors) for local development. In production, run **dagster-webserver** and **dagster-daemon** separately.

Software-defined assets are the core abstraction: functions that produce data assets with dependencies. Assets form a DAG that Dagster materializes. Jobs group assets for execution.

Schedules trigger jobs on cron patterns; sensors trigger based on external events. Both require the daemon process to run.

The webserver provides a UI showing asset lineage, run history, logs, and metrics. The asset graph visualizes data dependencies.

# CONFIGURATION

**dagster.yaml**
> Instance configuration file controlling storage, compute, and run settings.

**workspace.yaml**
> Workspace configuration defining code locations and repositories.

# CAVEATS

Daemon is required for schedules and sensors. Without **DAGSTER_HOME**, **dagster dev** uses a temporary instance and run history is lost on exit. Production deployments typically use PostgreSQL for run and event storage. New projects built with **create-dagster** are driven by the separate **dg** CLI (**dg dev**, **dg launch**, **dg check defs**); the **dagster** CLI remains supported. Some features require Dagster+ (cloud).

# HISTORY

Dagster was created by **Nick Schrock** (co-creator of GraphQL) at **Elementl**, the company he founded in **2018**; the project was open-sourced in **2019**. Version **1.0** was released in **August 2022**, and Elementl renamed itself **Dagster Labs** in **2023**. The company offers Dagster+ for managed cloud orchestration.

# SEE ALSO

[prefect](/man/prefect)(1), [airflow](/man/airflow)(1), [dbt](/man/dbt)(1)

# RESOURCES

```[Source code](https://github.com/dagster-io/dagster)```

```[Homepage](https://dagster.io)```

```[Documentation](https://docs.dagster.io/api/clis/cli)```

<!-- verified: 2026-11-23 -->
