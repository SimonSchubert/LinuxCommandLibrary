# TAGLINE

Interactive Kubernetes log viewer for the terminal

# TLDR

**View logs** from the current Kubernetes context

```kl```

**View logs from a specific namespace**

```kl -n [namespace]```

**View logs matching a pattern**

```kl [pattern]```

# SYNOPSIS

**kl** [_options_] [_pattern_]

# DESCRIPTION

**kl** is an interactive Kubernetes log viewer for the terminal. It allows you to view logs across multiple containers, pods, namespaces, and clusters, selecting containers interactively or through automatic pattern matching against names and labels.

Features include real-time log streaming, container filtering, log archiving, clipboard copying, and fullscreen views. You can focus on logs from specific containers, filter by labels, and toggle different Kubernetes contexts to narrow down the logs you want to view.

# CAVEATS

Requires a working kubectl configuration. Log availability depends on Kubernetes cluster settings and pod log retention policies.

# HISTORY

**kl** was created by **robinovitch61** and is written in **Go**. It was designed as a focused alternative to more general-purpose Kubernetes management tools, specifically optimized for log viewing workflows.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1), [stern](/man/stern)(1)
