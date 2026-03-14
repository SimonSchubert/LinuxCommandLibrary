# TAGLINE

manage the rollout of deployments, daemonsets, and statefulsets

# TLDR

**Check rollout status of a deployment**

```kubectl rollout status deployment/[name]```

**Watch rollout status with a timeout**

```kubectl rollout status deployment/[name] --timeout=[5m]```

**View rollout history**

```kubectl rollout history deployment/[name]```

**View details of a specific revision**

```kubectl rollout history deployment/[name] --revision=[3]```

**Undo rollout to the previous revision**

```kubectl rollout undo deployment/[name]```

**Rollback to a specific revision**

```kubectl rollout undo deployment/[name] --to-revision=[2]```

**Pause a rollout**

```kubectl rollout pause deployment/[name]```

**Resume a paused rollout**

```kubectl rollout resume deployment/[name]```

**Restart all pods in a deployment without changing the template**

```kubectl rollout restart deployment/[name]```

**Restart deployments matching a label selector**

```kubectl rollout restart deployment --selector=[app=nginx]```

# SYNOPSIS

**kubectl rollout** _SUBCOMMAND_ [_options_]

# PARAMETERS

**history** _TYPE/NAME_
> View rollout revision history.

**pause** _TYPE/NAME_
> Mark the provided resource as paused.

**restart** _TYPE/NAME_
> Trigger a rolling restart of all pods.

**resume** _TYPE/NAME_
> Resume a paused rollout.

**status** _TYPE/NAME_
> Show the status of the rollout.

**undo** _TYPE/NAME_
> Undo a previous rollout.

**--revision** _N_
> Pin to a specific revision for history or status.

**--to-revision** _N_
> Target revision for undo (default 0 means previous).

**--timeout** _DURATION_
> Time to wait before ending status watch (e.g. 5m).

**-w**, **--watch**
> Watch the status of rollout until done (default true).

**-f**, **--filename** _FILE_
> Filename, directory, or URL identifying the resource.

**-l**, **--selector** _SELECTOR_
> Label selector to filter resources.

**-R**, **--recursive**
> Process the directory used in -f recursively.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**kubectl rollout** manages the lifecycle of rolling updates for Kubernetes workloads including deployments, daemon sets, and stateful sets. It provides subcommands to monitor the progress of an ongoing rollout, inspect revision history, and trigger rollbacks to previous versions when issues are detected.

The command also supports pausing and resuming rollouts, which is useful for performing canary-style deployments where you want to verify a partial update before allowing it to proceed. The `restart` subcommand triggers a new rolling restart of all pods without changing the pod template, which is helpful for picking up ConfigMap or Secret changes. Each rollout is tracked as a numbered revision, enabling precise rollbacks with --to-revision.

# CAVEATS

Only works with deployments, daemonsets, and statefulsets. Revision history depth is controlled by the `.spec.revisionHistoryLimit` field (default 10). Pausing a rollout prevents both rollback and new rollouts until resumed. The `restart` subcommand does not change the pod template; it updates an annotation to trigger a new rollout.

# HISTORY

kubectl rollout has been part of **kubectl** since early versions of **Kubernetes**, providing declarative lifecycle management for workload rollouts.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-set](/man/kubectl-set)(1), [kubectl-get](/man/kubectl-get)(1), [kubectl-scale](/man/kubectl-scale)(1)
