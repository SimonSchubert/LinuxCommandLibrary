# TAGLINE

Kubeflow Pipelines CLI for managing ML workflows on Kubernetes

# TLDR

**Create a pipeline run from a compiled pipeline**

```kfp --endpoint [http://localhost:8080] run create -e [experiment] -r [run-name] -f [pipeline.yaml]```

**List pipelines**

```kfp --endpoint [http://localhost:8080] pipeline list```

**Upload a pipeline**

```kfp --endpoint [http://localhost:8080] pipeline create -p [pipeline-name] [pipeline.yaml]```

**Create an experiment**

```kfp --endpoint [http://localhost:8080] experiment create [experiment-name]```

**Compile a pipeline from Python**

```kfp dsl compile --py [pipeline.py] --output [pipeline.yaml]```

**Diagnose KFP installation**

```kfp diagnose_me```

# SYNOPSIS

**kfp** [_global options_] _command_ _subcommand_ [_options_]

# PARAMETERS

**run** create|list|get|archive|unarchive|delete
> Manage pipeline runs.

**recurring-run** create|list|get|enable|disable|delete
> Manage scheduled recurring runs.

**pipeline** create|create-version|list|list-versions|get|get-version|delete|delete-version
> Manage pipelines.

**experiment** create|list|get|delete|archive|unarchive
> Manage experiments.

**dsl** compile
> Compile a Python pipeline definition to YAML.

**component** build
> Build a containerized component from a Python function.

**diagnose_me**
> Run environment diagnostics (GCP-focused).

**--endpoint** _url_
> Global option: KFP API endpoint URL. Goes before the command.

**-n**, **--namespace** _namespace_
> Global option: Kubernetes namespace to connect to.

**--output** _format_
> Global option: output format for results, default table.

**--existing-token** _token_
> Global option: pass in a token directly.

**run create -e**, **--experiment-name** _name_
> Experiment for the run.

**run create -r**, **--run-name** _name_
> Name for the run.

**run create -f**, **--package-file** _file_
> Compiled pipeline file (YAML).

**run create -w**, **--watch**
> Watch the run status until it finishes.

**pipeline create -p**, **--pipeline-name** _name_
> Name of the pipeline.

**dsl compile --py** _file_ **--output** _file_
> Python file containing the pipeline, and the output YAML path.

# DESCRIPTION

**kfp** is the CLI for **Kubeflow Pipelines**, which orchestrates ML workflows as directed acyclic graphs (DAGs) on Kubernetes. Pipelines define reusable components with inputs, outputs, and dependencies.

The CLI manages the full pipeline lifecycle: compiling Python pipeline definitions to YAML, uploading pipelines, creating experiments, and submitting runs. It connects to a running KFP backend via the global `--endpoint` flag, which must precede the command (`kfp --endpoint URL run list`).

Kubeflow itself is installed using Kustomize manifests via `kubectl apply -k` from the **kubeflow/manifests** repository. The older **kfctl** deployment tool is deprecated and archived.

# CAVEATS

Resource-intensive; requires a Kubernetes cluster with sufficient capacity. The `diagnose_me` command is GCP-focused. The old `kfp run submit` syntax still works as a deprecated alias for `kfp run create`. Similarly, `kfp pipeline upload` is aliased to `kfp pipeline create`, and `kfp pipeline upload-version` to `create-version`.

# HISTORY

Kubeflow was started at **Google** in **2017** as a way to run TensorFlow on Kubernetes. Open-sourced in **2018**, it expanded to support the full ML lifecycle. Version 1.0 released in **2020**. The project is a **CNCF incubating project**. The kfp v2 SDK brought a redesigned Python API and CLI with `dsl compile` and simplified component authoring.

# SEE ALSO

[kubectl](/man/kubectl)(1), [mlflow](/man/mlflow)(1)

# RESOURCES

```[Source code](https://github.com/kubeflow/pipelines)```

```[Documentation](https://www.kubeflow.org/docs/components/pipelines/)```

<!-- verified: 2026-11-09 -->
