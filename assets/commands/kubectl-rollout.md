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

**kubectl rollout** manages deployment rollouts. It controls the update process for workloads.

The command enables rollbacks, pauses, and restarts. It shows revision history for tracking.

kubectl rollout manages deployments.

# CAVEATS

Subcommand of kubectl. Works with deployments, statefulsets. Revision history has limits.

# HISTORY

kubectl rollout provides rollout management for **Kubernetes** deployment lifecycle operations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-set](/man/kubectl-set)(1)
