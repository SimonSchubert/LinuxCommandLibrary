# TAGLINE

creates and runs pods

# TLDR

**Run pod**

```kubectl run [pod-name] --image=[nginx]```

**Run interactive pod**

```kubectl run [pod-name] --image=[busybox] -it --rm -- [/bin/sh]```

**Run with port**

```kubectl run [pod-name] --image=[nginx] --port=[80]```

**Run with env vars**

```kubectl run [pod-name] --image=[nginx] --env="[KEY=value]"```

**Dry run output**

```kubectl run [pod-name] --image=[nginx] --dry-run=client -o yaml```

**Run with command**

```kubectl run [pod-name] --image=[busybox] -- [echo hello]```

# SYNOPSIS

**kubectl run** [_options_] _name_ **--image=**_image_

# PARAMETERS

_NAME_
> Pod name.

**--image** _IMAGE_
> Container image.

**-it**
> Interactive TTY.

**--rm**
> Delete pod on exit.

**--port** _PORT_
> Container port.

**--env** _VAR=VALUE_
> Environment variable.

**--dry-run** _MODE_
> Don't create resource.

**--help**
> Display help information.

# DESCRIPTION

**kubectl run** creates and starts a single pod in the cluster from a specified container image. It is designed for quick, ad-hoc pod creation and is commonly used for debugging, running one-off tasks, and testing container images without writing a full manifest file.

The command supports interactive mode with `-it` for attaching a terminal session directly to the container, which is useful for launching temporary troubleshooting pods with tools like busybox or curl. Combined with `--rm`, the pod is automatically deleted when the session ends. The `--dry-run=client -o yaml` pattern is frequently used to generate a pod manifest template that can be customized and applied separately.

In earlier Kubernetes versions, `kubectl run` could create deployments and other resource types, but it now exclusively creates standalone pods. For production workloads, use deployments, statefulsets, or jobs instead to get replication, rolling updates, and self-healing capabilities.

# CAVEATS

Subcommand of kubectl. Creates only pods now. Use deployments for production.

# HISTORY

kubectl run provides quick pod creation for **Kubernetes** testing and debugging.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-exec](/man/kubectl-exec)(1)
