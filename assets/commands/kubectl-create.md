# TLDR

**Create resource from file**

```kubectl create -f [manifest.yaml]```

**Create namespace**

```kubectl create namespace [name]```

**Create secret**

```kubectl create secret generic [name] --from-literal=[key]=[value]```

**Create configmap from file**

```kubectl create configmap [name] --from-file=[path]```

**Create deployment**

```kubectl create deployment [name] --image=[image:tag]```

# SYNOPSIS

**kubectl** **create** _resource_ [_options_]

# PARAMETERS

**-f**, **--filename** _file_
> Create from file or URL.

**namespace** _name_
> Create a namespace.

**deployment** _name_
> Create a deployment.

**secret** _type_ _name_
> Create a secret.

**configmap** _name_
> Create a configmap.

**--dry-run** _mode_
> Preview without creating (client, server).

**-o**, **--output** _format_
> Output format.

# DESCRIPTION

**kubectl create** creates Kubernetes resources from files or command-line input. Unlike apply, create fails if the resource already exists. Supports creating various resource types including deployments, services, secrets, and configmaps.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1)

