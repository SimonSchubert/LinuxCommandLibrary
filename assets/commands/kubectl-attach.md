# TAGLINE

attaches to a running container in a pod

# TLDR

**Attach to running pod**

```kubectl attach [pod-name]```

**Attach to specific container in pod**

```kubectl attach [pod-name] -c [container-name]```

**Interactive attach with TTY**

```kubectl attach [pod-name] -c [container-name] -i -t```

**Attach to first pod of a replica set**

```kubectl attach rs/[nginx]```

**Attach within a namespace**

```kubectl attach [pod-name] -n [namespace]```

# SYNOPSIS

**kubectl attach** (_POD_ | _TYPE/NAME_) [**-c** _CONTAINER_] [_options_]

# PARAMETERS

**-c**, **--container** _name_
> Container name. If omitted, uses the `kubectl.kubernetes.io/default-container` annotation or the first container in the pod.

**-i**, **--stdin**
> Pass stdin to the container.

**-t**, **--tty**
> Stdin is a TTY (allocate a terminal).

**-q**, **--quiet**
> Only print output from the remote session.

**--pod-running-timeout** _duration_
> Time to wait until at least one pod is running (default: 1m0s).

**-n**, **--namespace** _name_
> Namespace scope for the request.

**--context** _name_
> Kubeconfig context to use.

**--kubeconfig** _path_
> Path to the kubeconfig file.

# DESCRIPTION

**kubectl attach** connects your terminal to the stdin/stdout/stderr streams of a process already running inside a container. Unlike **kubectl exec**, which spawns a new process in the container, **attach** hooks into the container's PID 1 (the main command defined in the image or pod spec), so you see the same output as the container's log stream and can send input to that process when it was started with stdin open.

Use **-i -t** together to get a full interactive shell experience when the container was started with an interactive command (e.g., a pod created with `kubectl run -it`). To attach to a specific container in a multi-container pod, pass **-c**. Detach with the escape sequence **Ctrl-P Ctrl-Q** to leave the process running.

# CAVEATS

The target container must have been started with stdin open (**stdin: true** in the pod spec or **-i** on `kubectl run`) for input to be delivered. Attaching does not restart the process; closing the connection improperly with Ctrl-C may signal the process. Only one attach session per container stream is reliable.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1), [kubectl-logs](/man/kubectl-logs)(1), [kubectl-run](/man/kubectl-run)(1)

