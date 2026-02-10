# TAGLINE

simplifies Docker-based development environments

# TLDR

**Start environment**

```kool start```

**Run command in service**

```kool run [service] [command]```

**Execute in running container**

```kool exec [service] [command]```

**View logs**

```kool logs [service]```

**Stop environment**

```kool stop```

**Create new project**

```kool create [preset] [project-name]```

# SYNOPSIS

**kool** _command_ [_options_]

# PARAMETERS

**start**
> Start development environment.

**stop**
> Stop environment.

**run** _SERVICE_ _CMD_
> Run command in service.

**exec** _SERVICE_ _CMD_
> Execute in running container.

**logs** _SERVICE_
> View service logs.

**create** _PRESET_ _NAME_
> Create project from preset.

**--help**
> Display help information.

# DESCRIPTION

**kool** simplifies Docker-based development environments. It wraps Docker Compose with developer-friendly commands.

The tool provides presets for common frameworks. It standardizes workflows across projects.

# CAVEATS

Requires Docker. Presets for common stacks. Wrapper around Docker Compose.

# HISTORY

kool was created to streamline Docker-based development workflows with simpler commands and framework presets.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker](/man/docker)(1), [ddev](/man/ddev)(1)
