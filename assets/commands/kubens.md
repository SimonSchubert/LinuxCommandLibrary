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

**kubens** switches the default Kubernetes namespace. It simplifies namespace management without typing long kubectl commands.

The tool integrates with kubectx for complete cluster navigation. It supports fzf for interactive selection.

kubens switches K8s namespaces.

# CAVEATS

Third-party tool. Modifies kubeconfig. Works with kubectx.

# HISTORY

kubens was created by **Ahmet Alp Balkan** alongside kubectx for simplified Kubernetes namespace switching.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubectl-config](/man/kubectl-config)(1)
