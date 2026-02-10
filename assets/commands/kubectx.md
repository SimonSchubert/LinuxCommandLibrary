# TAGLINE

switches between Kubernetes contexts quickly

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

**kubectx** is a utility for rapidly switching between Kubernetes contexts defined in your kubeconfig file. It provides a much faster alternative to running `kubectl config use-context` by reducing context switching to a single command, and it supports interactive fuzzy selection through fzf integration when no argument is provided.

The tool can list all available contexts, switch to a named context or toggle back to the previously active one with `-`, rename contexts, and delete them. It is particularly useful when managing multiple clusters, as it eliminates the verbose kubectl config commands that would otherwise be needed to navigate between development, staging, and production environments.

# CAVEATS

Third-party tool. Install separately. Works with kubeconfig.

# HISTORY

kubectx was created by **Ahmet Alp Balkan** to simplify Kubernetes context management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubens](/man/kubens)(1), [kubectl-config](/man/kubectl-config)(1)
