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

**kubectl describe** shows detailed resource information. It displays configuration, status, and events.

The command provides more detail than get. It's useful for debugging and inspecting resources.

kubectl describe shows resource details.

# CAVEATS

Subcommand of kubectl. Output not for parsing. Use get -o json for structured data.

# HISTORY

kubectl describe provides detailed resource inspection for **Kubernetes** troubleshooting.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1), [kubectl-logs](/man/kubectl-logs)(1)
