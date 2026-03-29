# TAGLINE

lists Kubernetes resources

# TLDR

**List pods**

```kubectl get pods```

**List all resources**

```kubectl get all```

**Output a specific pod as YAML**

```kubectl get pod [pod-name] -o yaml```

**Output all pods as JSON**

```kubectl get pods -o json```

**Watch for changes to pods**

```kubectl get pods --watch```

**List pods across all namespaces**

```kubectl get pods -A```

**Filter pods by label**

```kubectl get pods -l [app=nginx]```

**List pods with additional columns** (node, IP)

```kubectl get pods -o wide```

**Custom columns output**

```kubectl get pods -o custom-columns=NAME:.metadata.name,STATUS:.status.phase```

**Get resources from a file**

```kubectl get -f [path/to/manifest.yaml]```

# SYNOPSIS

**kubectl get** [_options_] _TYPE_[._VERSION_][._GROUP_] [_NAME_ | **-l** _label_]

# PARAMETERS

_RESOURCE_
> Resource type (pods, deployments, services, etc.).

_NAME_
> Resource name (optional).

**-o**, **--output** _FORMAT_
> Output format: json, yaml, wide, name, custom-columns, jsonpath, go-template, and more.

**-w**, **--watch**
> Watch for changes after listing the requested objects.

**--watch-only**
> Watch for changes without listing/getting first.

**-A**, **--all-namespaces**
> List objects across all namespaces.

**-l**, **--selector** _SELECTOR_
> Label selector (supports =, ==, !=, in, notin).

**-n**, **--namespace** _NAMESPACE_
> Namespace scope for this request.

**-f**, **--filename** _FILE_
> Filename, directory, or URL to files identifying the resource.

**-k**, **--kustomize** _DIR_
> Process the kustomization directory.

**--sort-by** _JSONPATH_
> Sort list output by the specified JSONPath expression.

**--field-selector** _SELECTOR_
> Filter by field selector (e.g., status.phase=Running).

**-L**, **--label-columns** _LABELS_
> Comma-separated list of labels to present as columns.

**--show-labels**
> Show all labels as the last column of output.

**--show-kind**
> List the resource type for the requested objects.

**--no-headers**
> Omit table headers from output.

**--chunk-size** _N_
> Return large lists in chunks rather than all at once (default 500).

**--ignore-not-found**
> Suppress NotFound errors when getting specific resources.

**-R**, **--recursive**
> Process the directory used in -f recursively.

**--help**
> Display help information.

# DESCRIPTION

**kubectl get** retrieves and displays one or more Kubernetes resources from the cluster. It is the most frequently used kubectl subcommand for inspecting cluster state, supporting every resource type including pods, deployments, services, nodes, configmaps, and custom resources defined by CRDs.

The command provides flexible output formatting through the `-o` flag, including human-readable tables, YAML, JSON, JSONPath expressions, and custom column definitions. Results can be filtered by label selectors, field selectors, and namespaces, or retrieved across all namespaces with the `-A` flag. The `--watch` flag enables real-time streaming of resource changes via the Kubernetes watch API.

By default, the output shows a summary table with key fields like name, status, and age. The `wide` output format adds additional columns such as node assignments and IP addresses, while structured formats like YAML and JSON return the complete resource specification for scripting and automation.

# CAVEATS

Subcommand of kubectl. By default, only resources in the current namespace are shown; use `-A` to see all namespaces. The `--watch` flag uses the Kubernetes watch API and may miss events during brief disconnections. The `--chunk-size` flag (default 500) controls pagination for large result sets.

# HISTORY

kubectl get is the primary resource listing command for **Kubernetes** cluster inspection.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-describe](/man/kubectl-describe)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-delete](/man/kubectl-delete)(1), [kubectl-logs](/man/kubectl-logs)(1)
