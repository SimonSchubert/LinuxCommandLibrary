# TAGLINE

executes a command in a container running in a pod

# TLDR

**Execute command in pod**

```kubectl exec [pod-name] -- [command]```

**Open interactive shell**

```kubectl exec -it [pod-name] -- /bin/sh```

**Execute in specific container**

```kubectl exec [pod-name] -c [container] -- [command]```

**Execute bash in pod**

```kubectl exec -it [pod-name] -- /bin/bash```

# SYNOPSIS

**kubectl** **exec** [_options_] _pod-name_ **--** _command_ [_args_...]

# PARAMETERS

**-c**, **--container** _name_
> Container name in multi-container pod.

**-i**, **--stdin**
> Pass stdin to container.

**-t**, **--tty**
> Allocate TTY.

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl exec** runs a command directly inside a container that is part of a running Kubernetes pod, functioning similarly to `docker exec`. It establishes a connection to the container's runtime environment through the Kubernetes API server and kubelet, allowing you to inspect files, run diagnostics, or open an interactive shell session.

The double dash (--) is required to separate kubectl flags from the command and its arguments that should be passed to the container. When combined with -i (stdin) and -t (tty) flags, it provides a fully interactive terminal session. For pods with multiple containers, the -c flag lets you specify which container to target.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-attach](/man/kubectl-attach)(1)

