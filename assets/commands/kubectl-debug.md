# TAGLINE

creates ephemeral debug containers

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

**kubectl debug** creates ephemeral containers within running pods or nodes for interactive troubleshooting without modifying the original pod specification. This is especially useful for debugging minimal or distroless container images that lack shells and diagnostic tools, as the debug container can be based on a full-featured image like busybox or alpine while sharing the target pod's network and process namespaces.

The command supports several debugging strategies. An ephemeral container can be injected directly into an existing pod, or the pod can be copied with `--copy-to` to create an isolated debug clone that leaves the original workload undisturbed. For node-level troubleshooting, `kubectl debug node/` creates a privileged pod on the specified node with the host filesystem mounted, providing access to the node's operating system for diagnosing system-level issues. The `--share-processes` flag enables process namespace sharing so the debug container can see and interact with processes in other containers within the same pod.

# CAVEATS

Subcommand of kubectl. Requires ephemeral containers support. Image must have needed tools.

# HISTORY

kubectl debug was added to **Kubernetes** for non-invasive debugging of running workloads.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)
