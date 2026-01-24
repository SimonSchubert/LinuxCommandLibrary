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

**stern** tails logs from multiple Kubernetes pods. It aggregates logs matching a pattern.

Pod queries match by name pattern. Regex supported for complex matching.

Container filtering focuses on specific containers. Useful in multi-container pods.

Color coding distinguishes pods. Each pod gets different color.

Real-time streaming shows new logs. Follows as pods scale.

# CAVEATS

Requires kubectl access. Many pods may overwhelm. Network latency affects streaming.

# HISTORY

**stern** was created by **Wercker** (now Oracle) for Kubernetes log tailing. It simplifies viewing logs from multiple pods simultaneously.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubetail](/man/kubetail)(1), [k9s](/man/k9s)(1)
