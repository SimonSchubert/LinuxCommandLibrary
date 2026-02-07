# TAGLINE

manage Docker daemon connection contexts

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

**docker context** manages Docker contexts, which are configuration profiles that store connection information for different Docker engines. Contexts enable seamless switching between local, remote, and cloud-based Docker hosts without manually reconfiguring connection settings.

Each context contains endpoint information, TLS certificates, and other metadata needed to communicate with a Docker daemon. This is particularly useful for developers and operators who work with multiple Docker environments, such as local development, staging servers, and production clusters.

The default context named "default" connects to the local Docker daemon via Unix socket. Additional contexts can be created to connect to remote Docker hosts over SSH, TCP, or other protocols.

# CONFIGURATION

**~/.docker/contexts**
> Directory storing context metadata and TLS certificates for custom contexts.

# SEE ALSO

[docker](/man/docker)(1), [docker-machine](/man/docker-machine)(1)
