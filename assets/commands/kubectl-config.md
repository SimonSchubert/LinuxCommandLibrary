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

**kubectl config** manages kubeconfig files. It configures cluster access and switches between contexts.

The command handles multiple clusters and users. It modifies ~/.kube/config by default.

kubectl config manages cluster access.

# CAVEATS

Subcommand of kubectl. Modifies kubeconfig file. Consider kubectx for easier switching.

# HISTORY

kubectl config provides kubeconfig management for **Kubernetes** multi-cluster access.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubens](/man/kubens)(1)
