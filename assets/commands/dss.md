# TAGLINE

Canonical Data Science Stack CLI for Kubernetes notebooks

# TLDR

**Initialize DSS** on a Canonical Kubernetes cluster

```dss initialize --kubeconfig "$(sudo k8s config)"```

**Create** a Jupyter notebook with a specific image

```dss create [my-notebook] --image=pytorch```

**List** all notebooks in the DSS environment

```dss list```

**Show** the status of MLflow, GPUs, and core components

```dss status```

**Print logs** for a specific notebook

```dss logs [my-notebook]```

**Print logs** for the MLflow deployment

```dss logs --mlflow```

**Stop** a running notebook

```dss stop [my-notebook]```

**Start** a previously stopped notebook

```dss start [my-notebook]```

**Remove** a single notebook

```dss remove [my-notebook]```

**Purge** every DSS component and all notebooks (destructive)

```dss purge```

# SYNOPSIS

**dss** _command_ [_options_]

# PARAMETERS

**initialize** [_--kubeconfig_ _file_]
> Store cluster credentials, allocate persistent storage for notebooks, and deploy the MLflow model registry.

**create** _name_ [_--image_ _image_]
> Create a new Jupyter notebook of the given _name_ wired to the shared MLflow instance. _image_ may be a shorthand (**pytorch**, **tensorflow**) or a fully qualified image like **kubeflownotebookswg/jupyter-scipy:v1.8.0**.

**list**
> List every notebook tracked by DSS in the current cluster.

**status**
> Display deployment status, MLflow URL, and detected GPU availability.

**logs** [_name_] [_--kubeconfig_ _file_] [_--all_] [_--mlflow_]
> Print logs for the named notebook, for **--mlflow** (the MLflow pod), or for everything with **--all**.

**start** _name_
> Start a stopped notebook.

**stop** _name_
> Stop a running notebook.

**remove** _name_
> Delete a single notebook and its persistent volume claim.

**purge**
> Tear down every DSS component (notebooks, MLflow, supporting resources). **Irreversible** - all stored data is lost.

**--kubeconfig** _file_
> Path to a kubeconfig file. Used by **initialize** and **logs** when the user is not already authenticated to a cluster.

**--help**
> Show usage for **dss** or for a specific subcommand.

# DESCRIPTION

**dss** is the command-line front end to **Canonical's Data Science Stack**, an opinionated bundle of **Jupyter Notebook** images, **MLflow** model tracking, and Kubernetes plumbing distributed as a **snap**. It targets local Canonical Kubernetes (**k8s** snap) clusters but works against any Kubernetes that can host the underlying components.

After **dss initialize**, the cluster runs a shared MLflow server and is ready to host notebook pods. **dss create** spawns a notebook backed by a configurable container image, persistent storage, and a service account that can talk to MLflow. The remaining lifecycle commands (**list**, **status**, **logs**, **start**, **stop**, **remove**, **purge**) operate on those notebooks without requiring direct **kubectl** use.

DSS aims to be the easiest way to get a reproducible local data-science environment with GPU support and experiment tracking, while still leaving the underlying Kubernetes resources accessible to power users.

# CAVEATS

**dss purge** removes every notebook and the MLflow registry; backups must be made beforehand. The default Kubernetes target is the **k8s** snap; on other distributions pass **--kubeconfig** explicitly. Image shorthands like **pytorch** and **tensorflow** track moving upstream tags, which can change between **dss** releases.

The name **dss** is overloaded - **Dataiku Data Science Studio** ships separate **dsscli** and **dssadmin** binaries, and Open-E's **dss_cli** targets the unrelated DSS storage server. This page documents the Canonical snap.

# CONFIGURATION

DSS state (storage class, MLflow endpoint, kubeconfig reference) is persisted under the snap's data directory, typically **/var/snap/data-science-stack/current/**. Notebook resources, including the MLflow deployment, live in a dedicated namespace inside the connected Kubernetes cluster.

# HISTORY

**Data Science Stack** is published by **Canonical** as the **data-science-stack** snap. It launched as a streamlined alternative to the full **Charmed Kubeflow** distribution, focusing on a single-machine workflow that pairs Jupyter with MLflow on top of the **k8s** snap.

# SEE ALSO

[kubectl](/man/kubectl)(1), [snap](/man/snap)(1), [mlflow](/man/mlflow)(1), [jupyter](/man/jupyter)(1)
