# TLDR

**Start development server**

```dagster dev```

**Start with specific module**

```dagster dev -m [my_project]```

**Launch daemon for schedules/sensors**

```dagster-daemon run```

**Start webserver only**

```dagster-webserver```

**Run a job**

```dagster job execute -m [my_project] -j [job_name]```

**List jobs**

```dagster job list -m [my_project]```

**Scaffold a new project**

```dagster project scaffold --name [my-project]```

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

**asset** materialize|list|wipe
> Manage software-defined assets.

**schedule** list|start|stop|preview
> Manage schedules.

**sensor** list|start|stop|preview
> Manage sensors.

**project** scaffold|from-example
> Create new projects.

**definitions** validate
> Validate code definitions.

**instance** info|migrate
> Manage Dagster instance.

**run** list|delete|terminate
> Manage pipeline runs.

# PARAMETERS

**-m**, **--module** _name_
> Python module containing definitions.

**-f**, **--file** _path_
> Python file containing definitions.

**-j**, **--job** _name_
> Job name.

**-p**, **--port** _port_
> Webserver port. Default: 3000.

**-h**, **--host** _host_
> Webserver host. Default: localhost.

**-w**, **--workspace** _file_
> Workspace YAML file.

**-d**, **--working-directory** _path_
> Working directory for code.

# DESCRIPTION

**dagster** is the CLI for Dagster, a data orchestration platform built around software-defined assets. It manages the development environment, job execution, and infrastructure.

**dagster dev** starts both the webserver (UI) and daemon (schedules, sensors) for local development. In production, run **dagster-webserver** and **dagster-daemon** separately.

Software-defined assets are the core abstraction—functions that produce data assets with dependencies. Assets form a DAG that Dagster materializes. Jobs group assets for execution.

Schedules trigger jobs on cron patterns; sensors trigger based on external events. Both require the daemon process to run.

The webserver provides a UI showing asset lineage, run history, logs, and metrics. The asset graph visualizes data dependencies.

# CAVEATS

Daemon is required for schedules and sensors. Asset materialization tracks state in instance storage. Production requires PostgreSQL for run storage. Some features require Dagster+ (cloud).

# HISTORY

Dagster was created by **Elementl**, founded by **Nick Schrock** (co-creator of GraphQL) in **2018**. The project introduced the concept of software-defined assets as an improvement over task-oriented workflows. Version 1.0 released in **2022**. Dagster emphasizes developer experience with type checking, testing utilities, and local development. The company offers Dagster+ for managed cloud orchestration.

# SEE ALSO

[prefect](/man/prefect)(1), [airflow](/man/airflow)(1), [dbt](/man/dbt)(1), [argo](/man/argo)(1)
