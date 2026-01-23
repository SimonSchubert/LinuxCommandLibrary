# TLDR

**Start the Airflow scheduler**

```airflow scheduler```

**Start the web server** on a specific port

```airflow webserver --port [8080]```

**List all DAGs**

```airflow dags list```

**Trigger a DAG run**

```airflow dags trigger [dag_id]```

**Trigger a DAG** with configuration parameters

```airflow dags trigger [dag_id] --conf '{"key": "value"}'```

**Test a specific task** in a DAG

```airflow tasks test [dag_id] [task_id] [execution_date]```

**Pause a DAG** (stop scheduling)

```airflow dags pause [dag_id]```

**Initialize the database**

```airflow db migrate```

# SYNOPSIS

**airflow** _command_ [_subcommand_] [_options_]

# PARAMETERS

**scheduler**
> Start the Airflow scheduler daemon to trigger DAG runs

**webserver**
> Start the Airflow web interface server

**triggerer**
> Start the async trigger service for deferrable operators

**dags**
> Manage DAGs (list, trigger, pause, unpause, test, delete, backfill)

**tasks**
> Manage and test individual tasks (run, test, clear, list, render)

**db**
> Database operations (migrate, reset, clean, check, shell)

**connections**
> Manage connection configurations (add, delete, list, export, import)

**variables**
> Manage Airflow variables (get, set, delete, list, export, import)

**pools**
> Manage resource pools for task concurrency control

**users**
> Manage Airflow users (create, delete, list)

**config**
> View and manage configuration settings

**providers**
> Display information about installed providers

**info**
> Show system and environment information

**version**
> Display Airflow version

**-o**, **--output** _format_
> Output format: table, json, yaml, plain

**-v**, **--verbose**
> Enable verbose logging

# DESCRIPTION

**Apache Airflow** is a platform for programmatically authoring, scheduling, and monitoring workflows. The CLI provides comprehensive control over DAGs (Directed Acyclic Graphs), tasks, connections, and the Airflow services.

Workflows are defined as Python code, creating DAGs that describe how tasks should be organized and executed. The scheduler triggers tasks based on defined schedules and dependencies, while the web interface provides monitoring and manual intervention capabilities.

The tool manages connections to external systems (databases, APIs, cloud services) and variables for configuration. Resource pools allow controlling task concurrency. The database stores metadata about DAG runs, task states, and history.

Common workflows include initializing the database with **db migrate**, starting the **scheduler** and **webserver**, and using **dags trigger** to manually start DAG runs. Tasks can be tested individually without affecting production state using **tasks test**.

# CAVEATS

Requires proper configuration via **airflow.cfg** or environment variables before first use. The scheduler must be running for DAGs to execute on schedule. Database must be initialized with **airflow db migrate** before starting services. Some features require additional dependencies or executor configurations (Celery, Kubernetes).

# HISTORY

Apache Airflow was created at **Airbnb** in **2014** by Maxime Beauchemin to manage their complex data pipelines. It was open-sourced in **2015** and became an Apache Incubator project in **2016**. It graduated to a top-level Apache project in **2019**. The platform has grown to become one of the most widely used workflow orchestration tools, with version 2.0 released in **December 2020** introducing significant architectural improvements, and version 3.0 bringing further enhancements.

# SEE ALSO

[luigi](/man/luigi)(1), [prefect](/man/prefect)(1), [dagster](/man/dagster)(1), [cron](/man/cron)(8)
