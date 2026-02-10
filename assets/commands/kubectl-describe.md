# TAGLINE

shows detailed resource information

# TLDR

**Describe pod**

```kubectl describe pod [pod-name]```

**Describe node**

```kubectl describe node [node-name]```

**Describe deployment**

```kubectl describe deployment [deployment-name]```

**Describe with selector**

```kubectl describe pods -l [app=myapp]```

**Describe in namespace**

```kubectl describe pod [pod-name] -n [namespace]```

# SYNOPSIS

**kubectl describe** [_options_] _resource_ [_name_]

# PARAMETERS

_RESOURCE_
> Resource type (pod, node, deployment, etc.).

_NAME_
> Resource name (optional).

**-l** _SELECTOR_
> Label selector.

**-n** _NAMESPACE_
> Target namespace.

**--all-namespaces**
> Search all namespaces.

**--help**
> Display help information.

# DESCRIPTION

**kubectl describe** produces a detailed, human-readable summary of one or more Kubernetes resources. Unlike `kubectl get`, which returns structured data fields, describe aggregates information from multiple API calls to present a comprehensive view that includes resource metadata, spec, current status, conditions, allocated resources, mounted volumes, and associated events.

The command is particularly valuable for troubleshooting, as the Events section at the bottom of the output shows recent actions taken by controllers, schedulers, and the kubelet -- such as image pull failures, scheduling decisions, readiness probe results, and container restarts. For nodes, it displays capacity, allocatable resources, running pods, and system conditions.

Output from describe is formatted for human consumption and should not be parsed programmatically. For structured data suitable for scripting, use `kubectl get -o json` or `kubectl get -o yaml` instead.

# CAVEATS

Subcommand of kubectl. Output not for parsing. Use get -o json for structured data.

# HISTORY

kubectl describe provides detailed resource inspection for **Kubernetes** troubleshooting.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1), [kubectl-logs](/man/kubectl-logs)(1)
