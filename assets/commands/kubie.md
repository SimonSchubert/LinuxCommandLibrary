# TAGLINE

manages Kubernetes contexts with isolated shells

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

**Execute a command** in a specific context without spawning a shell

```kubie exec [context] [namespace] -- [kubectl get pods]```

**Show current context info**

```kubie info ctx```

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

**exec** _CONTEXT_ _NAMESPACE_ **--** _CMD_
> Execute command in context without spawning a shell.

**info** _ITEM_
> Show current context (ctx) or namespace (ns).

**--help**
> Display help information.

# DESCRIPTION

**kubie** is a Kubernetes context and namespace manager that isolates each context switch in its own shell session. Unlike kubectx, which modifies the global kubeconfig state, kubie spawns a new subshell with environment variables pointing to a temporary kubeconfig, so each terminal window can independently operate against a different cluster and namespace without interfering with others.

This isolation model prevents a common source of errors in multi-cluster workflows where a context switch in one terminal unexpectedly affects commands running in another. Kubie can also list available contexts and namespaces, execute one-off commands against a specific context, and integrates with fzf for interactive selection. It is written in Rust for fast startup and minimal overhead.

# CAVEATS

Each context switch spawns a subshell, so deeply nested switches increase shell depth. Requires kubeconfig files to be accessible. Supports fzf for interactive selection if installed.

# HISTORY

kubie was created to provide isolated context management avoiding the issues of global context switching.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectx](/man/kubectx)(1), [kubens](/man/kubens)(1)
