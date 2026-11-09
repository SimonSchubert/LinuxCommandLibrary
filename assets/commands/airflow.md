# TAGLINE

Platform to author, schedule, and monitor data workflows

# TLDR

**Start the Airflow scheduler**

```airflow scheduler```

**Start the API server and web UI** on a specific port

```airflow api-server --port [8080]```

**Start the DAG processor**

```airflow dag-processor```

**Run all components** locally for development

```airflow standalone```

**List all DAGs**

```airflow dags list```

**Trigger a DAG run**

```airflow dags trigger [dag_id]```

**Trigger a DAG** with configuration parameters

```airflow dags trigger [dag_id] --conf '{"key": "value"}'```

**Test a specific task** in a DAG

```airflow tasks test [dag_id] [task_id] [logical_date_or_run_id]```

**Pause a DAG** (stop scheduling)

```airflow dags pause [dag_id]```

**Unpause a DAG** (resume scheduling)

```airflow dags unpause [dag_id]```

**List all DAG runs** for a specific DAG (Airflow 2 used `-d [dag_id]`)

```airflow dags list-runs [dag_id]```

**Initialize the database**

```airflow db migrate```

# SYNOPSIS

**airflow** _command_ [_subcommand_] [_options_]

# PARAMETERS

**scheduler**
> Start the Airflow scheduler daemon to trigger DAG runs

**api-server**
> Start the API server, which also serves the web UI (replaces **webserver** from Airflow 3)

**dag-processor**
> Start the standalone process that parses DAG files (required from Airflow 3)

**triggerer**
> Start the async trigger service for deferrable operators

**standalone**
> Run an all-in-one copy of Airflow for local development

**dags**
> Manage DAGs (list, trigger, pause, unpause, test, delete, show, reserialize)

**backfill**
> Create backfills for a date range (**backfill create**)

**tasks**
> Manage and test individual tasks (run, test, clear, list, render, state)

**assets**
> List, inspect and materialize assets

**db**
> Database operations (migrate, reset, clean, check, shell)

**connections**
> Manage connection configurations (add, delete, list, export, import)

**variables**
> Manage Airflow variables (get, set, delete, list, export, import)

**pools**
> Manage resource pools for task concurrency control

**users**, **roles**
> Manage users and roles (provided by the FAB provider, apache-airflow-providers-fab)

**config**
> View and manage configuration settings

**providers**
> Display information about installed providers

**info**
> Show system and environment information

**version**
> Display Airflow version

**-o**, **--output** _format_
> Output format for listing subcommands: table, json, yaml, plain

**-v**, **--verbose**
> Enable verbose logging on the subcommands that accept it

# DESCRIPTION

**Apache Airflow** is a platform for programmatically authoring, scheduling, and monitoring workflows. The CLI provides comprehensive control over DAGs (Directed Acyclic Graphs), tasks, connections, and the Airflow services.

Workflows are defined as Python code, creating DAGs that describe how tasks should be organized and executed. The scheduler triggers tasks based on defined schedules and dependencies, the DAG processor parses DAG files, and the web interface served by the API server provides monitoring and manual intervention capabilities.

The tool manages connections to external systems (databases, APIs, cloud services) and variables for configuration. Resource pools allow controlling task concurrency. The database stores metadata about DAG runs, task states, and history.

Common workflows include initializing the database with **db migrate**, starting the **scheduler**, **dag-processor** and **api-server**, and using **dags trigger** to manually start DAG runs. Tasks can be tested individually without affecting production state using **tasks test**.

# CONFIGURATION

**~/airflow/airflow.cfg**
> Main configuration file controlling executor type, database connection, web server settings, scheduler behavior, and logging. Can also be overridden via environment variables prefixed with AIRFLOW__.

**~/airflow/webserver_config.py**
> Web UI authentication and security configuration for the FAB auth manager, including RBAC settings and authentication backends.

# CAVEATS

Requires proper configuration via **airflow.cfg** or environment variables before first use. The **airflow webserver** command was removed in Airflow 3: use **airflow api-server**, and start **airflow dag-processor** separately. The scheduler must be running for DAGs to execute on schedule. Database must be initialized with **airflow db migrate** before starting services. Some features require additional dependencies or executor configurations (Celery, Kubernetes).

# HISTORY

Apache Airflow was created at **Airbnb** in **2014** by Maxime Beauchemin to manage their complex data pipelines. It was open-sourced in **2015** and became an Apache Incubator project in **2016**. It graduated to a top-level Apache project in **2019**. The platform has grown to become one of the most widely used workflow orchestration tools, with version 2.0 released in **December 2020** introducing significant architectural improvements, and version 3.0 in **April 2025** introducing a new UI, the separate API server and DAG processor, and DAG versioning.

# SEE ALSO

[luigi](/man/luigi)(1), [prefect](/man/prefect)(1), [dagster](/man/dagster)(1), [cron](/man/cron)(8), [docker](/man/docker)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/apache/airflow)```

```[Homepage](https://airflow.apache.org)```

```[Documentation](https://airflow.apache.org/docs/apache-airflow/stable/cli-and-env-variables-ref.html)```

<!-- verified: 2026-11-09 -->
