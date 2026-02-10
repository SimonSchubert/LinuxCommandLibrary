# TAGLINE

CLI for MLflow, an open-source platform for machine learning lifecycle

# TLDR

**Start MLflow tracking server**

```mlflow server --host [0.0.0.0] --port [5000]```

**Start UI** for local experiments

```mlflow ui```

**Run an MLflow project**

```mlflow run [project-uri] -P [param=value]```

**Run project from Git**

```mlflow run https://github.com/[user]/[repo]```

**Create a new experiment**

```mlflow experiments create -n [experiment-name]```

**List experiments**

```mlflow experiments search```

**Serve a model**

```mlflow models serve -m [models:/model-name/version] -p [5001]```

**Build Docker image for model**

```mlflow models build-docker -m [models:/model-name/version] -n [image-name]```

# SYNOPSIS

**mlflow** _command_ [_options_]

# COMMANDS

**server**
> Start tracking server.

**ui**
> Start local tracking UI.

**run** _uri_
> Run MLflow project.

**experiments** create|search|delete|rename
> Manage experiments.

**runs** list|describe|delete
> Manage runs.

**models** serve|build-docker|predict
> Model deployment.

**artifacts** download|list|log-artifacts
> Manage artifacts.

**recipes** run
> Run ML recipes.

**deployments** create|update|delete|list|predict
> Manage model deployments.

**doctor**
> Diagnose MLflow installation.

# SERVER OPTIONS

**--host** _address_
> Bind address. Default: 127.0.0.1.

**--port** _port_
> Server port. Default: 5000.

**--backend-store-uri** _uri_
> Database URI for experiment/run data.

**--default-artifact-root** _path_
> Default artifact storage location.

**--workers** _count_
> Number of gunicorn workers.

# RUN OPTIONS

**-P**, **--param** _key=value_
> Project parameters.

**-e**, **--entry-point** _name_
> Entry point. Default: main.

**--experiment-name** _name_
> Experiment name for the run.

**--env-manager** _type_
> Environment manager: local, conda, virtualenv.

# DESCRIPTION

**mlflow** is the CLI for MLflow, an open-source platform for machine learning lifecycle management. It tracks experiments, packages code, and deploys models.

The **tracking server** stores experiment metadata, parameters, metrics, and artifacts. Use **mlflow ui** for local development or **mlflow server** for team deployment.

**mlflow run** executes MLflow Projects—directories or Git repos with MLproject files defining entry points, parameters, and environments. It ensures reproducibility.

Model serving with **models serve** creates REST endpoints for predictions. **models build-docker** packages models as containers. The Models component supports multiple ML frameworks.

Artifacts include datasets, models, and outputs. The tracking server stores references; actual files go to configured storage (local, S3, GCS, Azure Blob).

# CAVEATS

Tracking server default (SQLite) not suitable for production; use PostgreSQL/MySQL. Large artifacts need object storage. Some features require specific Python packages. Model serving uses Flask development server.

# HISTORY

MLflow was created at **Databricks** and open-sourced in **June 2018**. It became an **LF AI & Data Foundation** project in **2020**. The platform grew from Databricks' internal tools for managing ML workflows. Version 2.0 (2022) added MLflow Recipes and improved model registry. MLflow is widely adopted for experiment tracking and model management.

# SEE ALSO

[dvc](/man/dvc)(1), [wandb](/man/wandb)(1), [kubeflow](/man/kubeflow)(1)
