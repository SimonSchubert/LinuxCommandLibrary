# TAGLINE

Kubeflow Pipelines CLI for managing ML workflows on Kubernetes

# TLDR

**Create a pipeline run from a compiled pipeline**

```kfp run create -e [experiment] -r [run-name] -f [pipeline.yaml] --endpoint [http://localhost:8080]```

**List pipelines**

```kfp pipeline list --endpoint [http://localhost:8080]```

**Upload a pipeline**

```kfp pipeline create -p [pipeline-name] [pipeline.yaml]```

**Create an experiment**

```kfp experiment create -n [experiment-name] --endpoint [http://localhost:8080]```

**Compile a pipeline from Python**

```kfp dsl compile --py [pipeline.py] --output [pipeline.yaml]```

**Diagnose KFP installation**

```kfp diagnose_me```

# SYNOPSIS

**kfp** _command_ [_options_]

# PARAMETERS

**run** create|list|get|archive|unarchive|delete
> Manage pipeline runs.

**recurring-run** create|list|get|enable|disable|delete
> Manage scheduled recurring runs.

**pipeline** create|create-version|list|list-versions|get|delete
> Manage pipelines.

**experiment** create|list|get|delete|archive|unarchive
> Manage experiments.

**dsl** compile
> Compile a Python pipeline definition to YAML.

**component** build
> Build a containerized component from a Python function.

**diagnose_me**
> Run environment diagnostics (GCP-focused).

**-e**, **--experiment** _name_
> Experiment name or ID.

**-r**, **--run-name** _name_
> Name for the run.

**-f**, **--package-file** _file_
> Compiled pipeline file (YAML).

**-p**, **--pipeline-name** _name_
> Pipeline name.

**--endpoint** _url_
> KFP API endpoint URL.

# DESCRIPTION

**kfp** is the CLI for **Kubeflow Pipelines**, which orchestrates ML workflows as directed acyclic graphs (DAGs) on Kubernetes. Pipelines define reusable components with inputs, outputs, and dependencies.

The CLI manages the full pipeline lifecycle: compiling Python pipeline definitions to YAML, uploading pipelines, creating experiments, and submitting runs. It connects to a running KFP backend via the `--endpoint` flag.

Kubeflow itself is installed using Kustomize manifests via `kubectl apply -k` from the **kubeflow/manifests** repository. The older **kfctl** deployment tool is deprecated and archived.

# CAVEATS

Resource-intensive; requires a Kubernetes cluster with sufficient capacity. The `diagnose_me` command is GCP-focused. The old `kfp run submit` syntax still works as a deprecated alias for `kfp run create`. Similarly, `kfp pipeline upload` is aliased to `kfp pipeline create`.

# HISTORY

Kubeflow was started at **Google** in **2017** as a way to run TensorFlow on Kubernetes. Open-sourced in **2018**, it expanded to support the full ML lifecycle. Version 1.0 released in **2020**. The project is a **CNCF incubating project**. The kfp v2 SDK brought a redesigned Python API and CLI with `dsl compile` and simplified component authoring.

# SEE ALSO

[kubectl](/man/kubectl)(1), [mlflow](/man/mlflow)(1)
