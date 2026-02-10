# TAGLINE

switches the default Kubernetes namespace

# TLDR

**List namespaces**

```kubens```

**Switch namespace**

```kubens [namespace]```

**Switch to previous**

```kubens -```

**Show current namespace**

```kubens -c```

# SYNOPSIS

**kubens** [_options_] [_namespace_]

# PARAMETERS

_NAMESPACE_
> Namespace to switch to.

**-**
> Switch to previous namespace.

**-c**
> Show current namespace.

**--help**
> Display help information.

# DESCRIPTION

**kubens** is a utility for quickly switching the default Kubernetes namespace in the current context. It modifies the namespace field in your kubeconfig so that subsequent kubectl commands operate against the selected namespace without requiring the `-n` flag each time.

The tool lists all available namespaces when called without arguments and supports interactive fuzzy selection through fzf integration. It can also toggle back to the previously active namespace using `-`. Designed as a companion to kubectx, kubens completes the workflow for navigating multi-cluster, multi-namespace Kubernetes environments efficiently.

# CAVEATS

Third-party tool. Modifies kubeconfig. Works with kubectx.

# HISTORY

kubens was created by **Ahmet Alp Balkan** alongside kubectx for simplified Kubernetes namespace switching.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubectl-config](/man/kubectl-config)(1)
