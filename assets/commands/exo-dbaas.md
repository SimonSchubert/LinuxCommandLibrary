# TAGLINE

Exoscale managed database service operations

# TLDR

**List database services**

```exo dbaas list```

**Create a PostgreSQL database**

```exo dbaas create pg [name] --zone [ch-gva-2] --plan [hobbyist-2]```

**Show database details**

```exo dbaas show [name] --zone [ch-gva-2]```

**Show database connection URI**

```exo dbaas show [name] --zone [ch-gva-2] --uri```

**List available database types and plans**

```exo dbaas type list [--zone ch-gva-2]```

**Delete a database**

```exo dbaas delete [name] --zone [ch-gva-2]```

**Update database settings**

```exo dbaas update [name] --zone [ch-gva-2] --plan [business-4]```

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

**type**
> List and show available database types and plans.

# PARAMETERS

**--zone** _zone_
> Exoscale zone (e.g., ch-gva-2, de-fra-1, at-vie-1).

**--plan** _plan_
> Service plan (e.g., hobbyist-2, startup-4, business-4).

**--uri**
> Show the connection URI for the database service.

**-O**, **--output-format** _FORMAT_
> Output format: table, json, text.

# DESCRIPTION

**exo dbaas** manages Exoscale Database as a Service (DBaaS). Supports PostgreSQL, MySQL, Redis, OpenSearch, Kafka, and other managed database engines.

DBaaS provides fully managed database instances with automated backups, monitoring, updates, and high availability. Services run on dedicated infrastructure with configurable performance plans.

The tool handles provisioning, configuration updates, and access credential management without manual database server administration.

# SEE ALSO

[exo](/man/exo)(1), [exo-compute](/man/exo-compute)(1), [exo-storage](/man/exo-storage)(1)

