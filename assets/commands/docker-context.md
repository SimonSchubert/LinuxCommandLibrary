# TLDR

**List contexts**

```docker context ls```

**Show current context**

```docker context show```

**Create a new context**

```docker context create [name] --docker "host=ssh://[user@host]"```

**Switch to context**

```docker context use [name]```

**Remove a context**

```docker context rm [name]```

**Inspect context details**

```docker context inspect [name]```

# SYNOPSIS

**docker** **context** _command_ [_options_]

# SUBCOMMANDS

**ls**
> List contexts.

**show**
> Print current context.

**create**
> Create a new context.

**use**
> Set current context.

**rm**
> Remove contexts.

**inspect**
> Display detailed information.

**update**
> Update a context.

**export**
> Export a context.

**import**
> Import a context.

# DESCRIPTION

**docker context** manages Docker contexts, which store connection information for Docker engines. Contexts allow switching between different Docker hosts (local, remote, or cloud).

# SEE ALSO

[docker](/man/docker)(1), [docker-machine](/man/docker-machine)(1)
