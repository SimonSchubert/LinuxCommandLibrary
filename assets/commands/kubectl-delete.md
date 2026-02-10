# TAGLINE

removes Kubernetes resources

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

**kubectl delete** removes one or more resources from a Kubernetes cluster. It can target resources by name, label selector, or by referencing the same manifest files used to create them, making it straightforward to tear down everything defined in a YAML file or directory.

By default, the command sends a graceful termination signal and waits for the resource's grace period (typically 30 seconds for pods) before forcibly removing it. During this window, pods receive a SIGTERM and can perform cleanup operations like draining connections or saving state. The `--force --grace-period=0` flags bypass graceful shutdown and immediately remove the resource from the API server, which is useful for stuck pods but may cause data loss.

Deleting higher-level resources like deployments or statefulsets cascades to their managed pods by default. Deleting a namespace removes all resources within it, so this operation should be used with caution in shared environments.

# CAVEATS

Subcommand of kubectl. Destructive operation. Consider --dry-run first.

# HISTORY

kubectl delete provides resource removal for **Kubernetes** cluster management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-create](/man/kubectl-create)(1)
