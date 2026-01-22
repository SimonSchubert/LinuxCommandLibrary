# TLDR

**Start k9s**

```k9s```

**Start in namespace**

```k9s -n [namespace]```

**Start with specific context**

```k9s --context [context-name]```

**Start read-only**

```k9s --readonly```

**Show specific resource**

```k9s --command [pods|deployments|services]```

**List all clusters**

```k9s --all-namespaces```

# SYNOPSIS

**k9s** [_options_]

# PARAMETERS

**-n** _NAMESPACE_
> Start in namespace.

**--context** _NAME_
> Kubernetes context.

**--readonly**
> Read-only mode.

**--command** _RESOURCE_
> Initial resource view.

**-A**, **--all-namespaces**
> All namespaces.

**--help**
> Display help information.

# DESCRIPTION

**k9s** is a terminal UI for Kubernetes. It provides real-time cluster management with keyboard navigation.

The tool displays pods, deployments, services, and more. It supports logs, exec, and resource editing.

k9s is a Kubernetes TUI.

# CAVEATS

Requires kubeconfig. Terminal-based. Keyboard shortcuts to learn.

# HISTORY

k9s was created by **Fernand Galiana** to provide a fast, terminal-based interface for managing Kubernetes clusters.

# SEE ALSO

[kubectl](/man/kubectl)(1), [stern](/man/stern)(1), [kubectx](/man/kubectx)(1)
