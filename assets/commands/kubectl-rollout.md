# TAGLINE

manages deployment rollouts

# TLDR

**Check rollout status**

```kubectl rollout status deployment/[name]```

**View rollout history**

```kubectl rollout history deployment/[name]```

**Undo rollout**

```kubectl rollout undo deployment/[name]```

**Rollback to revision**

```kubectl rollout undo deployment/[name] --to-revision=[2]```

**Pause rollout**

```kubectl rollout pause deployment/[name]```

**Resume rollout**

```kubectl rollout resume deployment/[name]```

**Restart rollout**

```kubectl rollout restart deployment/[name]```

# SYNOPSIS

**kubectl rollout** _command_ [_options_] _resource_

# PARAMETERS

**status** _RESOURCE_
> Check rollout status.

**history** _RESOURCE_
> View revision history.

**undo** _RESOURCE_
> Rollback to previous.

**pause** _RESOURCE_
> Pause rollout.

**resume** _RESOURCE_
> Resume paused rollout.

**restart** _RESOURCE_
> Trigger rolling restart.

**--to-revision** _N_
> Target revision.

**--help**
> Display help information.

# DESCRIPTION

**kubectl rollout** manages the lifecycle of rolling updates for Kubernetes workloads including deployments, daemon sets, and stateful sets. It provides subcommands to monitor the progress of an ongoing rollout, inspect revision history, and trigger rollbacks to previous versions when issues are detected.

The command also supports pausing and resuming rollouts, which is useful for performing canary-style deployments where you want to verify a partial update before allowing it to proceed. The `restart` subcommand triggers a new rolling restart of all pods without changing the pod template, which is helpful for picking up ConfigMap or Secret changes. Each rollout is tracked as a numbered revision, enabling precise rollbacks with --to-revision.

# CAVEATS

Subcommand of kubectl. Works with deployments, statefulsets. Revision history has limits.

# HISTORY

kubectl rollout provides rollout management for **Kubernetes** deployment lifecycle operations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-set](/man/kubectl-set)(1)
