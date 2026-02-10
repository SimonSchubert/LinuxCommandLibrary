# TAGLINE

blocks until conditions are met

# TLDR

**Wait for pod ready**

```kubectl wait --for=condition=Ready pod/[pod-name]```

**Wait for deletion**

```kubectl wait --for=delete pod/[pod-name]```

**Wait with timeout**

```kubectl wait --for=condition=Ready pod/[pod-name] --timeout=[60s]```

**Wait for deployment**

```kubectl wait --for=condition=Available deployment/[name]```

**Wait with selector**

```kubectl wait --for=condition=Ready pods -l [app=myapp]```

**Wait for JSON path**

```kubectl wait --for=jsonpath='{.status.phase}'=Running pod/[name]```

# SYNOPSIS

**kubectl wait** [_options_] _resource_

# PARAMETERS

_RESOURCE_
> Resource to wait for.

**--for** _CONDITION_
> Condition to wait for.

**--timeout** _DURATION_
> Wait timeout.

**-l** _SELECTOR_
> Label selector.

**-n** _NAMESPACE_
> Target namespace.

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

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1)
