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

**kubectl run** creates and runs pods. It provides quick pod deployment for testing.

The command generates pod specifications. Use dry-run to output YAML for modification.

kubectl run creates pods quickly.

# CAVEATS

Subcommand of kubectl. Creates only pods now. Use deployments for production.

# HISTORY

kubectl run provides quick pod creation for **Kubernetes** testing and debugging.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-exec](/man/kubectl-exec)(1)
