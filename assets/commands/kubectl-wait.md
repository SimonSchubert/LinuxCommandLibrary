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

**kubectl wait** blocks until conditions are met. It waits for resources to reach desired states.

The command is useful in scripts and CI/CD. It supports various conditions and JSON path checks.

kubectl wait blocks on conditions.

# CAVEATS

Subcommand of kubectl. Blocks execution. Set reasonable timeouts.

# HISTORY

kubectl wait provides synchronization for **Kubernetes** automation and scripting.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1)
