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

**Copy from pod in specific namespace**

```kubectl cp [namespace]/[pod-name]:[/path/in/container] [localfile]```

**Copy without preserving permissions**

```kubectl cp [localfile] [pod-name]:[path] --no-preserve```

# SYNOPSIS

**kubectl** **cp** _src_ _dest_ [_options_]

# PARAMETERS

**-c**, **--container** _name_
> Container name in multi-container pod.

**-n**, **--namespace** _name_
> Kubernetes namespace.

**--no-preserve**
> Do not preserve file ownership and permissions.

**--retries** _int_
> Number of retries on network errors (default: 0).

# DESCRIPTION

**kubectl cp** copies files and directories between local filesystem and containers in pods. Uses tar internally, so tar must be present in the container. Supports copying in both directions.

# CAVEATS

Requires tar to be installed in the container. If tar is missing, the copy will fail. Large file transfers may be slow as data is streamed through the API server. Symlinks in copied directories are not followed. The namespace/pod format uses `/` as separator (e.g., `mynamespace/mypod:/path`).

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-exec](/man/kubectl-exec)(1)

