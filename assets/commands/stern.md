# TAGLINE

Multi-pod Kubernetes log tailing

# TLDR

**Tail pod logs**

```stern [pod-query]```

**Tail with namespace**

```stern -n [namespace] [pod-query]```

**All namespaces**

```stern --all-namespaces [pod-query]```

**Specific container**

```stern -c [container] [pod-query]```

**Since duration**

```stern --since [10m] [pod-query]```

**Show timestamps**

```stern -t [pod-query]```

**Regex pod matching**

```stern --selector [app=nginx]```

**Output format**

```stern -o json [pod-query]```

# SYNOPSIS

**stern** [_-n namespace_] [_-c container_] [_--since duration_] [_options_] _pod-query_

# PARAMETERS

**-n**, **--namespace** _NS_
> Kubernetes namespace.

**--all-namespaces**, **-A**
> All namespaces.

**-c**, **--container** _NAME_
> Container name.

**--since** _DURATION_
> Logs since duration.

**-t**, **--timestamps**
> Show timestamps.

**-o**, **--output** _FORMAT_
> Output format.

**-s**, **--selector** _SELECTOR_
> Label selector.

**--tail** _N_
> Lines per container.

# DESCRIPTION

**stern** allows you to tail log output from multiple Kubernetes pods and containers simultaneously. It accepts a pod name query (which can be a regular expression) and streams log lines from all matching pods, automatically including new pods as they appear and removing terminated ones.

Each pod and container is assigned a distinct color in the output, making it easy to visually distinguish which log lines come from which source. Stern supports filtering by namespace, container name, and label selectors, and can output logs in various formats including JSON for structured processing.

The tool is particularly useful for debugging microservices where related functionality spans multiple pods or deployments. Unlike `kubectl logs`, which can only follow a single pod at a time, stern aggregates logs across any number of matching pods and gracefully handles pod restarts and scaling events in real time.

# CAVEATS

Requires kubectl access. Many pods may overwhelm. Network latency affects streaming.

# HISTORY

**stern** was created by **Wercker** (now Oracle) for Kubernetes log tailing. It simplifies viewing logs from multiple pods simultaneously.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubetail](/man/kubetail)(1), [k9s](/man/k9s)(1)
