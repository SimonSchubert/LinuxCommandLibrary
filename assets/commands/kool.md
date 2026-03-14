# TAGLINE

simplifies Docker-based development environments

# TLDR

**Start environment**

```kool start```

**Stop environment**

```kool stop```

**Run command in service**

```kool run [service] [command]```

**Execute in running container**

```kool exec [service] [command]```

**View logs**

```kool logs [service]```

**Create new project from a preset**

```kool create [preset] [project-name]```

**Check running container status**

```kool status```

**Update kool to the latest version**

```kool self-update```

# SYNOPSIS

**kool** _command_ [_options_]

# PARAMETERS

**start**
> Start development environment containers.

**stop**
> Stop environment containers.

**run** _SERVICE_ _CMD_
> Run command in a service container.

**exec** _SERVICE_ _CMD_
> Execute command in a running container.

**logs** _SERVICE_
> View service logs.

**create** _PRESET_ _NAME_
> Create project from a preset (e.g. laravel, nextjs, hugo).

**status**
> Show running container status, ports, and state.

**self-update**
> Update kool to the latest version.

**preset** _NAME_
> Auto-generate config files for a framework preset.

**docker** _IMAGE_ [_CMD_]
> Helper for `docker run` with simplified options.

**--verbose**
> Increase output verbosity.

**--help**
> Display help information.

# DESCRIPTION

**kool** simplifies Docker-based development environments. It wraps Docker Compose with developer-friendly commands and provides presets for common frameworks like Laravel, Next.js, Hugo, and Express.js.

The tool standardizes workflows across projects with a `kool.yml` configuration file.

# CAVEATS

Requires Docker. Presets for common stacks. Wrapper around Docker Compose.

# HISTORY

kool was created to streamline Docker-based development workflows with simpler commands and framework presets.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [ddev](/man/ddev)(1)
