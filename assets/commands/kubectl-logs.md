# TAGLINE

prints container logs from a pod

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

**kubectl logs** retrieves and displays the standard output and standard error streams from containers running inside Kubernetes pods. It is one of the primary tools for debugging application behavior, diagnosing crashes, and monitoring runtime output in a cluster environment.

The command supports real-time log streaming with the -f flag, similar to `tail -f`, and can target a specific container within a multi-container pod using the -c option. You can also view logs from a previous container instance (useful for inspecting crash loops via --previous), limit output to recent entries with --tail, or filter by time window using --since and --since-time. When used with label selectors, it can aggregate logs across multiple pods simultaneously.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)

