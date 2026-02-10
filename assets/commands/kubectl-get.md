# TAGLINE

lists Kubernetes resources

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

**kubectl get** retrieves and displays one or more Kubernetes resources from the cluster. It is the most frequently used kubectl subcommand for inspecting cluster state, supporting every resource type including pods, deployments, services, nodes, configmaps, and custom resources defined by CRDs.

The command provides flexible output formatting through the `-o` flag, including human-readable tables, YAML, JSON, JSONPath expressions, and custom column definitions. Results can be filtered by label selectors, field selectors, and namespaces, or retrieved across all namespaces with the `-A` flag. The `--watch` flag enables real-time streaming of resource changes via the Kubernetes watch API.

By default, the output shows a summary table with key fields like name, status, and age. The `wide` output format adds additional columns such as node assignments and IP addresses, while structured formats like YAML and JSON return the complete resource specification for scripting and automation.

# CAVEATS

Subcommand of kubectl. Wide output for more columns. Watch doesn't catch all changes.

# HISTORY

kubectl get is the primary resource listing command for **Kubernetes** cluster inspection.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-describe](/man/kubectl-describe)(1), [kubectl-watch](/man/kubectl-watch)(1)
