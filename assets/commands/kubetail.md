# TAGLINE

tails logs from multiple pods simultaneously

# TLDR

**Tail pod logs**

```kubetail [pod-name-pattern]```

**Tail with label**

```kubetail -l [app=myapp]```

**Tail in namespace**

```kubetail [pattern] -n [namespace]```

**Tail specific container**

```kubetail [pattern] -c [container]```

**Follow with timestamps**

```kubetail [pattern] -t```

**Colored output**

```kubetail [pattern] -k [pod]```

# SYNOPSIS

**kubetail** [_options_] _pattern_

# PARAMETERS

_PATTERN_
> Pod name pattern.

**-l** _SELECTOR_
> Label selector.

**-n** _NAMESPACE_
> Target namespace.

**-c** _CONTAINER_
> Container name.

**-t**
> Show timestamps.

**-k** _FIELD_
> Color by field.

**--help**
> Display help information.

# DESCRIPTION

**kubetail** is a bash script that aggregates and tails log output from multiple Kubernetes pods simultaneously. It matches pods by name pattern or label selector and streams their logs in a single terminal, using color-coded output to visually distinguish which lines come from which pod.

The tool is especially useful when debugging distributed applications or microservices where relevant log entries are spread across several pod replicas. It supports filtering by namespace, targeting specific containers within multi-container pods, and displaying timestamps alongside log lines. Under the hood, kubetail spawns multiple `kubectl logs --follow` processes and merges their output.

# CAVEATS

Third-party tool. Bash script. Requires kubectl.

# HISTORY

kubetail was created to simplify tailing logs from multiple Kubernetes pods with a single command.

# SEE ALSO

[kubectl](/man/kubectl)(1), [stern](/man/stern)(1), [k9s](/man/k9s)(1)
