# TAGLINE

Python workflow orchestration platform

# TLDR

**Start Prefect server**

```prefect server start```

**Deploy a flow**

```prefect deploy [flow.py:flow_name]```

**Run a flow locally**

```prefect flow-run create [flow-name]```

**List deployments**

```prefect deployment ls```

**Start a worker**

```prefect worker start -p [work-pool]```

**Create a work pool**

```prefect work-pool create [pool-name] -t [process]```

**View flow runs**

```prefect flow-run ls```

**Login to Prefect Cloud**

```prefect cloud login```

# SYNOPSIS

**prefect** _command_ [_options_]

# COMMANDS

**server** start
> Start local Prefect server.

**deploy** _path_
> Deploy a flow.

**flow-run** create|ls|cancel
> Manage flow runs.

**deployment** ls|run|delete|build|apply
> Manage deployments.

**worker** start
> Start a worker process.

**work-pool** create|ls|delete
> Manage work pools.

**block** register|ls|create
> Manage storage and infrastructure blocks.

**cloud** login|logout|workspace
> Prefect Cloud authentication.

**profile** ls|create|use
> Manage configuration profiles.

**config** set|unset|view
> Configuration management.

# PARAMETERS

**-p**, **--pool** _name_
> Work pool name.

**-t**, **--type** _type_
> Work pool type: process, docker, kubernetes.

**-n**, **--name** _name_
> Deployment or resource name.

**--cron** _schedule_
> Cron schedule for deployment.

**--interval** _seconds_
> Interval schedule for deployment.

**--limit** _count_
> Limit results.

# DESCRIPTION

**prefect** is the CLI for Prefect, a Python workflow orchestration framework. It manages deployments, workers, and infrastructure for running data pipelines.

Flows are Python functions decorated with @flow. **prefect deploy** packages flows for remote execution with schedules, parameters, and infrastructure settings.

Workers poll work pools and execute flow runs. **prefect worker start** launches a worker for a specific pool. Work pool types define execution environment: process (local), Docker, or Kubernetes.

**prefect server start** runs the API server and UI locally. For production, use Prefect Cloud or self-hosted with PostgreSQL. The UI shows flow runs, logs, and task states.

Blocks store configuration like credentials, storage locations, and infrastructure templates. Register blocks with **block register** and reference them in deployments.

# CAVEATS

Prefect 2.x is significantly different from Prefect 1.x. Workers replace agents from 1.x. Deployments require accessible code (Git, Docker, storage). Cloud features require account.

# HISTORY

Prefect was founded by **Jeremiah Lowin** in **2018** as a modern alternative to Airflow. Prefect 1.0 (2019) introduced the Hybrid model with local execution. Prefect 2.0 (2022) was a complete rewrite emphasizing simplicity with native Python code as workflows. The company offers Prefect Cloud for managed orchestration. Prefect has grown popular for data engineering and ML pipelines.

# SEE ALSO

[dagster](/man/dagster)(1), [airflow](/man/airflow)(1), [luigi](/man/luigi)(1), [argo](/man/argo)(1)
