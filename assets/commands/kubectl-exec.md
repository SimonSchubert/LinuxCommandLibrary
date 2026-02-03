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

**kubectl exec** executes a command in a container running in a pod. Similar to docker exec. The double dash (--) separates kubectl options from the command to execute.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-attach](/man/kubectl-attach)(1)

