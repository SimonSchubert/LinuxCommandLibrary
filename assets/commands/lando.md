# TAGLINE

provides Docker-based development environments

# TLDR

**Initialize project**

```lando init```

**Start environment**

```lando start```

**Stop environment**

```lando stop```

**Rebuild environment**

```lando rebuild```

**Run command in container**

```lando [npm|composer|php] [command]```

**SSH into container**

```lando ssh```

**View logs**

```lando logs```

# SYNOPSIS

**lando** _command_ [_options_]

# PARAMETERS

**init**
> Initialize Lando project.

**start**
> Start containers.

**stop**
> Stop containers.

**rebuild**
> Rebuild containers.

**ssh** [_SERVICE_]
> SSH into service.

**logs** [_SERVICE_]
> View logs.

**destroy**
> Remove containers.

**--help**
> Display help information.

# DESCRIPTION

**Lando** provides Docker-based development environments. It creates consistent local development setups.

The tool supports many frameworks with recipes. It handles networking, services, and tooling automatically.

# CAVEATS

Requires Docker. Memory intensive. Recipe-based configuration.

# HISTORY

Lando was created by **Tandem** to simplify Docker-based development environments for various tech stacks.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [ddev](/man/ddev)(1), [docker](/man/docker)(1)
