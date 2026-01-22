# TLDR

**Set image**

```kubectl set image deployment/[name] [container]=[image:tag]```

**Set environment**

```kubectl set env deployment/[name] [KEY=value]```

**Set resources**

```kubectl set resources deployment/[name] -c [container] --limits=[cpu=200m,memory=512Mi]```

**Set service account**

```kubectl set serviceaccount deployment/[name] [sa-name]```

**Set selector**

```kubectl set selector service/[name] [app=myapp]```

# SYNOPSIS

**kubectl set** _command_ [_options_]

# PARAMETERS

**image** _RESOURCE_ _CONTAINER=IMAGE_
> Update container image.

**env** _RESOURCE_ _VAR=VALUE_
> Set environment variables.

**resources** _RESOURCE_
> Set resource limits.

**serviceaccount** _RESOURCE_ _SA_
> Set service account.

**selector** _RESOURCE_ _LABELS_
> Set selector.

**--help**
> Display help information.

# DESCRIPTION

**kubectl set** updates resource fields. It modifies specific aspects of running workloads.

The command is faster than full apply for targeted changes. It triggers rollouts for deployments.

kubectl set updates resource fields.

# CAVEATS

Subcommand of kubectl. Triggers rollout. Consider apply for declarative management.

# HISTORY

kubectl set provides targeted resource updates for **Kubernetes** operational tasks.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-rollout](/man/kubectl-rollout)(1)
