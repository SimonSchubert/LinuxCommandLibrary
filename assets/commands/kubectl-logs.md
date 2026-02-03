# TLDR

**View pod logs**

```kubectl logs [pod-name]```

**Follow logs in real-time**

```kubectl logs -f [pod-name]```

**View specific container logs**

```kubectl logs [pod-name] -c [container]```

**View previous container logs**

```kubectl logs [pod-name] --previous```

**Show last N lines**

```kubectl logs [pod-name] --tail=[100]```

**View logs from last hour**

```kubectl logs [pod-name] --since=[1h]```

# SYNOPSIS

**kubectl** **logs** [_options_] _pod-name_

# PARAMETERS

**-f**, **--follow**
> Stream logs continuously.

**-c**, **--container** _name_
> Container name.

**--previous**
> Print previous container logs.

**--tail** _lines_
> Number of lines from end.

**--since** _duration_
> Show logs newer than duration.

**--timestamps**
> Include timestamps.

# DESCRIPTION

**kubectl logs** prints container logs from a pod. Supports following logs in real-time, viewing previous container instances, and filtering by time. Essential for debugging and monitoring applications.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)

