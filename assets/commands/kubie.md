# TLDR

**Switch context**

```kubie ctx [context]```

**Switch namespace**

```kubie ns [namespace]```

**List contexts**

```kubie ctx```

**List namespaces**

```kubie ns```

**Spawn shell in context**

```kubie ctx [context] -n [namespace]```

**Exit kubie shell**

```exit```

# SYNOPSIS

**kubie** _command_ [_options_]

# PARAMETERS

**ctx** [_CONTEXT_]
> Switch or list contexts.

**ns** [_NAMESPACE_]
> Switch or list namespaces.

**-n** _NAMESPACE_
> Specify namespace.

**exec** _CONTEXT_ _CMD_
> Execute in context.

**--help**
> Display help information.

# DESCRIPTION

**kubie** manages Kubernetes contexts with isolated shells. Each context switch spawns a new shell.

The tool prevents context pollution. Multiple terminals can use different contexts simultaneously.

kubie manages isolated K8s contexts.

# CAVEATS

Spawns subshells. Different from kubectx approach. Rust-based.

# HISTORY

kubie was created to provide isolated context management avoiding the issues of global context switching.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubens](/man/kubens)(1)
