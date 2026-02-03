# TLDR

**Create secret from file**

```docker secret create [name] [file]```

**Create secret from stdin**

```echo "[secret_value]" | docker secret create [name] -```

**List secrets**

```docker secret ls```

**Inspect a secret**

```docker secret inspect [name]```

**Remove a secret**

```docker secret rm [name]```

# SYNOPSIS

**docker** **secret** _command_ [_options_]

# SUBCOMMANDS

**create**
> Create a secret from file or STDIN.

**ls**
> List secrets.

**inspect**
> Display detailed information.

**rm**
> Remove secrets.

# DESCRIPTION

**docker secret** manages Swarm secrets, which are sensitive data like passwords, certificates, or API keys. Secrets are encrypted and only available to services that need them.

# CAVEATS

Only available in Swarm mode. Secrets cannot be updated; create a new version and rotate services.

# SEE ALSO

[docker-swarm](/man/docker-swarm)(1), [docker-service](/man/docker-service)(1)

