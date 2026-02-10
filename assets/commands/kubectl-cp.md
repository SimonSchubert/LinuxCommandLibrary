# TAGLINE

copies files and directories between local filesystem and containers in pods

# TLDR

**Copy file to pod**

```kubectl cp [localfile] [pod-name]:[/path/in/container]```

**Copy file from pod**

```kubectl cp [pod-name]:[/path/in/container] [localfile]```

**Copy to specific container**

```kubectl cp [localfile] [pod-name]:[path] -c [container]```

**Copy entire directory**

```kubectl cp [localdir] [pod-name]:[/remote/dir]```

# SYNOPSIS

**kubectl** **cp** _src_ _dest_ [_options_]

# PARAMETERS

**-c**, **--container** _name_
> Container name in multi-container pod.

**-n**, **--namespace** _name_
> Kubernetes namespace.

**--no-preserve**
> Do not preserve file permissions.

# DESCRIPTION

**kubectl cp** copies files and directories between local filesystem and containers in pods. Uses tar internally, so tar must be present in the container. Supports copying in both directions.

# CAVEATS

Requires tar to be installed in the container. Large file transfers may be slow as data is streamed through the API server.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)

