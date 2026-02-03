# TLDR

**List database services**

```exo dbaas list```

**Create a database**

```exo dbaas create [pg] [name] --zone [ch-gva-2] --plan [startup-4]```

**Show database details**

```exo dbaas show [name] --zone [ch-gva-2]```

**Delete a database**

```exo dbaas delete [name] --zone [ch-gva-2]```

**Update database settings**

```exo dbaas update [name] --zone [ch-gva-2]```

# SYNOPSIS

**exo** **dbaas** _command_ [_options_]

# SUBCOMMANDS

**list**
> List database services.

**create**
> Create a database service.

**show**
> Show database details.

**update**
> Update database settings.

**delete**
> Delete a database.

**types**
> List available database types.

# PARAMETERS

**--zone** _zone_
> Exoscale zone.

**--plan** _plan_
> Service plan.

# DESCRIPTION

**exo dbaas** manages Exoscale Database as a Service (DBaaS). Supports PostgreSQL, MySQL, Redis, OpenSearch, and other managed database engines.

# SEE ALSO

[exo](/man/exo)(1), [exo-storage](/man/exo-storage)(1)

