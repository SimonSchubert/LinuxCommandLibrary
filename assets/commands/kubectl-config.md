# TAGLINE

manages kubeconfig files

# TLDR

**View config**

```kubectl config view```

**Get current context**

```kubectl config current-context```

**Set context**

```kubectl config use-context [context-name]```

**List contexts**

```kubectl config get-contexts```

**Set namespace**

```kubectl config set-context --current --namespace=[namespace]```

**Add cluster**

```kubectl config set-cluster [name] --server=[url]```

# SYNOPSIS

**kubectl config** _subcommand_ [_options_]

# PARAMETERS

**view**
> Display kubeconfig.

**current-context**
> Show current context.

**use-context** _NAME_
> Switch context.

**get-contexts**
> List contexts.

**set-context** _NAME_
> Modify context.

**set-cluster** _NAME_
> Add/modify cluster.

**--help**
> Display help information.

# DESCRIPTION

**kubectl config** manages kubeconfig files, which store the connection details, credentials, and preferences needed to interact with Kubernetes clusters. The kubeconfig file (located at ~/.kube/config by default, or specified via the KUBECONFIG environment variable) defines clusters, users, and contexts, where each context is a named combination of a cluster, a user, and an optional default namespace.

The command provides subcommands for viewing the merged configuration, switching between contexts to target different clusters, setting default namespaces, and adding or modifying cluster and user entries. This is essential for developers and operators who work with multiple Kubernetes environments such as development, staging, and production clusters.

# CAVEATS

Subcommand of kubectl. Modifies kubeconfig file. Consider kubectx for easier switching.

# HISTORY

kubectl config provides kubeconfig management for **Kubernetes** multi-cluster access.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubens](/man/kubens)(1)
