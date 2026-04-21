# TAGLINE

blocks until conditions are met

# TLDR

**Wait for pod ready**

```kubectl wait --for=condition=Ready pod/[pod-name]```

**Wait for deletion**

```kubectl wait --for=delete pod/[pod-name]```

**Wait for creation**

```kubectl wait --for=create secret/[name]```

**Wait with timeout**

```kubectl wait --for=condition=Ready pod/[pod-name] --timeout=[60s]```

**Wait for deployment available**

```kubectl wait --for=condition=Available deployment/[name]```

**Wait with label selector across resources**

```kubectl wait --for=condition=Ready pods -l [app=myapp]```

**Wait for a JSONPath value**

```kubectl wait --for=jsonpath='{.status.phase}'=Running pod/[name]```

**Wait across all namespaces**

```kubectl wait --for=condition=Ready pods --all -A```

# SYNOPSIS

**kubectl wait** [_options_] _resource_

# PARAMETERS

_RESOURCE_
> Resource(s) to wait on, e.g. `pod/busybox`, `deployment/web`, or a type like `pods`.

**--for** _EXPR_
> Condition to wait on. Accepts `create`, `delete`, `condition=<name>[=<value>]`, or `jsonpath='{...}'[=<value>]`. Default condition value is `true`.

**--timeout** _DURATION_
> Maximum time to wait (e.g. 30s, 5m). Default is 30s. Zero means check once; a negative value waits up to a week.

**--all**
> Select all resources of the given type in the namespace.

**-A**, **--all-namespaces**
> Operate across all namespaces.

**-l**, **--selector** _QUERY_
> Label selector to filter resources.

**--field-selector** _QUERY_
> Field selector to filter resources.

**-f**, **--filename** _FILE_
> Identify the resource(s) via a manifest file or directory.

**-n**, **--namespace** _NS_
> Target namespace.

**-o**, **--output** _FORMAT_
> Output format (json, yaml, name, go-template, jsonpath, ...).

**--help**
> Display help information.

# DESCRIPTION

**kubectl wait** blocks execution until one or more Kubernetes resources reach a specified condition, making it an essential synchronization primitive for shell scripts, CI/CD pipelines, and automation workflows. Rather than polling with repeated `kubectl get` calls, it efficiently watches the resource and returns as soon as the condition is satisfied or the timeout expires.

The command supports built-in condition checks such as `condition=Ready` and `condition=Available`, resource deletion events via `--for=delete`, and arbitrary field matching through JSONPath expressions like `jsonpath='{.status.phase}'=Running`. It can target individual resources by name or groups of resources matched by label selectors, and always defaults to a 30-second timeout unless overridden with --timeout.

# CAVEATS

Subcommand of kubectl. Blocks execution. Set reasonable timeouts.

# HISTORY

kubectl wait provides synchronization for **Kubernetes** automation and scripting.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-rollout](/man/kubectl-rollout)(1), [kubectl-describe](/man/kubectl-describe)(1)
