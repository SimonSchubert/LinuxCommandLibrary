# TLDR

**Delete pod**

```kubectl delete pod [pod-name]```

**Delete from manifest**

```kubectl delete -f [manifest.yaml]```

**Delete all pods**

```kubectl delete pods --all```

**Delete by label**

```kubectl delete pods -l [app=myapp]```

**Force delete**

```kubectl delete pod [pod-name] --force --grace-period=0```

**Delete namespace**

```kubectl delete namespace [namespace]```

# SYNOPSIS

**kubectl delete** [_options_] _resource_ [_name_]

# PARAMETERS

_RESOURCE_
> Resource type.

_NAME_
> Resource name.

**-f** _FILE_
> Delete from file.

**-l** _SELECTOR_
> Label selector.

**--all**
> Delete all resources.

**--force**
> Force deletion.

**--grace-period** _N_
> Grace period seconds.

**--help**
> Display help information.

# DESCRIPTION

**kubectl delete** removes Kubernetes resources. It deletes pods, deployments, services, and other objects.

The command respects grace periods for graceful shutdown. Force delete bypasses graceful termination.

kubectl delete removes resources.

# CAVEATS

Subcommand of kubectl. Destructive operation. Consider --dry-run first.

# HISTORY

kubectl delete provides resource removal for **Kubernetes** cluster management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-create](/man/kubectl-create)(1)
