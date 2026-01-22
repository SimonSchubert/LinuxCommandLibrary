# TLDR

**List contexts**

```kubectx```

**Switch context**

```kubectx [context-name]```

**Switch to previous**

```kubectx -```

**Delete context**

```kubectx -d [context-name]```

**Rename context**

```kubectx [new-name]=[old-name]```

**Show current context**

```kubectx -c```

# SYNOPSIS

**kubectx** [_options_] [_context_]

# PARAMETERS

_CONTEXT_
> Context to switch to.

**-**
> Switch to previous context.

**-c**
> Show current context.

**-d** _NAME_
> Delete context.

**--help**
> Display help information.

# DESCRIPTION

**kubectx** switches between Kubernetes contexts quickly. It simplifies multi-cluster management.

The tool provides faster context switching than kubectl config. It supports fzf for interactive selection.

kubectx switches K8s contexts.

# CAVEATS

Third-party tool. Install separately. Works with kubeconfig.

# HISTORY

kubectx was created by **Ahmet Alp Balkan** to simplify Kubernetes context management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubens](/man/kubens)(1), [kubectl-config](/man/kubectl-config)(1)
