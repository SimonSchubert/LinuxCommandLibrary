# TLDR

**List pods**

```kubectl get pods```

**List all resources**

```kubectl get all```

**Output as YAML**

```kubectl get pod [pod-name] -o yaml```

**Output as JSON**

```kubectl get pods -o json```

**Watch changes**

```kubectl get pods --watch```

**List across namespaces**

```kubectl get pods -A```

**Custom columns**

```kubectl get pods -o custom-columns=NAME:.metadata.name,STATUS:.status.phase```

# SYNOPSIS

**kubectl get** [_options_] _resource_ [_name_]

# PARAMETERS

_RESOURCE_
> Resource type (pods, deployments, services, etc.).

_NAME_
> Resource name (optional).

**-o** _FORMAT_
> Output format (yaml, json, wide, custom-columns).

**--watch**
> Watch for changes.

**-A**, **--all-namespaces**
> All namespaces.

**-l** _SELECTOR_
> Label selector.

**-n** _NAMESPACE_
> Target namespace.

**--help**
> Display help information.

# DESCRIPTION

**kubectl get** lists Kubernetes resources. It's the most common command for viewing cluster state.

The command supports various output formats. It can filter by labels and namespaces.

kubectl get lists cluster resources.

# CAVEATS

Subcommand of kubectl. Wide output for more columns. Watch doesn't catch all changes.

# HISTORY

kubectl get is the primary resource listing command for **Kubernetes** cluster inspection.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-describe](/man/kubectl-describe)(1), [kubectl-watch](/man/kubectl-watch)(1)
