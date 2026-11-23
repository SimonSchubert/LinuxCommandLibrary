# TAGLINE

Canonical Data Science Stack CLI for Kubernetes notebooks

# TLDR

**Initialize DSS** on a Canonical Kubernetes cluster

```dss initialize --kubeconfig "$(sudo k8s config)"```

**Create** a Jupyter notebook with a specific image

```dss create [my-notebook] --image=pytorch```

**List** all notebooks in the DSS environment, without truncation

```dss list --wide```

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

**initialize** [**--kubeconfig** _content_]
> Store cluster credentials, allocate persistent storage for notebooks, and deploy the MLflow model registry.

**create** _name_ [_--image_ _image_]
> Create a new Jupyter notebook of the given _name_ wired to the shared MLflow instance and print its URL. _image_ may be a shorthand (**pytorch**, **pytorch-cuda**, **pytorch-intel**, **tensorflow**, **tensorflow-cuda**, **tensorflow-intel**) or a fully qualified image. Default: **kubeflownotebookswg/jupyter-scipy:v1.8.0**.

**list** [**--wide**]
> List every notebook tracked by DSS in the current cluster. **--wide** shows full information without truncation.

**status**
> Display deployment status, MLflow URL, and detected GPU availability.

**logs** [_name_] [**--all**] [**--mlflow**]
> Print logs for the named notebook, for **--mlflow** (the MLflow pod), or for everything with **--all**.

**start** _name_
> Start a stopped notebook.

**stop** _name_
> Stop a running notebook.

**remove** _name_
> Delete a single notebook and its persistent volume claim.

**purge**
> Tear down every DSS component (notebooks, MLflow, supporting resources). **Irreversible** - all stored data is lost.

**--kubeconfig** _content_
> Content (not path) of a kubeconfig, typically passed as **"$(sudo k8s config)"** or **"$(microk8s config)"**. Only accepted by **initialize**; it is saved to **~/.dss/config** and reused by later commands.

**--help**
> Show usage for **dss** or for a specific subcommand.

# DESCRIPTION

**dss** is the command-line front end to **Canonical's Data Science Stack**, an opinionated bundle of **Jupyter Notebook** images, **MLflow** model tracking, and Kubernetes plumbing distributed as a **snap**. It targets local Canonical Kubernetes (**k8s** snap) clusters but works against any Kubernetes that can host the underlying components.

After **dss initialize**, the cluster runs a shared MLflow server and is ready to host notebook pods. **dss create** spawns a notebook backed by a configurable container image, persistent storage, and a service account that can talk to MLflow. The remaining lifecycle commands (**list**, **status**, **logs**, **start**, **stop**, **remove**, **purge**) operate on those notebooks without requiring direct **kubectl** use.

DSS aims to be the easiest way to get a reproducible local data-science environment with GPU support and experiment tracking, while still leaving the underlying Kubernetes resources accessible to power users.

# CAVEATS

**dss purge** removes every notebook and the MLflow registry; backups must be made beforehand. The default Kubernetes target is the **k8s** snap; for other clusters pass the kubeconfig content to **dss initialize --kubeconfig**. Image shorthands like **pytorch** and **tensorflow** map to pinned image tags, which can change between **dss** releases.

The name **dss** is overloaded - **Dataiku Data Science Studio** ships separate **dsscli** and **dssadmin** binaries, and Open-E's **dss_cli** targets the unrelated DSS storage server. This page documents the Canonical snap.

# CONFIGURATION

The kubeconfig given to **dss initialize** is saved to **~/.dss/config** (inside the snap's home directory) and reused by all later commands. Notebook resources, including the MLflow deployment, live in the **dss** namespace inside the connected Kubernetes cluster.

# HISTORY

**Data Science Stack** is published by **Canonical** as the **data-science-stack** snap. It launched as a streamlined alternative to the full **Charmed Kubeflow** distribution, focusing on a single-machine workflow that pairs Jupyter with MLflow on top of the **k8s** snap.

# SEE ALSO

[kubectl](/man/kubectl)(1), [snap](/man/snap)(1), [mlflow](/man/mlflow)(1), [jupyter](/man/jupyter)(1)

# RESOURCES

```[Source code](https://github.com/canonical/data-science-stack)```

```[Documentation](https://documentation.ubuntu.com/data-science-stack/)```

<!-- verified: 2026-11-23 -->
