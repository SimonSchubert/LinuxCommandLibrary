# TLDR

**Attach to running container**

```kubectl attach [pod-name]```

**Attach to specific container in pod**

```kubectl attach [pod-name] -c [container-name]```

**Attach with stdin enabled**

```kubectl attach -it [pod-name]```

# SYNOPSIS

**kubectl** **attach** [_options_] _pod-name_

# PARAMETERS

**-c**, **--container** _name_
> Container name in multi-container pod.

**-i**, **--stdin**
> Pass stdin to container.

**-t**, **--tty**
> Allocate TTY for container.

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl attach** attaches to a running container in a pod. Allows interacting with processes already running in the container. Unlike exec, attach connects to the main container process rather than starting a new one.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)

