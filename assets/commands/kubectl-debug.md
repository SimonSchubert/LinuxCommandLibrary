# TLDR

**Debug pod**

```kubectl debug [pod-name] -it --image=[busybox]```

**Copy pod for debugging**

```kubectl debug [pod-name] -it --copy-to=[debug-pod]```

**Debug with different container**

```kubectl debug [pod-name] -it --container=[container] --image=[image]```

**Debug node**

```kubectl debug node/[node-name] -it --image=[busybox]```

**Share process namespace**

```kubectl debug [pod-name] -it --image=[busybox] --share-processes```

# SYNOPSIS

**kubectl debug** [_options_] _resource_

# PARAMETERS

_RESOURCE_
> Pod or node to debug.

**--image** _IMAGE_
> Debug container image.

**-it**
> Interactive TTY.

**--copy-to** _NAME_
> Create debug copy.

**--container** _NAME_
> Target container.

**--share-processes**
> Share process namespace.

**--help**
> Display help information.

# DESCRIPTION

**kubectl debug** creates ephemeral debug containers. It attaches debugging tools to running pods or nodes.

The command enables inspection without modifying pod specs. It supports copying pods for safe debugging.

kubectl debug adds debug containers.

# CAVEATS

Subcommand of kubectl. Requires ephemeral containers support. Image must have needed tools.

# HISTORY

kubectl debug was added to **Kubernetes** for non-invasive debugging of running workloads.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)
