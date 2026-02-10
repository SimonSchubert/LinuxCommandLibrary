# TAGLINE

kubeflow provides machine learning toolkits on Kubernetes

# TLDR

**Install Kubeflow on cluster**

```kfctl apply -f [kfctl_config.yaml]```

**Deploy using manifest**

```kubectl apply -k [manifests/]```

**Check Kubeflow pods**

```kubectl get pods -n kubeflow```

**Port-forward to dashboard**

```kubectl port-forward svc/istio-ingressgateway -n istio-system [8080]:80```

**Submit a pipeline run**

```kfp run submit -e [experiment] -r [run-name] -p [pipeline.yaml]```

**List pipelines**

```kfp pipeline list```

**Upload a pipeline**

```kfp pipeline upload -p [pipeline-name] [pipeline.yaml]```

**Create experiment**

```kfp experiment create -n [experiment-name]```

# SYNOPSIS

**kfctl** apply|delete|build [_options_]

**kfp** _command_ [_options_]

# KFCTL COMMANDS

**apply** -f _config_
> Deploy Kubeflow using configuration.

**delete** -f _config_
> Remove Kubeflow deployment.

**build** -f _config_
> Generate Kubeflow manifests.

# KFP COMMANDS

**run** submit|list|get
> Manage pipeline runs.

**pipeline** upload|list|get|delete
> Manage pipelines.

**experiment** create|list|get|delete
> Manage experiments.

**component** build
> Build component from Python function.

**diagnose_me**
> Diagnose KFP installation.

# PARAMETERS

**-f**, **--file** _config_
> Configuration file path.

**-e**, **--experiment** _name_
> Experiment name or ID.

**-r**, **--run-name** _name_
> Name for the run.

**-p**, **--pipeline** _file_
> Pipeline file or ID.

**-n**, **--namespace** _namespace_
> Kubernetes namespace.

**--endpoint** _url_
> KFP API endpoint.

# DESCRIPTION

Kubeflow provides machine learning toolkits on Kubernetes. **kfctl** deploys Kubeflow components; **kfp** manages ML pipelines.

Installation uses **kfctl** with platform-specific configurations for GKE, EKS, AKS, or vanilla Kubernetes. Modern installations often use kustomize manifests with **kubectl apply**.

Kubeflow Pipelines (**kfp**) orchestrate ML workflows as DAGs. Pipelines define components, inputs, outputs, and dependencies. Submit compiled pipelines (YAML/JSON) to the Pipelines service.

The central dashboard provides access to Notebooks (Jupyter), Pipelines, Katib (hyperparameter tuning), KServe (model serving), and other components.

Experiments organize runs. Each run executes a pipeline version with specific parameters. The UI shows run status, logs, metrics, and artifacts.

# CAVEATS

Resource-intensive; requires substantial cluster capacity. Installation complexity varies by platform. Component versions may have compatibility issues. Istio is typically required. Multi-user mode needs additional configuration.

# HISTORY

Kubeflow was started at **Google** in **2017** as a way to run TensorFlow on Kubernetes. Open-sourced in **2018**, it expanded to support the full ML lifecycle. Version 1.0 released in **2020**. The project is now a **CNCF sandbox project**. Components have modularized, allowing selective installation. KServe (formerly KFServing) became its own project.

# SEE ALSO

[kubectl](/man/kubectl)(1), [mlflow](/man/mlflow)(1), [argo](/man/argo)(1), [kserve](/man/kserve)(1)
