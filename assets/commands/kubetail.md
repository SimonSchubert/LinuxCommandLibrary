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

**kubetail** tails logs from multiple pods simultaneously. It aggregates logs matching a pattern.

The tool provides colored output to distinguish pods. It's useful for debugging distributed applications.

kubetail tails multiple pod logs.

# CAVEATS

Third-party tool. Bash script. Requires kubectl.

# HISTORY

kubetail was created to simplify tailing logs from multiple Kubernetes pods with a single command.

# SEE ALSO

[kubectl](/man/kubectl)(1), [stern](/man/stern)(1), [k9s](/man/k9s)(1)
