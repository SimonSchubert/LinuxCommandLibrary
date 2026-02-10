# TAGLINE

provides fuzzy-finding commands for Kubernetes

# TLDR

**Interactive pod selection**

```findpod```

**Tail pod logs**

```tailpod```

**Exec into pod**

```execpod```

**Describe pod**

```describepod```

**Port forward**

```pfpod```

# SYNOPSIS

Commands: **findpod**, **tailpod**, **execpod**, **describepod**, **pfpod**

# PARAMETERS

**findpod**
> Fuzzy find and select pod.

**tailpod**
> Tail logs with fuzzy selection.

**execpod**
> Exec into pod interactively.

**describepod**
> Describe selected pod.

**pfpod**
> Port forward to selected pod.

# DESCRIPTION

**kube-fzf** is a set of shell functions that wrap common kubectl operations with fzf fuzzy-finding for interactive Kubernetes resource selection. Instead of typing exact pod names or copying them from `kubectl get pods` output, kube-fzf presents a searchable, filterable list of resources and executes the chosen kubectl command on the selected item.

The package provides several purpose-built commands: `findpod` for locating and selecting pods, `tailpod` for streaming logs, `execpod` for opening a shell session inside a container, `describepod` for viewing pod details, and `pfpod` for setting up port forwarding. Each command queries the current Kubernetes context and namespace, presents matching pods through fzf's interactive interface, and passes the selection directly to the appropriate kubectl subcommand.

# CAVEATS

Requires fzf installed. Shell functions. kubectl must work.

# HISTORY

kube-fzf combines **fzf** fuzzy finder with kubectl for interactive Kubernetes resource selection.

# SEE ALSO

[kubectl](/man/kubectl)(1), [fzf](/man/fzf)(1), [k9s](/man/k9s)(1)
